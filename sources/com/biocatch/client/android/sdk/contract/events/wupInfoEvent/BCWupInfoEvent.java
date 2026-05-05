package com.biocatch.client.android.sdk.contract.events.wupInfoEvent;

import java.util.Date;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG<LeNAZS8\u0018s{:$c$\u007fICU }(ޢUdʴ\u0018nxYKh\u001f\n$x\u0003,wV\ta \u0011JB\u001e@CQ}@Q`#:\u0015&@'P{\u001b\u007fH0Н\u0014v\tJ\u0014\u0013 FXphSȘ\u0006b\u0019\u0014U8\u0001L].ߵ7\u0011skRG#1m\tľ((9\u000bf%Hj&;|(ԣ,\thC/=S1ޗ\u0003aE\u0003MqU\u0005\u0017(W1Ose8p\u007fB\u0016[U\u0013]\u0001)t\u0005\u007fd</1OqPh\u0010>v)\u0002Sʤ\u0003V\u00175cF-H\u00038\u0014A\u0012\u000bUVO0]\tɬ{*=%C\u00183YXaǯP*B'nO{3\u0013dƗ\u007f?;iY&b+\u001a\u0003}(Ŀ]͘ATVˣq?s\f~k\",\n:U\u000b\u007f\u0014\u001f0/%e\\\u0010\u0601-Ƞ\u0006TLϙ\u000f\u0007ftavrJF0|%\bB\u0017\frD\u0013\u0006B³`г0\u001dUȼl\t\u0004\u0018!-|yB23\u001f\u001fgvl\u0003M\f\u000e{ËrƠ]zsލo;dECd\u0004\u0012gf\u0005)͜@\u0004"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPu<YZ0HV.=\\[\u0002\u0007poL\u001eY\u000f\u0016\u0006c!5nMFt", "", "Bh\\25,?]&~g^8\r\t=t", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "Bh\\24-MS&kzl7\u0007\u0012=e", "Bx_2", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPu<YZ0HV.=\\[\u0002\u0007poL\u001eY\u000f\u0016\u0006c08yD\r", "3qa<e", "", "uKY.i(\bc(\u0003\u0002(\u000bx\u0018/;f-wQ|`'Vs\u0015\u0006U!DYS\u00075w\u001ewJGEi0-\u0013k+7\u000eg,W\u0006pCUM9fVq\u0007\"\u0011`WL5\u0016\u0014f=\"}\u000e70\b5X\u0010\u0005z\u0011\u0017y\u00176tPSV\u0019VCqS39s*b`\u00046UPb\u007fK\u0011[.X\u0004A \u001dsb\tw]2\u0013})Tc", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc!\\4>/\u001a\u000ezk\u0019|\u0017:o\t6{", "u(;7T=:\u001d)\u000e~eu[\u0005>eU", "Adc!\\4>/\u001a\u000ezk\u0019|\u0017:o\t6{", "uKY.i(\bc(\u0003\u0002(\u000bx\u0018/;C\u0019", "5dc!\\4>0\u0019\u007f\u0005k,i\t;u\u007f6\u000b", "Adc!\\4>0\u0019\u007f\u0005k,i\t;u\u007f6\u000b", "5dc!l7>", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCg\u0015yaB\u0016qu`\u00072+UO6<crF#[7k@;\u0018hbB.]XB\u001f]", "Adc!l7>", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001f=Z?9z}\u001e&hjH\u0015->^\u0002\u000bPMX\fmR{L]n8\u007f^6p\u000eZK\u0013\u0003O7tK\u001d", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BCWupInfoEvent {
    private String error;
    private Date timeAfterResponse;
    private Date timeBeforeRequest;
    private BCWupInfoType type;

    public BCWupInfoEvent(Date timeBeforeRequest, Date timeAfterResponse, BCWupInfoType type, String str) {
        Intrinsics.checkNotNullParameter(timeBeforeRequest, "timeBeforeRequest");
        Intrinsics.checkNotNullParameter(timeAfterResponse, "timeAfterResponse");
        Intrinsics.checkNotNullParameter(type, "type");
        this.timeBeforeRequest = timeBeforeRequest;
        this.timeAfterResponse = timeAfterResponse;
        this.type = type;
        this.error = str;
    }

    public static /* synthetic */ BCWupInfoEvent copy$default(BCWupInfoEvent bCWupInfoEvent, Date date, Date date2, BCWupInfoType bCWupInfoType, String str, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            date = bCWupInfoEvent.timeBeforeRequest;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            date2 = bCWupInfoEvent.timeAfterResponse;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            bCWupInfoType = bCWupInfoEvent.type;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str = bCWupInfoEvent.error;
        }
        return bCWupInfoEvent.copy(date, date2, bCWupInfoType, str);
    }

    public final Date component1() {
        return this.timeBeforeRequest;
    }

    public final Date component2() {
        return this.timeAfterResponse;
    }

    public final BCWupInfoType component3() {
        return this.type;
    }

    public final String component4() {
        return this.error;
    }

    public final BCWupInfoEvent copy(Date timeBeforeRequest, Date timeAfterResponse, BCWupInfoType type, String str) {
        Intrinsics.checkNotNullParameter(timeBeforeRequest, "timeBeforeRequest");
        Intrinsics.checkNotNullParameter(timeAfterResponse, "timeAfterResponse");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BCWupInfoEvent(timeBeforeRequest, timeAfterResponse, type, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCWupInfoEvent)) {
            return false;
        }
        BCWupInfoEvent bCWupInfoEvent = (BCWupInfoEvent) obj;
        return Intrinsics.areEqual(this.timeBeforeRequest, bCWupInfoEvent.timeBeforeRequest) && Intrinsics.areEqual(this.timeAfterResponse, bCWupInfoEvent.timeAfterResponse) && this.type == bCWupInfoEvent.type && Intrinsics.areEqual(this.error, bCWupInfoEvent.error);
    }

    public final String getError() {
        return this.error;
    }

    public final Date getTimeAfterResponse() {
        return this.timeAfterResponse;
    }

    public final Date getTimeBeforeRequest() {
        return this.timeBeforeRequest;
    }

    public final BCWupInfoType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.timeBeforeRequest.hashCode() * 31) + this.timeAfterResponse.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setTimeAfterResponse(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.timeAfterResponse = date;
    }

    public final void setTimeBeforeRequest(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.timeBeforeRequest = date;
    }

    public final void setType(BCWupInfoType bCWupInfoType) {
        Intrinsics.checkNotNullParameter(bCWupInfoType, "<set-?>");
        this.type = bCWupInfoType;
    }

    public String toString() {
        return "BCWupInfoEvent(timeBeforeRequest=" + this.timeBeforeRequest + ", timeAfterResponse=" + this.timeAfterResponse + ", type=" + this.type + ", error=" + this.error + ')';
    }
}
