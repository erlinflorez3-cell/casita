package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007llA0ZeP.XY0ơk\u0012éT[Rp{;d*>'\u000fOɁkg|J#\u0019Q\u0010\u001e\u0016'l\\O[xk\u0015'2ps\bA[tU9\u000fvf\u000b&20>\u0012\u0005/\u001erV\u001e}\u0013Cy\u000eB6FpHU%M3\u001eZ\u0014L(\u0019\u001e\u000bp~<Nlk=G#1m\u000b\\5iH|{\u0016vZ-\r\u0005g6+n;}#3^\u001b\u0007\u0001do\tEqK\u000b\u0001'U/\u0012\u0002eBp\u007fB\u001e[U\u0013]\u0001)t\u0005\u007fdT59\\{K~\u0010X}\u0001{\u001b?\u001c\u000e4+\u0011<;(~\b<5%xY@^\bvB.~ˑ:("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u00109", "", "u(E", "0ncAb4-]t\bxa6\nw9p", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u001dN\u00046KJJ32", "=eU@X;", "", "0ncAb4-]\u000b\u0003\u0004]6\u000fe9t\u000f2\u0004", ";`a4\\5", "1d]AX9-]t\bxa6\nw9p", "3mS!b\bGQ\u001c\t\b>5{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u000fX\u0004+\\VW;XYH", ":dUAG60W\"}\u0005p\u0013|\n>", "@hV5g\u001bHE\u001d\byh>i\r1h\u000f", "AsP?g\u001bH/\"|}h9j\u0018+r\u000f", "Bn_!b\bGQ\u001c\t\b;6\f\u00189m", "Bn_!b\u001eB\\\u0018\t\rM6\b", "\u0016na6m6Gb\u0015\u0006", "$daA\\*:Z", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MenuPosition {
    public static final int $stable = 0;
    public static final MenuPosition INSTANCE = new MenuPosition();

    /* JADX INFO: compiled from: MenuPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq|:ǁӌ#\bّkUH|j9]N\u007fg\u001dK\u000b\u000fQ\u0011\u001e\u0016'm\\Mc|u\u0012=7rsM9eok:\u0011xD\f82P@@)҈\u0019ݒН\u0014x\u0001LY\u0016ݮ/?\u0084:]\u0015P\u000bܧ.4=(\u0003${\u0016MɍLwӘ>."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u000fX\u0004+\\VW;XYH", "", ">nb6g0H\\", "", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";d]BJ0=b\u001c", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">nb6g0H\\`RJD;gu\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rRy\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Rul[vL]xV\"X;\u001cc]N$lS;)\u0011\u0002\re", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Horizontal {
        /* JADX INFO: renamed from: position-95KtPRI */
        int mo2909position95KtPRI(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection);
    }

    /* JADX INFO: compiled from: MenuPosition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007|jA0JgNôɠR@ş\u001c{b#$L\u007fCSUH~R\r]P\u007fg\u001dM\u000b\u000fQ\u0013\u001e\u0016'o\\Mc~u\u0012=3\t\u0014ѹ2ݹڱA;f{D\r܌1!\u0603y\u0010\t\u001d0М,%yKM\u00121^?ª>[ӉQ\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u001dN\u00046KJJ32", "", ">nb6g0H\\", "", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";d]B;,BU\u001c\u000e", ">nb6g0H\\`ckm\u0012Hv}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rRyq1", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Vertical {
        /* JADX INFO: renamed from: position-JVtK1S4 */
        int mo2910positionJVtK1S4(IntRect intRect, long j2, int i2);
    }

    private MenuPosition() {
    }

    public static /* synthetic */ Horizontal startToAnchorStart$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        return menuPosition.startToAnchorStart(i2);
    }

    public final Horizontal startToAnchorStart(int i2) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getStart(), Alignment.Companion.getStart(), i2);
    }

    public static /* synthetic */ Horizontal endToAnchorEnd$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        return menuPosition.endToAnchorEnd(i2);
    }

    public final Horizontal endToAnchorEnd(int i2) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getEnd(), Alignment.Companion.getEnd(), i2);
    }

    public static /* synthetic */ Horizontal leftToWindowLeft$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = 0;
        }
        return menuPosition.leftToWindowLeft(i2);
    }

    public final Horizontal leftToWindowLeft(int i2) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getLeft(), i2);
    }

    public static /* synthetic */ Horizontal rightToWindowRight$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.rightToWindowRight(i2);
    }

    public final Horizontal rightToWindowRight(int i2) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getRight(), i2);
    }

    public static /* synthetic */ Vertical topToAnchorBottom$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.topToAnchorBottom(i2);
    }

    public final Vertical topToAnchorBottom(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getTop(), Alignment.Companion.getBottom(), i2);
    }

    public static /* synthetic */ Vertical bottomToAnchorTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.bottomToAnchorTop(i2);
    }

    public final Vertical bottomToAnchorTop(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getBottom(), Alignment.Companion.getTop(), i2);
    }

    public static /* synthetic */ Vertical centerToAnchorTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = 0;
        }
        return menuPosition.centerToAnchorTop(i2);
    }

    public final Vertical centerToAnchorTop(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getCenterVertically(), Alignment.Companion.getTop(), i2);
    }

    public static /* synthetic */ Vertical topToWindowTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        return menuPosition.topToWindowTop(i2);
    }

    public final Vertical topToWindowTop(int i2) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getTop(), i2);
    }

    public static /* synthetic */ Vertical bottomToWindowBottom$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.bottomToWindowBottom(i2);
    }

    public final Vertical bottomToWindowBottom(int i2) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getBottom(), i2);
    }
}
