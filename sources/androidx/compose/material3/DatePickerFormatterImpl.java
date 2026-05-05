package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
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
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0007\":5\u007f\u0007tʑA0JhP.`\\2\u000fq|<$i+yّCU0}*\teNogtNb\u000bQ\u0015\u000eǝ~kBկ\u0006x\f\u0011OMRsM3eok:pxD\u000782P9\n\t\u000f\u001dBH>wټGK\u001a\u0016xQ~Fj\r{\u0012J\u0018\u0014L8\u00034[\u0016U|Զl&e=2\u001bkXMU``\u0003[\u001d^V=\f%rN3NIM\u0019Sfk\u00071oo\u0007M\u0007U\u0005\u00174m?ʁwWDnH7#Bg\u000fsqT]5Wn$?-ebya>0\u0006\r\u0014\u0011j\u0017v\u0006\u0006\\tAբj\b\u001cL=xaZh\u0002\r]F\u000f2N%*\u0018?;;+f\u007fbK\u001b^7*\f;$yЪpĲ_T\u0016֫e*bzi1\u007fAףLT\u0012ԯUo\nxp\u000bz\u0013>I\u0018/*\u0012ѧ\u001b+?كQ%'u\u0010Q\u0015v\u0005\u0005xh\u0002jʐLF*Â.90\u0014\u001ac֎h!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u001d\u000fn3$", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", "GdP?F,ES\u0017\u000e~h5j\u000f/l\u007f7\u0006I", "", "Ad[2V;>Rwz\n^\u001a\u0003\t6e\u000f2\u0005", "Ad[2V;>Rwz\n^\u000b|\u0017-r\u00043\u000bD\u000b \u0005Mo\u0015<\u0006/>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "4na:T;MS&\\v\\/|", "", "", "5dc X3>Q(~y=(\f\t\u000ee\u000e&\tD\f&\u001bQx{Bv,5h\b)", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc X3>Q(~y=(\f\t\u001dk\u007f/{O\u000b ", "5dc&X(KA\u0019\u0006z\\;\u0001\u00138S\u0006(\u0003@\u0010! ", "3pd._:", "", "=sW2e", "4na:T;\u001dO(~", "2`c2@0EZ\u001d\r", "", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "4na\u0010b5MS\"\u000eY^:z\u00163p\u000f,\u0006I", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`'Vs\u0015\u0006]/3U\u0005 \rbY\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d", "4na:T;&]\"\u000e}R,x\u0016", ";n]A[\u0014BZ \u0003\t", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`'Vs\u0015\u0006]/3U\u0005 \r1|3IT75;\u001a\u001ej+'\u0016p0Wx|", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DatePickerFormatterImpl implements DatePickerFormatter {
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final String selectedDateDescriptionSkeleton;
    private final String selectedDateSkeleton;
    private final String yearSelectionSkeleton;

    public DatePickerFormatterImpl(String str, String str2, String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatMonthYear(Long l2, Locale locale) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(l2.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatDate(Long l2, Locale locale, boolean z2) {
        String str;
        if (l2 == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        if (z2) {
            str = this.selectedDateDescriptionSkeleton;
        } else {
            str = this.selectedDateSkeleton;
        }
        return CalendarModel_androidKt.formatWithSkeleton(jLongValue, str, locale, this.formatterCache);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) obj;
        return Intrinsics.areEqual(this.yearSelectionSkeleton, datePickerFormatterImpl.yearSelectionSkeleton) && Intrinsics.areEqual(this.selectedDateSkeleton, datePickerFormatterImpl.selectedDateSkeleton) && Intrinsics.areEqual(this.selectedDateDescriptionSkeleton, datePickerFormatterImpl.selectedDateDescriptionSkeleton);
    }

    public int hashCode() {
        return (((this.yearSelectionSkeleton.hashCode() * 31) + this.selectedDateSkeleton.hashCode()) * 31) + this.selectedDateDescriptionSkeleton.hashCode();
    }
}
