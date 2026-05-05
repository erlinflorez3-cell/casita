package com.ts.coresdk.logger.db;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.db.TSBaseEntity;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000ePLcz\rI\u0006>\u00116B\u0005+4\u0012\u0006\u000enj?3LeV\u008cZݷ2\u000fy\u0005<$a.yCQU Ԅ(\u001fѧ~g\u0016\u001b\u000b\u0018\u001bG\u001d$.x\u00197YY\u0007\u0002*\u000f`A\u007fCAr\b=g_\u0005:\u0013FJ\"fx\u0015\u0005(Q`\u0010%ySO\u001a:H@\u001f9b\u0011[.2\u00124Uŋ\u0005 b\u0012\\a\u0011\u0005kZG#1\trT5}H~c\ftqm̰wҐ\"-FWC6ma\u0011)j[m\u000e\u0006ғ<ݾl)-MW\u0003 Df#,\u0015YNSǶq͉`\u0007W\u0004\u001a*{gqOh\u000eVv1\u0001cɥ\u0006؝\n1P03\u001at\t&5ztaC!\u001alI\u0018z\u00105M*Vę-ݰ\u001fpYcA\u001e\\8\u0014\u0007\u0013$1\u0004?9i^&`C\u001a\u000b|(ŀS͘ARV\f_E{\u0005\td\b3\u00123\u0018\u0018=\f).E0m`\u0010\u0602#Ƞ\u0006RLi|\u0011nukkXVN1?.E=!\f\tC\u001b\nB´Vг0\u001bU\u001eZ\u0018\f\t+\"b\nJ$u(\\e\u0001i\u0019L\u0014\u000f{ÌhƠ]xs\u0010]Ml4MSi%oUG,MXz\u0005\u0007}xXbȟ^͈&<Pl\u0016\u0010\n]f\u000e\u0019LM\r"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0016D9|*]/79\u0007/;|*\u0004", "", "0P", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", RemoteSettings.FORWARD_SLASH_STRING, "0Q", "B", AdkSettings.PLATFORM_TYPE_MOBILE, "0S", "D", "1", "", "0O", "\u0017", "@", "u(8", ExifInterface.GPS_MEASUREMENT_2D, "0T", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_3D, "0R", "C", "4", "", "0U", "\u0018", "F", "u(9", "5", "", ">/", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "BnBAe0GU", ">0", ">1", ">2", ">3", ">4", ">5", "\nh]6g\u0005", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+<\u001b\u0019(\u0013\t7q\u0003U\u0004\u001dBnyD,t\u000bj", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxd|qj.]\u0013%GO\u0017Kz4I/"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSLogEntity extends TSBaseEntity {
    private final int bP;
    private final String bQ;
    private final String bR;
    private final String bS;
    private final String bT;
    private final String bU;
    private final long bV;

    public TSLogEntity(int i2, String str, String str2, String str3, String str4, String str5, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.bP = i2;
        this.bQ = str;
        this.bR = str2;
        this.bS = str3;
        this.bT = str4;
        this.bU = str5;
        this.bV = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSLogEntity)) {
            return false;
        }
        TSLogEntity tSLogEntity = (TSLogEntity) obj;
        return this.bP == tSLogEntity.bP && Intrinsics.areEqual(this.bQ, tSLogEntity.bQ) && Intrinsics.areEqual(this.bR, tSLogEntity.bR) && Intrinsics.areEqual(this.bS, tSLogEntity.bS) && Intrinsics.areEqual(this.bT, tSLogEntity.bT) && Intrinsics.areEqual(this.bU, tSLogEntity.bU) && this.bV == tSLogEntity.bV;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.bP) * 31) + this.bQ.hashCode()) * 31) + this.bR.hashCode()) * 31) + this.bS.hashCode()) * 31) + this.bT.hashCode()) * 31) + this.bU.hashCode()) * 31) + Long.hashCode(this.bV);
    }

    public final int r() {
        return this.bP;
    }

    public final String s() {
        return this.bQ;
    }

    public final String t() {
        return this.bR;
    }

    public String toString() {
        return "TSLogEntity(severity=" + this.bP + ", className=" + this.bQ + ", methodName=" + this.bR + ", text=" + this.bS + ", packageName=" + this.bT + ", subSystemName=" + this.bU + ", timestamp=" + this.bV + ")";
    }

    public final String u() {
        return this.bS;
    }

    public final String v() {
        return this.bT;
    }

    public final String w() {
        return this.bU;
    }

    public final long x() {
        return this.bV;
    }
}
