package androidx.compose.material3;

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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0007\":\u001b\u007f\u0007lqA0ZeP.XT0t\u0002ڔd$\n#BgIW2}P\n\u007fTmf|Jr\u000bq\u0010<{7O\u0003֖aޯa\u001c'4HrM7mqC>nz\u0007\u001b.9:8(\rWʄ6Н\u0014\u0001\u0013EQ\u0013 9`r@\\\u001bXU0 \u0012V /&3ʈZɇLvu<5/\u0011rbP-l>\b\u001e1Tb?\r%bN1F6C\u0015=S1\b\tA}g\u0016ѣIݾl1?-O\u0003e:x\u0002\u001a%9U]y\u00017t\u0005\u007frb˓7\u05cbb֟ح\r'Þ~\u0006%>\n!\u0014+h03.t\u000eս2tɄSOX\u0005dۯ\u001c)`>\u0017+\u001f;-?:\u0015PŎ?.،;z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4s", "", "\nrTA \u0006\u0017", "", "6nd?", "5dc\u0015b<K", "u(8", "Adc\u0015b<K", "uH\u0018#", "7r!\u0001[6N`", "", "u(I", "Adc~'/Hc&", "uY\u0018#", "7r03g,K\\#\t\u0004", "Adc\u000eY;>`\"\t\u0005g", ";h]Bg,", "5dc\u001a\\5Nb\u0019", "Adc\u001a\\5Nb\u0019", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;CBk2-\u0019rj!\u0011b,$", "5dc X3>Q(\u0003\u0005gs\u0011\t-R\u000f\u0005_", "Adc X3>Q(\u0003\u0005gsM\u0003\u0002sP\u0007g", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface TimePickerState {
    int getHour();

    int getMinute();

    /* JADX INFO: renamed from: getSelection-yecRtBI */
    int mo1776getSelectionyecRtBI();

    boolean is24hour();

    boolean isAfternoon();

    void set24hour(boolean z2);

    void setAfternoon(boolean z2);

    void setHour(int i2);

    void setMinute(int i2);

    /* JADX INFO: renamed from: setSelection-6_8s6DQ */
    void mo1777setSelection6_8s6DQ(int i2);
}
