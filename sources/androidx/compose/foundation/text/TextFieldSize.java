package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: TextFieldSize.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u001cs{J$c$wPCU(}*ޛUN}˧\u001fJ\t\n\u0004:\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6]sK=xtd\n060>\u0012\u0005/!:L\u001e~\u0013Cy\u000bܘ4@~C\u001b [)2\u00124Uf\u0001ʟ[f¦5ԟǰa<5H\u0011\u0004\u000bz5\u0006H|{4vX5\r\u000faL,p;C\u0017=S1\n\u0003_M\u0007Wqk\n\u0019+51as\u0006=\t\u0004\"\u001dCO;\\C>j\u0007i`:*\u0002ՙoׂT\u001a0»\u0013}\u0013F\u0012\u0019&)N:;'7 \u001c7\rr\u0002E'أj۰\u0004\u0007iا/'\u0006A9H;hWqI*\u001fO\n\u0005%\u001eQ\u0002EĖgڍ\u0012l\u001dÑlyWC_S]JT\u001egR>(~z\u001a*2Gw\u0004=\u0012).E<u\u001c\u0010\u0601-ɶ\u0001҆جfuݶdp[i`cX$t/EDY$hJ|\u0005\u001aW+З8ҭQ(\\͵\u0016\n\u0019<j\u0015\\#+.\\n9\u0002xUu\nS.=Ƅeˇo\u001a_ުv5;qq1\u0002T|6M_ϸ\u0005anEY۰v\u000b'*2N\nށ{$"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3\f\u0019}a\u000f", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "@db<_=>R\u0007\u000e\u000fe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "Bx_2Y(<S", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[j\u0017R:VcYJ2rSKtn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b8hYh)zQJT,\u000bn\u0015n}XB>+(0\u0006\u001bvZ5\u001b{`fYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+hZ{\u000b!{Gt>\u0004\u001b\u0013H16:kPc):(\u007f\u00115^\u000b\u0011#;<\u0011N!'f", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "Adc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007fr\u000b\u0015vk@\u0018c9$:\u0018", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";h] \\A>", "5dc\u001a\\5,W.~BR)\u0011\u0011\u00162\u0002", "u(9", "\u0018", "5dc\u001fX:HZ*~yL;\u0011\u0010/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "Adc\u001fX:HZ*~yL;\u0011\u0010/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mkq>", "5dc!l7>T\u0015|z", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc!l7>T\u0015|z", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1n\\=h;>;\u001d\bhbA|", "1n\\=h;>;\u001d\bhbA|P#b\u00140b\r\u0003", "CoS.g,", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class TextFieldSize {
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection layoutDirection;
    private long minSize = m1422computeMinSizeYbymL2g();
    private TextStyle resolvedStyle;
    private Object typeface;

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity(Density density) {
        this.density = density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    public final void setResolvedStyle(TextStyle textStyle) {
        this.resolvedStyle = textStyle;
    }

    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setTypeface(Object obj) {
        this.typeface = obj;
    }

    /* JADX INFO: renamed from: getMinSize-YbymL2g, reason: not valid java name */
    public final long m1423getMinSizeYbymL2g() {
        return this.minSize;
    }

    public final void update(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        if (layoutDirection == this.layoutDirection && Intrinsics.areEqual(density, this.density) && Intrinsics.areEqual(resolver, this.fontFamilyResolver) && Intrinsics.areEqual(textStyle, this.resolvedStyle) && Intrinsics.areEqual(obj, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
        this.minSize = m1422computeMinSizeYbymL2g();
    }

    /* JADX INFO: renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m1422computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }
}
