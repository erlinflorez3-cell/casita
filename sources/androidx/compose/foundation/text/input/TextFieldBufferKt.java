package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: TextFieldBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!,i\bӵLc\u0003\u000fI\u00066\u000b6B\u0015\"4\u0012\u0006\rnjO0LeN2ZS@\u000fs{:%c$\bCC٥\"}8\tWN}gvJ`\u000fK\u000f\u0014\"\u0001j2Jmrk܈'2pno7[oU9\u000fuf\t.4:8(\u00061x8K(Q\u000bT[\u001b@5ϮtDX\u0013]\u000b \u0019\u0016@&\u0007Ddw_FW\u001bbƠ3-\toRT-f@~S\u0013l]7\u001e\u0007pL0Ë;?\u001b+c\t\rYkA\tE\u0018G\u0015y76YNָ[@^\u0006$\u001b1V\u001d_x,\u0003\u0010ab\u001c'YN\u0012O\u0017ʬ.\u0010\u0013\n\u0019T\u0004<\u0005OH\\:Jj\u0016\u001cKt!XpT\u0010mZ\u007f)fNZ3\u0010K+g\u001a\u000fQ\u0010LI\u0003E\u000e\u001d=.4\u0011}Ooڍ\u0012j\u001b!d}W8aBCNt\u001fiN}\u0013\u001fv͆.\u000e6M\u00105\u0002\u0018>\u0019+=\u0002O3#{\u0002vC\u0016\nK£nk-`_X\"\u001d\u0015_*7\u001d\u000bxr\u0017\u0004\u0001di< {0Τ\u000b\b\u000e\u00190b}C1'\u0016Tu}y{]l89çjA_t{\u0014]@n5;W\n&qT\u0007\u0014m;\u0011\u0018\u001fٰHk$ht@\"`G\u0013\u0010&\ttR\u001a,J? !d0?3t\u0015v\u001e6JO\u0019!_\tg8~\u0003@<\u000bwA\r\t/O\u0005p\u001et֗MJ"}, d2 = {"4h]166F[#\bek,}\rBA\t'iP\u0002\u0018\u001bZ", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE, "=m5<h5=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/Oa2Y0QA(z\bm", "/Rd3Y0QA(z\bm", "0Oa2Y0QA(z\bm", "0Rd3Y0QA(z\bm", "2d[2g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\"", "AsP?g", "3mS", "4na\u0012T*A1\u001cz\u0004`,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\u000b,/X[t=z\u0016h\u001d$", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "@`]4X", "=qX4\\5:Z\u0006z\u0004`,", "4na\u0012T*A1\u001cz\u0004`,i\t@e\r6{?", "7mb2e;", "7mS2k", "BdgA", "", ">kP0X\nN`'\t\b:;\\\u0012.", "Ad[2V;\u001aZ ", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldBufferKt {
    public static final void insert(TextFieldBuffer textFieldBuffer, int i2, String str) {
        textFieldBuffer.replace(i2, i2, str);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.replace(i2, i3, "");
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m1441setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int i2 = 0; i2 < changeList.getChangeCount(); i2++) {
            function2.invoke(TextRange.m6111boximpl(changeList.mo1444getRangejx7JFs(i2)), TextRange.m6111boximpl(changeList.mo1443getOriginalRangejx7JFs(i2)));
        }
    }

    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            function2.invoke(TextRange.m6111boximpl(changeList.mo1444getRangejx7JFs(changeCount)), TextRange.m6111boximpl(changeList.mo1443getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        int i2;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i3 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i2 = 0;
        } else {
            int i4 = 0;
            i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i3 == 0) {
                    if (charSequence.charAt(i4) == charSequence2.charAt(i2)) {
                        i4++;
                        i2++;
                    } else {
                        i3 = 1;
                    }
                }
                if (!z2) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z2 = true;
                    }
                }
                if (i4 >= length || i2 >= length2 || (i3 != 0 && z2)) {
                    break;
                }
            }
            i3 = i4;
        }
        if (i3 < length || i2 < length2) {
            function4.invoke(Integer.valueOf(i3), Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(length2));
        }
    }
}
