package com.valid.vssh_bio_validation_library.utils.model;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007t\rA0JeP.`\\2\u000fq\"<$i*yCAU ԉ(\u001fѧ~g\u0016m\u000bD\u001bI\u0015\u0006$x\u0003,wV\ta \u0011JB\u001eBC_}AQn\u00058\u0015 `%H{\u0015\u0001H-^\u000f%\u007fS]\u001a\u0018HN\u0001<b\r{\b*\u0014\u0016>N\u007f4[\u0016SFNr]H6;\u0003\u0018J^-e0\u000bV%F\u0003/\u001d|g\u001e9JO5C-c\t\rRiJ\u001b? Eݾl'57\u0012ze[p\u007fB\u0016q̈́\u000e&y4\u0003\u001dQ\u000f\u000fm̊P,`^5@\u0006\u000b}\u001d<2\u0011\u0016)X.[\u001d|\u0007<8;ʈT\te\u0010\u0007Z\u000e\u000bcF\u0017S\u0003C-I\u001b\u0015Pw:GS}߭\u0006U%1*\u0007!\n\\Tײ\u0016c[\u0006{IQnE\u000fޗ\u000b\"D{/\tb02JωHH6\n=F\u0017S?\"߄$i_\u0010u\\g%ݓ\u0011nYi`HX\"\u001d\u0017g0\u000f\fhF|\u0005\u001aS\u0005l2\u0011[ l\u0015\u000e\n# \u000bzL#5\u0010|R~h\u0019R\u000e\u001e+/t=q|{\u0010g9\r6ESs\u0010\u0010Q\r\u0013mA\u0013\u000b^fPZ$Z\u000b0R8Nj\u001e\u0001\u0014D|\u0014C8Eq*>D1GdEN\t\u001ePL\u0015\t\u000eb/ʴ}\u001dD21\u0002$#\u00111Vj \bi\u000fHZ{'Ō.\nXCI>UP\u001azŁ\"O\u0006\u00022_gzJ\u0013͕\u0015Fm\n+.\u001agY\u0006˒\u001fä\u00035:ĈEGR\u007fs_m\u0014-\n\u000b\n_av4\u007f\u0016zr<`\u0019M_V'\"%]\t\"6iVןmâ~SkҺ#]DZ\u0001\u0015y>TK\u000b\u0019oD3\u0005\b0\r7=CU &y$/Cdsh\u001e3Pʳ\u001b֑xq\fϺ{\u0018uw_oR=>_g\u0013\u000f:2l\u001bBvkN٫Nީ8\u0019;ǥYfvmFe+1\u0004\u007f\u0015F]\td]R\u0013\u001e\u0001\u000bʤkͫwO\u0006жvE+,[o\boshj)\u001b'\u0018\u0014\u00141\u001d\u001ar݂,ݫ[n\u0011ݵ\u001eu\u001eUOI\u0003\u0007B)2D|T\u0016\u0015[T\u0018\u000efĆ\fʮc\u001b\u001fϨZuAw\u001cb\u0019^\\j\u0013p\u0016x/1\u0019~=;tִA̰\tyN\u07bcGe8$a+)\u001dps\rvް/w"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju?\u00055J*X4db{A\u0012\u000ei\u0012X4y\u0005eQ$|S\r", "", ";dc5b+", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju6v6JVM\u001bp]r\u0013", ">`c5", "", "6dP1X9L", "", "0nSF", "Ar[\u001d\\5GW\"\u0001", "", "@db=b5LSx\bxk@\b\u0018/d", "AdRBe,+S%\u000fzl;", "/cS X:LW#\b^]\u001b\u0007u/q\u0010(\nO", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2iC\u0006c3\u0018^'VOX+Kf}=ix_\n_'V\fUJ&82F,\f5KW\"m|\u001d\u0012WEytI wC\u0005j\\F%yB#o\tKH\u000fJ&oaT\u0012Q/}\u0015", "5dc\u000eW+,S'\r~h5`\b\u001eol(\bP\u0001%&", "u(I", "Adc\u000eW+,S'\r~h5`\b\u001eol(\bP\u0001%&", "uY\u0018#", "5dc\u000fb+R", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u000fb+R", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "5dc\u0015X(=S&\r", "Adc\u0015X(=S&\r", "5dc\u001aX;A]\u0018", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005{C\"\u001cv+A\u0011b,U@\u000fG[Q6[A\u0007H\u0014g", "Adc\u001aX;A]\u0018", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2iC\u0006c3\u0018^'VOX+Kf}=iUK", "5dc\u001dT;A", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001dT;A", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001fX:I]\"\rz>5z\u0016Cp\u000f(z", "Adc\u001fX:I]\"\rz>5z\u0016Cp\u000f(z", "5dc X*N`\u0019kzj<|\u0017>", "Adc X*N`\u0019kzj<|\u0017>", "5dc f3)W\"\b~g.", "Adc f3)W\"\b~g.", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class VsshCommunicationRequest {
    private boolean addSessionIdToRequest;
    private Map<String, ? extends Object> body;
    private Map<String, String> headers;
    private MethodType method;
    private String path;
    private boolean responseEncrypted;
    private boolean secureRequest;
    private boolean sslPinning;

    public VsshCommunicationRequest(MethodType methodType, String str, Map<String, String> map, Map<String, ? extends Object> map2, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkParameterIsNotNull(methodType, Ig.wd("d.\u000bc;b", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (246668760 ^ (-2061670318))))));
        Intrinsics.checkParameterIsNotNull(str, EO.Od("l\u0006I^", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69954275)))));
        this.method = methodType;
        this.path = str;
        this.headers = map;
        this.body = map2;
        this.sslPinning = z2;
        this.responseEncrypted = z3;
        this.secureRequest = z4;
        this.addSessionIdToRequest = z5;
    }

    public /* synthetic */ VsshCommunicationRequest(MethodType methodType, String str, Map map, Map map2, boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MethodType.POST : methodType, str, map, map2, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? true : z2, (i2 + 32) - (i2 | 32) != 0 ? true : z3, (i2 + 64) - (i2 | 64) != 0 ? true : z4, (-1) - (((-1) - i2) | ((-1) - 128)) == 0 ? z5 : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VsshCommunicationRequest copy$default(VsshCommunicationRequest vsshCommunicationRequest, MethodType methodType, String str, Map map, Map map2, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            methodType = vsshCommunicationRequest.method;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            str = vsshCommunicationRequest.path;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            map = vsshCommunicationRequest.headers;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            map2 = vsshCommunicationRequest.body;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z2 = vsshCommunicationRequest.sslPinning;
        }
        if ((i2 + 32) - (32 | i2) != 0) {
            z3 = vsshCommunicationRequest.responseEncrypted;
        }
        if ((i2 + 64) - (64 | i2) != 0) {
            z4 = vsshCommunicationRequest.secureRequest;
        }
        if ((i2 & 128) != 0) {
            z5 = vsshCommunicationRequest.addSessionIdToRequest;
        }
        return vsshCommunicationRequest.copy(methodType, str, map, map2, z2, z3, z4, z5);
    }

    public final MethodType component1() {
        return this.method;
    }

    public final String component2() {
        return this.path;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    public final Map<String, Object> component4() {
        return this.body;
    }

    public final boolean component5() {
        return this.sslPinning;
    }

    public final boolean component6() {
        return this.responseEncrypted;
    }

    public final boolean component7() {
        return this.secureRequest;
    }

    public final boolean component8() {
        return this.addSessionIdToRequest;
    }

    public final VsshCommunicationRequest copy(MethodType methodType, String str, Map<String, String> map, Map<String, ? extends Object> map2, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkParameterIsNotNull(methodType, C1561oA.Qd("pguhnb", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849952540))));
        short sXd = (short) (C1607wl.Xd() ^ ((531265626 ^ 1971825155) ^ 1781396822));
        short sXd2 = (short) (C1607wl.Xd() ^ (2070618112 ^ 2070610665));
        int[] iArr = new int["F8LA".length()];
        QB qb = new QB("F8LA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str, new String(iArr, 0, i2));
        return new VsshCommunicationRequest(methodType, str, map, map2, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VsshCommunicationRequest)) {
            return false;
        }
        VsshCommunicationRequest vsshCommunicationRequest = (VsshCommunicationRequest) obj;
        return Intrinsics.areEqual(this.method, vsshCommunicationRequest.method) && Intrinsics.areEqual(this.path, vsshCommunicationRequest.path) && Intrinsics.areEqual(this.headers, vsshCommunicationRequest.headers) && Intrinsics.areEqual(this.body, vsshCommunicationRequest.body) && this.sslPinning == vsshCommunicationRequest.sslPinning && this.responseEncrypted == vsshCommunicationRequest.responseEncrypted && this.secureRequest == vsshCommunicationRequest.secureRequest && this.addSessionIdToRequest == vsshCommunicationRequest.addSessionIdToRequest;
    }

    public final boolean getAddSessionIdToRequest() {
        return this.addSessionIdToRequest;
    }

    public final Map<String, Object> getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final MethodType getMethod() {
        return this.method;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getResponseEncrypted() {
        return this.responseEncrypted;
    }

    public final boolean getSecureRequest() {
        return this.secureRequest;
    }

    public final boolean getSslPinning() {
        return this.sslPinning;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        MethodType methodType = this.method;
        int iHashCode = (methodType != null ? methodType.hashCode() : 0) * 31;
        String str = this.path;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.headers;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map2 = this.body;
        int iHashCode4 = (iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31;
        boolean z2 = this.sslPinning;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode4 + r02) * 31;
        boolean z3 = this.responseEncrypted;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        boolean z4 = this.secureRequest;
        ?? r04 = z4;
        if (z4) {
            r04 = 1;
        }
        int i4 = (i3 + r04) * 31;
        boolean z5 = this.addSessionIdToRequest;
        return i4 + (z5 ? 1 : z5);
    }

    public final void setAddSessionIdToRequest(boolean z2) {
        this.addSessionIdToRequest = z2;
    }

    public final void setBody(Map<String, ? extends Object> map) {
        this.body = map;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setMethod(MethodType methodType) {
        Intrinsics.checkParameterIsNotNull(methodType, C1561oA.od("M\u0004t\u0003:KI", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831072866))));
        this.method = methodType;
    }

    public final void setPath(String str) {
        short sXd = (short) (C1633zX.Xd() ^ (2027932305 ^ (-2027918254)));
        int[] iArr = new int["Bzm}7JJ".length()];
        QB qb = new QB("Bzm}7JJ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str, new String(iArr, 0, i2));
        this.path = str;
    }

    public final void setResponseEncrypted(boolean z2) {
        this.responseEncrypted = z2;
    }

    public final void setSecureRequest(boolean z2) {
        this.secureRequest = z2;
    }

    public final void setSslPinning(boolean z2) {
        this.sslPinning = z2;
    }

    public String toString() {
        short sXd = (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1464079658 ^ 1724722710)));
        short sXd2 = (short) (C1499aX.Xd() ^ ((1003409996 ^ 523933836) ^ (-619992779)));
        int[] iArr = new int["\u0014dqv\u001f<f\u0018LV~)\u0014Ww\u000f:On\f]]x+\u000baeH)`\u0003\f".length()];
        QB qb = new QB("\u0014dqv\u001f<f\u0018LV~)\u0014Ww\u000f:On\f]]x+\u000baeH)`\u0003\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i2)).append(this.method).append(C1561oA.Xd("K@\u0012\u0004\u0018\rb", (short) (FB.Xd() ^ (OY.Xd() ^ (69848145 ^ 179188))))).append(this.path);
        short sXd3 = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207814792)));
        int[] iArr2 = new int["I<\u0004\u007f\u0003\u0005\u0005\u0011\u0019a".length()];
        QB qb2 = new QB("I<\u0004\u007f\u0003\u0005\u0005\u0011\u0019a");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        StringBuilder sbAppend2 = sbAppend.append(new String(iArr2, 0, i3)).append(this.headers);
        short sXd4 = (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (2104357005 ^ 154961166)));
        short sXd5 = (short) (C1499aX.Xd() ^ (1697421219 ^ (-1697420831)));
        int[] iArr3 = new int["\u0016\tJVJ^!".length()];
        QB qb3 = new QB("\u0016\tJVJ^!");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
            i4++;
        }
        StringBuilder sbAppend3 = sbAppend2.append(new String(iArr3, 0, i4)).append(this.body).append(hg.Vd("yl?>6\u0019154.2*~", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1810212373 ^ (-679402575)))), (short) (ZN.Xd() ^ (1541341978 ^ 1541371504)))).append(this.sslPinning).append(C1561oA.ud("D7\tz\b\u0004\u0002\u007f\u0004tS{o}\u0004y|ljB", (short) (OY.Xd() ^ ((1373944889 ^ 1131368333) ^ 311135525)))).append(this.responseEncrypted).append(C1561oA.yd(")\u001cn_\\mi[Witwfss;", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (566440118 ^ (-1649954203)))))).append(this.secureRequest).append(C1561oA.Yd("\u0006z=AB2ETULSS/K<X<P]bSbd.", (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134246753)))).append(this.addSessionIdToRequest);
        int iXd = OY.Xd() ^ (-69953185);
        short sXd6 = (short) (C1580rY.Xd() ^ (1787780772 ^ (-1787762437)));
        short sXd7 = (short) (C1580rY.Xd() ^ iXd);
        int[] iArr4 = new int[ExifInterface.LONGITUDE_WEST.length()];
        QB qb4 = new QB(ExifInterface.LONGITUDE_WEST);
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) + sXd7);
            i5++;
        }
        return sbAppend3.append(new String(iArr4, 0, i5)).toString();
    }
}
