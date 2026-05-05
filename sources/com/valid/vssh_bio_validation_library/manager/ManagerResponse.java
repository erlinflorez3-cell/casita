package com.valid.vssh_bio_validation_library.manager;

import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import com.valid.vssh_bio_validation_library.utils.model.EnumAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpAӄLeV:ZS0$s{B-c$wEA٬ \u0014̝9O|f(\u0012Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012BF}CKM\u001eBId\u0003<\u001d `)أ}\u0005\u000f\"rO\u001e\u0010\u0013Cy\rXٚA9A`'e\u0005H\u0015L͋!I%j\u0003f6vq$Ǆ0k\nw^f'\u000e7Cָ\u000e\u000f\u00045*\u000faLѨp=;\u00153S\u001b\u0007\u0001\\o\tEqK\u0007\u0001'U.yy]6f\u0004,\u0015YT=cx&j\u000bi`:.q֙b\u0014a\u001cF\u0010z*,l\n\u001c&?JD,HeN՛4=yaah\u0002\rGF҄`~\u001e3\"K+g\"-ж`\f1\\9\u0014\u0005;!yЮzĲ_`\u0016֫-\u001dZ\u0001_;qBCS\\\u0016*U{\u0004\tb0+ZΉSĬ3\b\u0019ф/'=hG1Am\bWRwG\u001dnnki\u0001O\u0017̕zގ;6\u0011ȱrFj\u0016ybtZ2$[0%\u001f\f\f+ \u000b|\u0013Ơ1ŎR[pȉ\u0003Oc\u001f3E\u00079_\u0006y&Č=\u0002"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+!\u0003l(Pv44L\\7f[\u0001=i", "", "3md:50H/)\u000e}^5\f\r-a\u000f,\u0006Im\u0017%Wv\u001d", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^HjI\u000f@0XR7VON5kVp9#\u0016d\u0017;+\u001b\u0015`Py", "3md:4*MW#\b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f7O(L;`\\{\u0013", "AsPAh:\u001c]\u0018~", "", ";db@T.>", "", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2AB\u0017k\tR\u0001\u0003W[Q,eav;\u0010!^\u0018W\u0018\r\u0013iH3D+5)\u0010uZ}Bl\u007fU'\u001cCmj?Z\u001aA\u000b\u0011|E(dU]i\u0003AHI_7`\u0019sflI>+\";!%gP5S[\\!z.wvkQ\"P\u001c\u000bCilB\u000fvQEvp\rZ\t{\u001b4.8\u001c", "5dc\u0012a<F/\u0017\u000e~h5", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005{C\"\u001cv+A\u0011b,U@\u0007P\\V\bZavG\u001dg", "Adc\u0012a<F/\u0017\u000e~h5", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2iC\u0006c3\u0018V0WT**kV|FiUK", "5dc\u0012a<F0\u001d\tVn;\u007f\t8t\u0004&wO\u0005! 4o\u001cL}4", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005{C\"\u001cv+\u0019\u0010s4+z1#\\]/\\[\u0002A\u0012\u000ei\u0012X4y\u0005gQ+}\u001a", "Adc\u0012a<F0\u001d\tVn;\u007f\t8t\u0004&wO\u0005! 4o\u001cL}4", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2AB\u0017k\tR\u0001\u0003W[Q,eav;\u0010!^\u0018W\u0018\r\u0013iH3D\b(", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001aX:LO\u001b~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc g(Mc'\\\u0005],", "u(8", "Adc g(Mc'\\\u0005],", "uH\u0018#", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class ManagerResponse {
    private EnumAction enumAction;
    private EnumBioAuthenticationResult enumBioAuthenticationResult;
    private String message;
    private int statusCode;

    public ManagerResponse(EnumBioAuthenticationResult enumBioAuthenticationResult, EnumAction enumAction, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(enumBioAuthenticationResult, ZO.xd("@yu[5, -V\b]qGm{74\u001dL\u007f#@,]0\u000fW", (short) (OY.Xd() ^ (OY.Xd() ^ (1451011694 ^ 1381469153))), (short) (OY.Xd() ^ (ZN.Xd() ^ (1950051857 ^ 1202796564)))));
        int iXd = C1633zX.Xd() ^ 1951467576;
        Intrinsics.checkParameterIsNotNull(enumAction, C1626yg.Ud("?ID\u001fw,\u0011M,\u0007", (short) (Od.Xd() ^ (2069962848 ^ (-2069973978))), (short) (Od.Xd() ^ iXd)));
        Intrinsics.checkParameterIsNotNull(str, Ig.wd("j\fFx\u001d}Q", (short) (C1607wl.Xd() ^ (1592507899 ^ 1592515892))));
        this.enumBioAuthenticationResult = enumBioAuthenticationResult;
        this.enumAction = enumAction;
        this.statusCode = i2;
        this.message = str;
    }

    public static /* synthetic */ ManagerResponse copy$default(ManagerResponse managerResponse, EnumBioAuthenticationResult enumBioAuthenticationResult, EnumAction enumAction, int i2, String str, int i3, Object obj) {
        if ((1 & i3) != 0) {
            enumBioAuthenticationResult = managerResponse.enumBioAuthenticationResult;
        }
        if ((2 & i3) != 0) {
            enumAction = managerResponse.enumAction;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            i2 = managerResponse.statusCode;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            str = managerResponse.message;
        }
        return managerResponse.copy(enumBioAuthenticationResult, enumAction, i2, str);
    }

    public final EnumBioAuthenticationResult component1() {
        return this.enumBioAuthenticationResult;
    }

    public final EnumAction component2() {
        return this.enumAction;
    }

    public final int component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.message;
    }

    public final ManagerResponse copy(EnumBioAuthenticationResult enumBioAuthenticationResult, EnumAction enumAction, int i2, String str) {
        short sXd = (short) (C1580rY.Xd() ^ ((965438133 ^ 717799501) ^ (-323215451)));
        int[] iArr = new int["o?VtsG/s\u0006XF%y}^:\u0006~;)g\u0013\u0010\"\u0004F,".length()];
        QB qb = new QB("o?VtsG/s\u0006XF%y}^:\u0006~;)g\u0013\u0010\"\u0004F,");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(enumBioAuthenticationResult, new String(iArr, 0, i3));
        Intrinsics.checkParameterIsNotNull(enumAction, C1561oA.Qd("(06-\u007f!1%*(", (short) (ZN.Xd() ^ (ZN.Xd() ^ (2073488944 ^ 1209845027)))));
        Intrinsics.checkParameterIsNotNull(str, C1593ug.zd("\u0005}\r\u000e|\u0004\u0003", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207800540)), (short) (C1607wl.Xd() ^ ((1033901285 ^ 581520369) ^ 520705323))));
        return new ManagerResponse(enumBioAuthenticationResult, enumAction, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagerResponse)) {
            return false;
        }
        ManagerResponse managerResponse = (ManagerResponse) obj;
        return Intrinsics.areEqual(this.enumBioAuthenticationResult, managerResponse.enumBioAuthenticationResult) && Intrinsics.areEqual(this.enumAction, managerResponse.enumAction) && this.statusCode == managerResponse.statusCode && Intrinsics.areEqual(this.message, managerResponse.message);
    }

    public final EnumAction getEnumAction() {
        return this.enumAction;
    }

    public final EnumBioAuthenticationResult getEnumBioAuthenticationResult() {
        return this.enumBioAuthenticationResult;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        EnumBioAuthenticationResult enumBioAuthenticationResult = this.enumBioAuthenticationResult;
        int iHashCode = (enumBioAuthenticationResult != null ? enumBioAuthenticationResult.hashCode() : 0) * 31;
        EnumAction enumAction = this.enumAction;
        int iHashCode2 = (((iHashCode + (enumAction != null ? enumAction.hashCode() : 0)) * 31) + Integer.hashCode(this.statusCode)) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setEnumAction(EnumAction enumAction) {
        Intrinsics.checkParameterIsNotNull(enumAction, C1561oA.od("l#\u0014\"Yjh", (short) (C1499aX.Xd() ^ (1545336754 ^ (-1545320504)))));
        this.enumAction = enumAction;
    }

    public final void setEnumBioAuthenticationResult(EnumBioAuthenticationResult enumBioAuthenticationResult) {
        short sXd = (short) (C1633zX.Xd() ^ ((61323503 ^ 1377380674) ^ (-1371467973)));
        int[] iArr = new int["\fD7G\u0001\u0014\u0014".length()];
        QB qb = new QB("\fD7G\u0001\u0014\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(enumBioAuthenticationResult, new String(iArr, 0, i2));
        this.enumBioAuthenticationResult = enumBioAuthenticationResult;
    }

    public final void setMessage(String str) {
        int iXd = C1633zX.Xd() ^ (-1951475810);
        Intrinsics.checkParameterIsNotNull(str, Wg.Zd("?$N\btAh", (short) (OY.Xd() ^ (547032826 ^ 547038889)), (short) (OY.Xd() ^ iXd)));
        this.message = str;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public String toString() {
        short sXd = (short) (C1607wl.Xd() ^ (FB.Xd() ^ (534609057 ^ 1077051146)));
        int[] iArr = new int["\u0010%3'.-;\u001c0?===C6y8BJC\u0019AH\u001bPPECMTJEDXNUU:N]`Xa+".length()];
        QB qb = new QB("\u0010%3'.-;\u001c0?===C6y8BJC\u0019AH\u001bPPECMTJEDXNUU:N]`Xa+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i2)).append(this.enumBioAuthenticationResult).append(Wg.vd("\u0006xAIKB\u0019:F:CA\u000b", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849965899)))).append(this.enumAction);
        int iXd = OY.Xd() ^ 69932790;
        return sbAppend.append(Qg.kd("ZM  \f\u001e\u001e\u001bi\u0015\t\t_", (short) (OY.Xd() ^ ((1550222245 ^ 1856512379) ^ 852409598)), (short) (OY.Xd() ^ iXd))).append(this.statusCode).append(hg.Vd("l_,#0/\u001c!\u001et", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (884536108 ^ 1526529591))), (short) (C1607wl.Xd() ^ (1971025932 ^ 1970999016)))).append(this.message).append(C1561oA.ud("\u0014", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (2021560563 ^ 1004901720))))).toString();
    }
}
