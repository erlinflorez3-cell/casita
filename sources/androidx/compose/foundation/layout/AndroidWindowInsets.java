package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
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
/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r.4\u0012}\u0007njO0LeN3ZS8\u0018s{:+c$\u007fّCU }*\teNogtJb\u000bY\u000f\u000e\u0016~m4Icxe܈\u00172XoG3SpC8vҚf\u0005N1bK\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsĐV\r[\tb#\u0014T8\u0001Lj\u0018TD_\u0005_P.Q\u001b0ŀNom>\u0016e\rtUW\u0011\u0005{6+nR{)mi\u0011#j[m\u0004ouK\u001f\u0001'UFyweSp\u007fB3qcUs\u0001Et\u0005\u007fa<+9i{K~)X{\t\u0019%<2,L;\u0011<;:~\b<4%vaZh\u0002\r]F\u000f*<%F\u00183Y:az\u001agI;f7*\bS2k\u001c|DsT<\u0005E\u001fb\u001di1\u007ffmL\\1q=\u001c\u00057ç͆.\u00046oPX\n\u0018F\u0017S=\f=1&\u0004\u0002vJ\u001e5C\u001f?׆֮R͕D2v\u0018=6\u0017\u0019rFj\ryYtZ2\u001b['%0\f\u0017+ \u000b\u0006l%3\u0015fO\u0017w!\u0012\u001cJ{ËϘ7֍r{\u0016Y?qABie\u0016p`\u00074ABs\u0013j7Na\u000er\\V%\tʎlݻ{{L\u0088\\%@?\n\u001cb-\bǊ^ČL\t&ՓY~\u000fsh}ʖ\u0003}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3\u0010\u0019q`C\u0019G5\\v6U\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "Bx_2", "", "<`\\2", "", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh9|R1r{3~D~%`+x\u001c<\u00063\u000b", "7mb2g:", "5dc\u0016a:>b'={h<\u0006\b+t\u00042\u0005:\b\u0013+Q\u007f\u001d6\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0016//\u00025wK\u0004\u001b\u0015U9qE\u0005%DgS", "Adc\u0016a:>b'={h<\u0006\b+t\u00042\u0005:\b\u0013+Q\u007f\u001d6\u0004%<Yy.7", "uKP;W9HW\u0018\u0012D\\6\n\txg\r$\u0007C\u0005\u0015%\u0011S\u0017Jv4C/A\u0011", "7mb2g:|R\u0019\u0006z`(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "", "7rE6f0;Z\u0019", "u(I", "Adc#\\:BP ~", "uY\u0018#", "7rE6f0;Z\u0019=y^3|\u000b+t\u007f", "5dc!l7>\u0012\u001a\t\u000bg+x\u00183o\t\"\u0003<\u0015!'Vi\u001b<}%1g}", "u(8", "3pd._:", "=sW2e", "", "5dc\u000fb;M]!", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0019X-M", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u001f\\.Ab", "5dc!b7", "6`b566=S", "BnBAe0GU", "CoS.g,", "", "Eh]1b>\"\\'~\nl\n\u0007\u0011:a\u000f", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "Bx_2@(LY", "CoS.g,|T#\u000f\u0004](\f\r9ny/wT\u000b'&A|\u000eCv!CY", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i2, String str) {
        this.type = i2;
        this.name = str;
    }

    public final int getType$foundation_layout_release() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets$delegate.getValue();
    }

    public final void setInsets$foundation_layout_release(Insets insets) {
        this.insets$delegate.setValue(insets);
    }

    private final void setVisible(boolean z2) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getInsets$foundation_layout_release().top;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getInsets$foundation_layout_release().bottom;
    }

    public final void update$foundation_layout_release(WindowInsetsCompat windowInsetsCompat, int i2) {
        if (i2 == 0 || (i2 & this.type) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) obj).type;
    }

    public int hashCode() {
        return this.type;
    }

    public String toString() {
        return this.name + '(' + getInsets$foundation_layout_release().left + ", " + getInsets$foundation_layout_release().top + ", " + getInsets$foundation_layout_release().right + ", " + getInsets$foundation_layout_release().bottom + ')';
    }
}
