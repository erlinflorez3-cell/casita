package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\":\u0019\u007f\u0007lmA0ZeP.XY2\u000f\u0002{<$a%w)Q٥J}P\b jug\u0007J\t\f\u001aǋ\u0012ɖw̓ÒHTޯa\u001c'4HqM6mqC=ny\u0007\u001b.8:8(\fWʄ6Н\u0014\u0001\u0013EQ\u0014 9`r@\\\u001bXU* \u0012V /+3ʈPɇLpu<51\u0011x\u0013h5oH~c\ft[]qMҔ*ҋDAM\u0017+d\u0011\u0019r]E\u0016M\u0006\u000e\u0015v<?+w\n.͓Zÿ\u0018\u0019CQ\u0013t\u0001>ڑ\u0004Qӣ\f63Riׁl<'\u007fz\u0002,D\u0006\u0014%UGͼ13Ȓ\f\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;;R7z4s", "", "2hb=_(R;#}z", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "5dc\u0011\\:IZ\u0015\u0013bh+|P4F\u0007oJQK", "u(8", "Adc\u0011\\:IZ\u0015\u0013bh+|P@C\t\n\u00053\u0003", "uH\u0018#", "2hb=_(RS\u0018f\u0005g;\u007fp3l\u0007,\n", "", "5dc\u0011\\:IZ\u0015\u0013z]\u0014\u0007\u0012>hg,\u0003G\u0005%", "u(9", "Adc\u0011\\:IZ\u0015\u0013z]\u0014\u0007\u0012>hg,\u0003G\u0005%", "uI\u0018#", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", "5dc X3>Q(zwe,[\u0005>e\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#Y\u0005 5|\u0012+TC\u001agC\u001e#>", "Ad[2V;>Rwz\n^\u0014\u0001\u00106i\u000e", "5dc X3>Q(~y=(\f\t\u0017i\u0007/\u007fN", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc X3>Q(~y=(\f\t\u0017i\u0007/\u007fN", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc&X(K@\u0015\b|^", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DatePickerState {
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo2054getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    SelectableDates getSelectableDates();

    Long getSelectedDateMillis();

    IntRange getYearRange();

    /* JADX INFO: renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo2055setDisplayModevCnGnXg(int i2);

    void setDisplayedMonthMillis(long j2);

    void setSelectedDateMillis(Long l2);
}
