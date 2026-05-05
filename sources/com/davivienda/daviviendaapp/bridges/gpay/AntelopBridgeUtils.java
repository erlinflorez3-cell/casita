package com.davivienda.daviviendaapp.bridges.gpay;

import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjO0L͜P.`\\2\u000fq{:Ơ[:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u0017Q\u0012\u001e\u0016'n\\Mc}u\u0012=8\u000b{M:eokA\u0011xD\u000e82P<J\u0011\u000f\u001bBH>xQŒMë\u00160H\u0081ĖV\u0017"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\t[z&IL>;`Y\u0001\u0013", "", "u(E", "30%\u0001", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "/mc2_6I3&\f\u0005k\u001b\u0007p/s\u000e$}@", "", "3qa", "\u001aea{T5MS \t\u0006(:{\u000fxA\t7{G\u000b\"vT|\u0018IL", "7rE._0=3dOI", "", ">g^;X", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AntelopBridgeUtils {
    public static final AntelopBridgeUtils INSTANCE = new AntelopBridgeUtils();
    private static final Regex e164;

    static {
        short sXd = (short) (C1607wl.Xd() ^ (1825311155 ^ 1825338954));
        short sXd2 = (short) (C1607wl.Xd() ^ ((1752293126 ^ 1969950543) ^ 488283041));
        int[] iArr = new int["?>\u000e?\u0015\u0013 Ed \u0017\u001d\"k\u0013".length()];
        QB qb = new QB("?>\u000e?\u0015\u0013 Ed \u0017\u001d\"k\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        e164 = new Regex(new String(iArr, 0, i2));
    }

    private AntelopBridgeUtils() {
    }

    public final String antelopErrorToMessage(AntelopError antelopError) {
        Intrinsics.checkNotNullParameter(antelopError, C1561oA.od("*65", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134256306))));
        AntelopErrorCode code = antelopError.getCode();
        int reason = antelopError.getReason();
        String message = antelopError.getMessage();
        if (message == null) {
            message = "";
        }
        StringBuilder sbAppend = new StringBuilder().append(code);
        short sXd = (short) (ZN.Xd() ^ (1755397668 ^ 1755412395));
        int[] iArr = new int["\u007f\t".length()];
        QB qb = new QB("\u007f\t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        return StringsKt.trim((CharSequence) sbAppend.append(new String(iArr, 0, i2)).append(reason).append(Wg.Zd(",\u000e", (short) (FB.Xd() ^ (OY.Xd() ^ (2019553707 ^ 2088026302))), (short) (FB.Xd() ^ (OY.Xd() ^ (2038391214 ^ 2102673289))))).append(message).toString()).toString();
    }

    public final boolean isValidE164(String str) {
        short sXd = (short) (OY.Xd() ^ (Od.Xd() ^ 1207799092));
        int[] iArr = new int["\u001d\u0016\u001e\u001e\u0016".length()];
        QB qb = new QB("\u001d\u0016\u001e\u001e\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        return e164.matches(str);
    }
}
