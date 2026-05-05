package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TransferableContent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\r+4\u0012}\u0007njO0L͜P.`_2\u000f\u0002{<řsD\u007fّSW0|P\bwN\u0016f\u001fZh\u000b[\u001b\u0016\u0018\tjZKezm\u0012=5pp\u00068e\u0002K=xtd\bH2P7*\t\u000f\u001fBH>|AHc\u0018 7XrPQ;U-\u001a@\u000f\u0005ĨӞ\"f"}, d2 = {"1n]@h4>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[$", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK_\u0013&C.qKv-\u000b", "", "6`b\u001aX+BO\b\u0013\u0006^", ";dS6T\u001bR^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u0016MB?g#2 h7", "@dP1C3:W\"mzq;", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u0017v%;a\u0019", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransferableContent_androidKt {
    public static final TransferableContent consume(TransferableContent transferableContent, Function1<? super ClipData.Item, Boolean> function1) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() == 1) {
            if (function1.invoke(clipData.getItemAt(0)).booleanValue()) {
                return null;
            }
            return transferableContent;
        }
        int itemCount = clipData.getItemCount();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < itemCount; i2++) {
            ClipData.Item itemAt = clipData.getItemAt(i2);
            if (!function1.invoke(itemAt).booleanValue()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return null;
        }
        if (arrayList.size() == clipData.getItemCount()) {
            return transferableContent;
        }
        ClipDescription clipDescription = new ClipDescription(transferableContent.getClipMetadata().getClipDescription());
        ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) CollectionsKt.first((List) arrayList));
        int size = arrayList.size();
        for (int i3 = 1; i3 < size; i3++) {
            clipData2.addItem((ClipData.Item) arrayList.get(i3));
        }
        return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.m665getSourcekB6V9T0(), transferableContent.getPlatformTransferableContent(), null);
    }

    public static final boolean hasMediaType(TransferableContent transferableContent, MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    public static final String readPlainText(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount; i2++) {
            z2 = z2 || clipEntry.getClipData().getItemAt(i2).getText() != null;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipEntry.getClipData().getItemCount();
            boolean z3 = false;
            for (int i3 = 0; i3 < itemCount2; i3++) {
                CharSequence text = clipEntry.getClipData().getItemAt(i3).getText();
                if (text != null) {
                    if (z3) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z3 = true;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        return null;
    }
}
