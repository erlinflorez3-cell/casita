package com.biocatch.client.android.sdk.collection.collectors.device.audio;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG9L͜P.`_2şs{BBc$w\\CU(Ԃ*\tUNog\u0005Jb\u000bI\u000f\fǞ~\u0001ߚyU'\\R`BF}?KM\u001e>Id\u00038\u001d `%H}\u0013\u00052*v\u0013\u0007~QP$\u0012^F\u0001>`\u0014e\u0005H\u001a\u0016H.\n6bwPFH\u001beh93\u0007wMf'\u000e6\rQ\u001bRl';|q\"9MO5C&٨\u0007\u0007`i\b\nM\fU\u0005\u0017(mȩJ<^Ds\u0018\u0014C.\u0016֜^;-j!i`:*q֙d\u0014W\u001cE\u0010z*\u0013\u0003Ȑ\u000fN.VLE\u001a\u0015\u0010Tߞu;`No\u001adR\u0002\u000bad\u001fS\nyۆ:cm_\u0002S\u0019|=Ḅ\u000ef*\u000f\u00109[\u0003\u0014'ۄ\u001c\u001d~_Si@kI\u0015̪Z\u0006U\u0012\u0014z\u0002Xʶ`M\u0006/\n\u0011F\u0017S8\f?)!y\u0004`D\u0016y5fnSwV`@PqF=0\t\u001a_\\d3q\u0001Z^,\u001fT4T5\u00068\u001f&\\\u0006E9+ P_h\u0018r{g:+5fEd\u0007k<]id95_o(a\u0001|DEBb\u0013e~B\u0002\r!ک'jCV\u000f(w*J~\u0012!WWs23ZW_ù\u0016\u0011\n,iY|7`!ԧ\u000fGZAL\u001biR\u001eO\u0015\u0019c~\u001a\u007fxw4C˷!}V_>1,e$x4++5\t\u0381\u0004Moն_Nr%\u0004eL/$\u001aQQ]>т\u0013\u00051Ʌ\u001a/K]\u0001w\"\\ .\u0013|(\u0017³l4oō\u0003r2sx^ c%$\u000f^!&ϋh\u0006\u0002ӓ^|Mxb!,MW}\u001bYjT̞\u0001\u000b'Ǉ=\u0003u-\u000bL}R5).wB5ֵecq۰F{h\u001b4\f6\u0013:h.o\u0011WЄ6A@Ծq\u0001D'2\u0004SQVw\u0010\bp\nΌ\u00119PШ|r\\P[\u001d\u007f\rt\u000bD\r\u001fYݍ>\u0019wϘL0eC\u0002YΈ\u0018\n"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u0010\"Y\u0012Xth\u0015XE.VN6\u001f\u000f\u0002", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "7rB=X(DS&i}h5|d-t\u00049{", "", "1ta?X5MZ-lze,z\u0018/d^(\rD~\u0017", "", "1n];X*MS\u0018]zo0z\t=", "", "7r<6V9H^\u001c\t\u0004^\u0014\r\u0018/", "7r<Bf0</\u0017\u000e~o,", "@h]4X9&]\u0018~", "uH9\u0017M\u0013CO*zDe(\u0006\u000bxS\u000f5\u007fI\u0003l}Lk\u001f8@5D]\u0005i\u001eq$=#80Ow\u000f", "5dc\u0010b5GS\u0017\u000ez]\u000b|\u001a3c\u007f6", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0010h9KS\"\u000e\u0002r\u001a|\u0010/c\u000f(z\u001f\u0001(\u001bEo", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012i,Gb|]", "u(9", "u(I", "5dc\u001f\\5@S&f\u0005],", "5dc!\\4>a(z\u0003i", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class AudioModel extends CollectionItem {
    private final List<String> connectedDevices;
    private final int contextID;
    private final String currentlySelectedDevice;
    private final long eventID;
    private final boolean isMicrophoneMute;
    private final boolean isMusicActive;
    private final boolean isSpeakerPhoneActive;
    private final int ringerMode;
    private final long timestamp;

    public AudioModel(int i2, long j2, long j3, boolean z2, String currentlySelectedDevice, List<String> connectedDevices, boolean z3, boolean z4, int i3) {
        Intrinsics.checkNotNullParameter(currentlySelectedDevice, "currentlySelectedDevice");
        Intrinsics.checkNotNullParameter(connectedDevices, "connectedDevices");
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.isSpeakerPhoneActive = z2;
        this.currentlySelectedDevice = currentlySelectedDevice;
        this.connectedDevices = connectedDevices;
        this.isMicrophoneMute = z3;
        this.isMusicActive = z4;
        this.ringerMode = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioModel copy$default(AudioModel audioModel, int i2, long j2, long j3, boolean z2, String str, List list, boolean z3, boolean z4, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = audioModel.contextID;
        }
        if ((2 & i4) != 0) {
            j2 = audioModel.eventID;
        }
        if ((4 & i4) != 0) {
            j3 = audioModel.timestamp;
        }
        if ((i4 + 8) - (8 | i4) != 0) {
            z2 = audioModel.isSpeakerPhoneActive;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            str = audioModel.currentlySelectedDevice;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            list = audioModel.connectedDevices;
        }
        if ((i4 + 64) - (64 | i4) != 0) {
            z3 = audioModel.isMicrophoneMute;
        }
        if ((i4 + 128) - (128 | i4) != 0) {
            z4 = audioModel.isMusicActive;
        }
        if ((i4 & 256) != 0) {
            i3 = audioModel.ringerMode;
        }
        return audioModel.copy(i2, j2, j3, z2, str, list, z3, z4, i3);
    }

    public final int component1() {
        return this.contextID;
    }

    public final long component2() {
        return this.eventID;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final boolean component4() {
        return this.isSpeakerPhoneActive;
    }

    public final String component5() {
        return this.currentlySelectedDevice;
    }

    public final List<String> component6() {
        return this.connectedDevices;
    }

    public final boolean component7() {
        return this.isMicrophoneMute;
    }

    public final boolean component8() {
        return this.isMusicActive;
    }

    public final int component9() {
        return this.ringerMode;
    }

    public final AudioModel copy(int i2, long j2, long j3, boolean z2, String currentlySelectedDevice, List<String> connectedDevices, boolean z3, boolean z4, int i3) {
        Intrinsics.checkNotNullParameter(currentlySelectedDevice, "currentlySelectedDevice");
        Intrinsics.checkNotNullParameter(connectedDevices, "connectedDevices");
        return new AudioModel(i2, j2, j3, z2, currentlySelectedDevice, connectedDevices, z3, z4, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioModel)) {
            return false;
        }
        AudioModel audioModel = (AudioModel) obj;
        return this.contextID == audioModel.contextID && this.eventID == audioModel.eventID && this.timestamp == audioModel.timestamp && this.isSpeakerPhoneActive == audioModel.isSpeakerPhoneActive && Intrinsics.areEqual(this.currentlySelectedDevice, audioModel.currentlySelectedDevice) && Intrinsics.areEqual(this.connectedDevices, audioModel.connectedDevices) && this.isMicrophoneMute == audioModel.isMicrophoneMute && this.isMusicActive == audioModel.isMusicActive && this.ringerMode == audioModel.ringerMode;
    }

    public final List<String> getConnectedDevices() {
        return this.connectedDevices;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final String getCurrentlySelectedDevice() {
        return this.currentlySelectedDevice;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final int getRingerMode() {
        return this.ringerMode;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.contextID) * 31) + Long.hashCode(this.eventID)) * 31) + Long.hashCode(this.timestamp)) * 31;
        boolean z2 = this.isSpeakerPhoneActive;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int iHashCode2 = (((((iHashCode + r02) * 31) + this.currentlySelectedDevice.hashCode()) * 31) + this.connectedDevices.hashCode()) * 31;
        boolean z3 = this.isMicrophoneMute;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i2 = (iHashCode2 + r03) * 31;
        boolean z4 = this.isMusicActive;
        return ((i2 + (z4 ? 1 : z4)) * 31) + Integer.hashCode(this.ringerMode);
    }

    public final boolean isMicrophoneMute() {
        return this.isMicrophoneMute;
    }

    public final boolean isMusicActive() {
        return this.isMusicActive;
    }

    public final boolean isSpeakerPhoneActive() {
        return this.isSpeakerPhoneActive;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.isSpeakerPhoneActive);
        jSONArray.put(this.currentlySelectedDevice);
        jSONArray.put(new JSONArray((Collection) this.connectedDevices));
        jSONArray.put(this.isMicrophoneMute);
        jSONArray.put(this.isMusicActive);
        jSONArray.put(this.ringerMode);
        return jSONArray;
    }

    public String toString() {
        return "AudioModel(contextID=" + this.contextID + ", eventID=" + this.eventID + ", timestamp=" + this.timestamp + ", isSpeakerPhoneActive=" + this.isSpeakerPhoneActive + ", currentlySelectedDevice=" + this.currentlySelectedDevice + ", connectedDevices=" + this.connectedDevices + ", isMicrophoneMute=" + this.isMicrophoneMute + ", isMusicActive=" + this.isMusicActive + ", ringerMode=" + this.ringerMode + ')';
    }
}
