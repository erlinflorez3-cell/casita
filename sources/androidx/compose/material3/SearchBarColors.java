package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lrA0RnP.XS2\u000fy\u0002<řa)\bّkUH|b\u001eUbwk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004yٕ\u0016\u000f@E0\\9R\u007fAG`\r63!B&F{\u001d\u0001H+X\u0014\u0005~[K:\u0017ضDpHXU^\u0013)*\u0006l01$jxf8^k\f9uݡ\u00032H\\9w0+`SZ%>\u001bvy\u001eYA̳4ՖɥR\u0002\u07baVcG\u0003MzU\u0007n.53\u001a\u000be8p\u007fB\u0016ܹNՕȗq%ػ\tYh\f54geQZ\u001c0H\u0015\n\u0011T\u0004<\u000b]L\u0005Ʈ\u001cǴ\f\u001a;ο\u0003UF[\u0010jZ\u0002\u0001nD%Ӟ\u007f<3<!ƺm\u0010:!N=\u001b̅\u00112"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%1f{#\u0014i#\fWJExBs", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2he6W,K1#\u0006\u0005k", "uI9\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "7m_Bg\rBS }Xh3\u0007\u0016=", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\t\u0013&G|\u00128}r~H}3FN\u001a.TB\u0019u;(\"v7 \rm;Uz0\u0011Q_4&V{L\u0014\u001fc\nUtk\u0005Z=4uS\u0015)\u0011:X\u000fKf\u0010\u0016#u1wvBce\u000bj", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "u(9", "\u0018", "5dc\u0011\\=BR\u0019\fXh3\u0007\u0016v0~yu&\u0006\u0007", "5dc\u0016a7Nby\u0003ze+Z\u00136o\r6:<\n !Vk\u001d@\u0001.C", "u(E", "5dc\u0016a7Nby\u0003ze+Z\u00136o\r6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn$Y\u0011/\u0018q\u00165L!Er>+#>", "3pd._:", "", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SearchBarColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long dividerColor;
    private final TextFieldColors inputFieldColors;

    @Deprecated(message = "\u0016K|Gt|TYYY;:^$C\u000epM\u0014,D|\u0014W6O|zc\tclqQpF\r]{xG]C;$WY~6]Z\t%29* -\u001dI'z\u0017\u0011~\u001b\u0002J[^\u0006\u000br.\f;J\u0015~\u000bBA;6W/@k,z\u0005#~6P)e\u0013*T\u001fAWQ)-NLy:\u001d/FGZ+\u000b%$Tx2w3pH,e\u000e\t;hN'Pfi\u001d\u001fa\u000b9\u000fU\n{X#;:\u007fyVk 0\u0011.z\u0011w'DmR\"}v\u001bO[M{].l-^vJI\u001fJ@V\f1a\u000b47R_\u0015pdHh\u0004l=")
    @InterfaceC1492Gx
    public /* synthetic */ SearchBarColors(long j2, long j3, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, textFieldColors);
    }

    public /* synthetic */ SearchBarColors(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    @Deprecated(message = "\u0016K|Gt|TYYY;:^$C\u000epM\u0014,D|\u0014W6O|zc\tclqQpF\r]{xG]C;$WY~6]Z\t%29* -\u001dI'z\u0017\u0011~\u001b\u0002J[^\u0006\u000br.\f;J\u0015~\u000bBA;6W/@k,z\u0005#~6P)e\u0013*T\u001fAWQ)-NLy:\u001d/FGZ+\u000b%$Tx2w3pH,e\u000e\t;hN'Pfi\u001d\u001fa\u000bJ\fd\u0002\tX7h\u0012q|V\u001fb3K\u0001m\u0019y.3l\u000ek\u0003(\\\u000e\"\\z^+_g5eWJ\u0015P?\b[(\u001b_(4\r,\u0012it7y\u000b!")
    @InterfaceC1492Gx
    public static /* synthetic */ void getInputFieldColors$annotations() {
    }

    private SearchBarColors(long j2, long j3, TextFieldColors textFieldColors) {
        this.containerColor = j2;
        this.dividerColor = j3;
        this.inputFieldColors = textFieldColors;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2430getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m2431getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    private SearchBarColors(long j2, long j3) {
        this(j2, j3, SearchBar_androidKt.UnspecifiedTextFieldColors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarColors)) {
            return false;
        }
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, searchBarColors.containerColor) && Color.m4179equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && Intrinsics.areEqual(this.inputFieldColors, searchBarColors.inputFieldColors);
    }

    public int hashCode() {
        return (((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.dividerColor)) * 31) + this.inputFieldColors.hashCode();
    }
}
