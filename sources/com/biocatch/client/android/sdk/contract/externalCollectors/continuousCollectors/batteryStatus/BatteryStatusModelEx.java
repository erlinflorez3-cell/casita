package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.batteryStatus;

import com.biocatch.client.android.sdk.collection.collectors.hardware.PowerSource;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000b8é6B\r+4ߚ\u007f\u0007|jA0JpP.`Y2şs{B0cҕw٘Akڼ.\"7N\u000f\u0003wrXZ#C=\u0007&|x.aU'`\"\u0013@F\b?aRڱA9nz~\f.>:8(\u0006Gʤ+\u0011\u0017\u0005\b[K:\u0015vВq\u0003Y\u001b[\u001d\u001a@\u000b\u0005ů\u0002f\u0002u]NH\u001bҗj5)\u0003wBf'\u000e1-S\u0013Fb)%v\u0010![F=5#)k\u00035W\"ϱ\u0002\b\u0003K\u0015\u0001'U.yyeGp\u0002*\u0014YNSǵsnc\u0013cx\fU>\u0016ԁJ\u0019\u00156\f\u0013{;QJّ\u0005wW<-2f6\u000f\u07baxx[óh\u0004dI\u000e\u00032E%'\u00183Y<ӸjWiݢ1P=}\u0013\u0016n2\u000fr9[\u0003\u0013\u05ce\u0019!\\ȭi3WJKSݹ\u000eo"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005e|\u001b%\u000eB~^QR\u001fW\b^R=8wFfsgV=Tr8L\u0016^\u001dc\u001aMy", "", "1gP?Z,%S*~\u0002", "", "7r25T9@W\"\u0001", "", ">nf2e\u001aHc&|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[E\u0018`+\u001arcQ1lD\r", "uEI\u0019V6F\u001d\u0016\u0003\u0005\\(\f\u00072/}/\u007f@\n&`Cx\rI\u0001)4#\f\u001f=7\u00148TJ;iC\"\u001fq+7\u0011j3Nt6QY\\u_N\u007f<&\u000eg\u000e\u0018\u0016\u0017\u0017YN\u0012xTD\u001d\b\u0002\rr", "5dc\u0010[(KU\u0019ezo,\u0004", "u(5", "u(I", "5dc\u001db>>`\u0007\t\u000bk*|", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018/X_qO\u0010\u001fZW95\u001f\u0005f/.~Q5\u001f]", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BatteryStatusModelEx {
    private final float chargeLevel;
    private final boolean isCharging;
    private final PowerSource powerSource;

    public BatteryStatusModelEx(float f2, boolean z2, PowerSource powerSource) {
        Intrinsics.checkNotNullParameter(powerSource, "powerSource");
        this.chargeLevel = f2;
        this.isCharging = z2;
        this.powerSource = powerSource;
    }

    public static /* synthetic */ BatteryStatusModelEx copy$default(BatteryStatusModelEx batteryStatusModelEx, float f2, boolean z2, PowerSource powerSource, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = batteryStatusModelEx.chargeLevel;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = batteryStatusModelEx.isCharging;
        }
        if ((i2 & 4) != 0) {
            powerSource = batteryStatusModelEx.powerSource;
        }
        return batteryStatusModelEx.copy(f2, z2, powerSource);
    }

    public final float component1() {
        return this.chargeLevel;
    }

    public final boolean component2() {
        return this.isCharging;
    }

    public final PowerSource component3() {
        return this.powerSource;
    }

    public final BatteryStatusModelEx copy(float f2, boolean z2, PowerSource powerSource) {
        Intrinsics.checkNotNullParameter(powerSource, "powerSource");
        return new BatteryStatusModelEx(f2, z2, powerSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatteryStatusModelEx)) {
            return false;
        }
        BatteryStatusModelEx batteryStatusModelEx = (BatteryStatusModelEx) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.chargeLevel), (Object) Float.valueOf(batteryStatusModelEx.chargeLevel)) && this.isCharging == batteryStatusModelEx.isCharging && this.powerSource == batteryStatusModelEx.powerSource;
    }

    public final float getChargeLevel() {
        return this.chargeLevel;
    }

    public final PowerSource getPowerSource() {
        return this.powerSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        int iHashCode = Float.hashCode(this.chargeLevel) * 31;
        boolean z2 = this.isCharging;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        return ((iHashCode + r02) * 31) + this.powerSource.hashCode();
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public String toString() {
        return "BatteryStatusModelEx(chargeLevel=" + this.chargeLevel + ", isCharging=" + this.isCharging + ", powerSource=" + this.powerSource + ')';
    }
}
