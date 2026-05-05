package androidx.compose.ui.res;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Arrays;
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
/* JADX INFO: compiled from: StringResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,u\bӵLc\u0003\nI\u00066\f6B\r14\u0012\u0006јnj?5\\\u0003V\u008cjSX\u000e\u001c\u0002:#i$\nCiVJ\u00020\u000bgN\u0016h5OҼ\u000fC\u001d\t.*xߚaU'\\B\u00158A}?KM\u001e>id\u00038\u001d `#h\n\u0013\u000522X\u0014|ySK:\u0018^E\u0011:\u0001\u0013\u0014\nܨ\u0016\u0006L'\u00199jof<Xnm:]\"1nrT-^>|e\rtUm\u0012țe\u001e9IOJ#/k\u00035Q\fE\t>\u007f=\u001dhU(qNָ[6f\u000b,>9Y%]!%\r\u000bW_\u001a'CO\u0012L\u0001\u001e6{\u0013\u0004\u001d@\n\r\u0016'v4[\u001f\u0007\b<9;wՂDP\u0010j۶\u0004\b"}, d2 = {">kd?T3,b&\u0003\u0004`\u0019|\u00179u\r&{", "", "7c", "", "1nd;g", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041\u0007\"p0/\u00112h5\u0010eu<\u00064KUP\u0002", "4na:T;\u001a`\u001b\r", "", "", "uH8(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003dm4Y\u00015GY$\u0010 9w9%\u000e$\u0015J4\u000fNGP1rM9t", "Asa6a.\u001a`&z\u000fK,\u000b\u0013?r}(", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u00119\"p0/\u00112h5\u0010eu<\u00064KUP\u0002", "Asa6a.+S'\t\u000bk*|", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "uHJ\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+\u0017\u0011k7X\u0005'T\"2oCWnN\u0010[a\nW-VrhN(wF\r", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StringResources_androidKt {
    public static final String stringResource(int i2, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1223887937, "C(stringResource)33@1088L11:StringResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return string;
    }

    public static final String stringResource(int i2, Object[] objArr, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 2071230100, "C(stringResource)P(1)47@1452L11:StringResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i2, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return string;
    }

    public static final String[] stringArrayResource(int i2, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1562162650, "C(stringArrayResource)60@1758L11:StringResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, i3, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = Resources_androidKt.resources(composer, 0).getStringArray(i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stringArray;
    }

    public static final String pluralStringResource(int i2, int i3, Composer composer, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1784741530, "C(pluralStringResource)P(1)74@2102L11:StringResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784741530, i4, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i2, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return quantityString;
    }

    public static final String pluralStringResource(int i2, int i3, Object[] objArr, Composer composer, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 523207213, "C(pluralStringResource)P(2)89@2568L11:StringResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523207213, i4, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i2, i3, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return quantityString;
    }
}
