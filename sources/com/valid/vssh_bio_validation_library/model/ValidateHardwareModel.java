package com.valid.vssh_bio_validation_library.model;

import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4ߚ\u007f\u0007|jA0JuP.`\\2\u000fq}:Ša:ڎs;\u0004\u0019>=\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/YY\u0007a*\u000f`GņC3[u\u0006@n\bN\u0005N3hهzM\b(>`\u0010%}\nƾ\rZ7N\u0006RR;RK\u074c\u0013Nc.\u00176\\\u0016ޮfNr]H/;\u0003\u0018C~-e0\u000bO%F\u0003*=|g\u001e9DO5C*\u001aϏ\u0006\u001blM\u001aWqk\u001d\u0019-5Daum5\u0007~Zǚ,\u0018\u0014k\r>\\3R'ц&sVqfh\u000eVzA՟\f\r\u001c\u001c\b?H\\0pǘ\u0014ԧ7\u0001zԟXR\beP\b\u001bc< 3\n\u0004CG\u001f~Q\u0010@oגC߉\t\u0019&ŀ\u0019p'fb\u001a\u0001\u0017!a\u0006_\u0002iN=`N8Z\u0014Ю\u0010Ͳf\u000e2ʶHI\u0006>\n!N\u0019+HiKأ%\b"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017KEj4%^Y]@\u000bb(]v\nCYM>X_r%\u001e\u0011Z\u0015$", "", "AsPAh:\u001c]\u0018~", "", ";db@T.>", "", "@dbB_;", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^HjI\u000f@0XR7VON5kVp9#\u0016d\u0017;+\u001b\u0015`Py", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'~!\u001f\u0011\u0001\nCz$~j\f.:g\u00132W=Lg;\"\u0014dp=\u0011l&Uz$TH[@&b\u0002A\u001b $mW;\u0015a]K\u007f~S:\u001f\u0011;M\u007f7w\u0005\u0016\u001fz5x\u0001Iee\u000bj", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001aX:LO\u001b~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001fX:NZ(", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005{C\"\u001cv+\u0019\u0010s4+z1#\\]/\\[\u0002A\u0012\u000ei\u0012X4y\u0005gQ+}\u001a", "Adc\u001fX:NZ(", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2AB\u0017k\tR\u0001\u0003W[Q,eav;\u0010!^\u0018W\u0018\r\u0013iH3D\b(", "5dc g(Mc'\\\u0005],", "u(8", "Adc g(Mc'\\\u0005],", "uH\u0018#", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class ValidateHardwareModel {
    private String message;
    private EnumBioAuthenticationResult result;
    private int statusCode;

    public ValidateHardwareModel(int i2, String str, EnumBioAuthenticationResult enumBioAuthenticationResult) {
        int iXd = ZN.Xd() ^ (407142443 ^ (-734977437));
        Intrinsics.checkParameterIsNotNull(str, hg.Vd("@7DC052", (short) (C1633zX.Xd() ^ (679538977 ^ (-679535401))), (short) (C1633zX.Xd() ^ iXd)));
        Intrinsics.checkParameterIsNotNull(enumBioAuthenticationResult, C1561oA.ud("\u0006w\u0005\u0006{\u0003", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1735488201 ^ 619323232)))));
        this.statusCode = i2;
        this.message = str;
        this.result = enumBioAuthenticationResult;
    }

    public static /* synthetic */ ValidateHardwareModel copy$default(ValidateHardwareModel validateHardwareModel, int i2, String str, EnumBioAuthenticationResult enumBioAuthenticationResult, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            i2 = validateHardwareModel.statusCode;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            str = validateHardwareModel.message;
        }
        if ((i3 & 4) != 0) {
            enumBioAuthenticationResult = validateHardwareModel.result;
        }
        return validateHardwareModel.copy(i2, str, enumBioAuthenticationResult);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.message;
    }

    public final EnumBioAuthenticationResult component3() {
        return this.result;
    }

    public final ValidateHardwareModel copy(int i2, String str, EnumBioAuthenticationResult enumBioAuthenticationResult) {
        Intrinsics.checkParameterIsNotNull(str, C1561oA.yd("D;HG<A>", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1496800115 ^ (-447485658))))));
        Intrinsics.checkParameterIsNotNull(enumBioAuthenticationResult, C1561oA.Yd("SGVYQZ", (short) (ZN.Xd() ^ (858301835 ^ 858294274))));
        return new ValidateHardwareModel(i2, str, enumBioAuthenticationResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateHardwareModel)) {
            return false;
        }
        ValidateHardwareModel validateHardwareModel = (ValidateHardwareModel) obj;
        return this.statusCode == validateHardwareModel.statusCode && Intrinsics.areEqual(this.message, validateHardwareModel.message) && Intrinsics.areEqual(this.result, validateHardwareModel.result);
    }

    public final String getMessage() {
        return this.message;
    }

    public final EnumBioAuthenticationResult getResult() {
        return this.result;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.statusCode) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        EnumBioAuthenticationResult enumBioAuthenticationResult = this.result;
        return iHashCode2 + (enumBioAuthenticationResult != null ? enumBioAuthenticationResult.hashCode() : 0);
    }

    public final void setMessage(String str) {
        int iXd = C1499aX.Xd() ^ (795898794 ^ (-1827356335));
        short sXd = (short) (ZN.Xd() ^ (6004266 ^ 6019242));
        short sXd2 = (short) (ZN.Xd() ^ iXd);
        int[] iArr = new int["\u000eF9I\u0003\u0016\u0016".length()];
        QB qb = new QB("\u000eF9I\u0003\u0016\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str, new String(iArr, 0, i2));
        this.message = str;
    }

    public final void setResult(EnumBioAuthenticationResult enumBioAuthenticationResult) {
        Intrinsics.checkParameterIsNotNull(enumBioAuthenticationResult, Jg.Wd("|o4\n\\%f", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849967809)), (short) (ZN.Xd() ^ (FB.Xd() ^ 1609525886))));
        this.result = enumBioAuthenticationResult;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public String toString() {
        return ZO.xd("6hUNuC\u0002l6a\u000b\u0014+1[\te!f9p@@%I3BNLEi(x", (short) (FB.Xd() ^ ((667367685 ^ 1474482535) ^ 1881522951)), (short) (FB.Xd() ^ (FB.Xd() ^ 1609502646))) + this.statusCode + C1626yg.Ud("{W^\u0018K\u0003e`W\u0010", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134254055)), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (610857228 ^ 1744013542)))) + this.message + Ig.wd("c\tK!|Qf\u0005n", (short) (OY.Xd() ^ ((32047949 ^ 1041434145) ^ 1073361596))) + this.result + EO.Od("Z", (short) (C1607wl.Xd() ^ (OY.Xd() ^ (1753994029 ^ 1822483795))));
    }
}
