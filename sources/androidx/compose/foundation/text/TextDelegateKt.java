package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!4i\bDJc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\bCC٥\"}0\u000fWNmgvJh)K\u000f\u001c\u0016\u0001jBI]xc\u0013\u00172PtG\u074cedKʠxtd\u0004P608\u0012\u0005/\u0019ZL\u001ew\u0013Cy\u000eB4NsRR;Q5\u001e \u000bV /$\rk\\=`l\fB_)\tiPW?_^\u0007}\u0013LT5\u0018\u000faL7p=;\u00153`\u001b\u0007\u0001io\tEqK\u0014\u0001'U9y\u0004eFp\f$\u001d;U\u001d_\u0003&\u000b\u0018\u007fr:8qՒԣJִˎ,y\u0001\u0010\u001bQ\u001c\u0018\u0014=`.[(\u000f\b<J;ɁԢ@U\naHȷ\u0017\u00105ж)\u0018"}, d2 = {"CoS.g,-S,\u000eY^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,CBk6\u001a$h7", "1ta?X5M", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "AnUAJ9:^", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "CoS.g,-S,\u000eY^3|\u000b+t\u007fo\tHK\u007fi%K", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001\\\u0016A\\\";r4 \u0011wa\u000fm_5M\u00041KKauZ\\zH\u001e ZW^/V\u0014YT38 @(\u0012;E\u0011;gn\u001b#\u0012>lF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u0004\u0013\u0014\u0005(\twd5\nQ:\r{Q\u0007qkF,D6.FxeTE9e@>7(O\u000bAp2a\u0003/\u0004AY\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fL\u0017\tZc\t{\b\u000fr(pQnl>@yamgO#EJ\u0017i?hp\u0001D(z\"-S{,B\u0010>%\n$\r\u000emTiWRp\u0018g\u0016yC/i\u0015\u0002\u00160\u0016&6!Gg\u000f2+iGV\u0012\u0005w<\u0016\u0005#R\u0015\u0004WY\\K\u0006j6o+6z\rX!\t", "1dX9G6\"\\(i\u000e", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    /* JADX INFO: renamed from: updateTextDelegate-rm0N8CA$default */
    public static /* synthetic */ TextDelegate m1394updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z2, int i2, int i3, int i4, List list, int i5, Object obj) {
        int i6 = i3;
        int iM6576getClipgIe3tQ8 = i2;
        boolean z3 = z2;
        if ((i5 + 32) - (i5 | 32) != 0) {
            z3 = true;
        }
        if ((i5 + 64) - (i5 | 64) != 0) {
            iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
        }
        if ((i5 & 128) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return m1393updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z3, iM6576getClipgIe3tQ8, i6, (i5 + 256) - (i5 | 256) == 0 ? i4 : 1, list);
    }

    /* JADX INFO: renamed from: updateTextDelegate-rm0N8CA */
    public static final TextDelegate m1393updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z2, int i2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list) {
        return (Intrinsics.areEqual(textDelegate.getText(), annotatedString) && Intrinsics.areEqual(textDelegate.getStyle(), textStyle) && textDelegate.getSoftWrap() == z2 && TextOverflow.m6569equalsimpl0(textDelegate.m1391getOverflowgIe3tQ8(), i2) && textDelegate.getMaxLines() == i3 && textDelegate.getMinLines() == i4 && Intrinsics.areEqual(textDelegate.getDensity(), density) && Intrinsics.areEqual(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) ? textDelegate : new TextDelegate(annotatedString, textStyle, i3, i4, z2, i2, density, resolver, list, null);
    }
}
