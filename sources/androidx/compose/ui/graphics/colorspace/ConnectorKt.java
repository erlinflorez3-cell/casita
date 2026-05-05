package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bDZc|\u0004G\u00078\u000b<H\u0007\"2\u0013\u007f\u0007|jA0Jf`W`VB\u000f\u001a\u007fd(i)\nCiYJ\u00020\u000fgN\u0016k\u001fNh\u0012[\u000f4\u001e?̔2רTތٕ\u0016\u00118K}ISe}މQf\u00058\u0015 `\"fx[А\u001cݵL\u0016~ٙ[M\u0012\u0013>B\u0084:W\u0015P\u000bܧ.4=ő\u0005)"}, d2 = {"\u0011n];X*M]&\r", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011p\u0002", "5dc\u0010b5GS\u0017\u000e\u0005k:", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%\u0019b\r\n4r\u0016,\\+7v\n", "1n];X*M]&dzr", "", "AqR", "2rc", "@d]1X9\"\\(~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X4'\u0014hn\u001d\u0010r,W\u0006|", "1n];X*M]&dzrspe\rOn\"J", "uH8\u0016\u001c\u0010", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ConnectorKt {
    private static final MutableIntObjectMap<Connector> Connectors;

    /* JADX INFO: renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m4604connectorKeyYBCOT_4(int i2, int i3, int i4) {
        return (-1) - (((-1) - (i2 | (i3 << 6))) & ((-1) - (i4 << 12)));
    }

    public static final MutableIntObjectMap<Connector> getConnectors() {
        return Connectors;
    }

    static {
        int id$ui_graphics_release = ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release();
        int id$ui_graphics_release2 = ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release();
        int i2 = id$ui_graphics_release | (id$ui_graphics_release2 << 6);
        int iM4613getPerceptualuksYyKA = RenderIntent.Companion.m4613getPerceptualuksYyKA() << 12;
        int i3 = (i2 + iM4613getPerceptualuksYyKA) - (i2 & iM4613getPerceptualuksYyKA);
        Connector connectorIdentity$ui_graphics_release = Connector.Companion.identity$ui_graphics_release(ColorSpaces.INSTANCE.getSrgb());
        int id$ui_graphics_release3 = ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release();
        int id$ui_graphics_release4 = ColorSpaces.INSTANCE.getOklab().getId$ui_graphics_release();
        int i4 = id$ui_graphics_release3 | (id$ui_graphics_release4 << 6);
        int iM4613getPerceptualuksYyKA2 = RenderIntent.Companion.m4613getPerceptualuksYyKA() << 12;
        Connector connector = new Connector(ColorSpaces.INSTANCE.getSrgb(), ColorSpaces.INSTANCE.getOklab(), RenderIntent.Companion.m4613getPerceptualuksYyKA(), null);
        int id$ui_graphics_release5 = ColorSpaces.INSTANCE.getOklab().getId$ui_graphics_release();
        int id$ui_graphics_release6 = ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release();
        int i5 = id$ui_graphics_release6 << 6;
        int i6 = (id$ui_graphics_release5 + i5) - (id$ui_graphics_release5 & i5);
        Connectors = IntObjectMapKt.mutableIntObjectMapOf(i3, connectorIdentity$ui_graphics_release, (i4 + iM4613getPerceptualuksYyKA2) - (i4 & iM4613getPerceptualuksYyKA2), connector, (-1) - (((-1) - i6) & ((-1) - (RenderIntent.Companion.m4613getPerceptualuksYyKA() << 12))), new Connector(ColorSpaces.INSTANCE.getOklab(), ColorSpaces.INSTANCE.getSrgb(), RenderIntent.Companion.m4613getPerceptualuksYyKA(), null));
    }
}
