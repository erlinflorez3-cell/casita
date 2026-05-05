package com.ticnow.sdk.idnowsecurity.http.secure;

import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.api.IDNowSettings;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005,Bߚ\u0016\u0014\u0017jg/|dUnUޚ.\u000fy{\u0005<i%\nCiWpԉ.\u07beSZo˧\u0007L`\u000eQ\u0013&\u0018~o:O&\u0011k\u0019'2pq\u0016ݓYڱAEhҚN\u0007&:0<\u001a\u0007\u0007#8N`\u000f\tMc\f@2\u0017\u0088Fň\u0011Y\r܅*\bD+\u000f\"|iTBVrӀ>="}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001{\u0016,]P;5\u0018|}rs'\u0007a<[v\u0014GX^,jaH", "", "u(E", "=r", "", "5dc\u001cf", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001cf", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">`h9b(=", "5dc\u001dT@E]\u0015}", "Adc\u001dT@E]\u0015}", "CtX17,OW\u0017~", "5dc\"h0=2\u0019\u0010~\\,", "Adc\"h0=2\u0019\u0010~\\,", "\u0011n\\=T5B]\"", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDNowSecureRequest {
    public static final Companion Companion = new Companion(null);
    private String payload = "";
    private String uuidDevice = "";
    private String os = "";

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fsڔ:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#/Q\u0010\u001e\u0016'l\\Mc{u\u0012=4rsM7eok>\u0011xD\u000b82P?*\t\u000f\"BH>\u007fڂGU"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001{\u0016,]P;5\u0018|}rs'\u0007a<[v\u0014GX^,ja1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", ">q^AX*M", "", "@`f\u001fX8NS'\u000e", "7mXA85K] \u0006iK\u001f", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String protect(String str, boolean z2, Context context, Activity activity) throws Throwable {
            Intrinsics.checkParameterIsNotNull(str, C1561oA.ud("-\u001b0\n\u001c'*\u0019&&", (short) (OY.Xd() ^ 13347)));
            Intrinsics.checkParameterIsNotNull(context, C1561oA.yd("\u007f\r\t\u0010\u0006\u001a\u0013", (short) (C1607wl.Xd() ^ 23376)));
            Intrinsics.checkParameterIsNotNull(activity, C1561oA.Yd("qt\u0007|\u000b~\u000b\u0011", (short) (C1499aX.Xd() ^ (-10059))));
            IDNowSecureRequest iDNowSecureRequest = new IDNowSecureRequest();
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            iDNowSecureRequest.setUuidDevice(iDSecurityApiImpl.getDeviceUUID(context, activity));
            iDNowSecureRequest.setOs(IDNowSettings.Companion.getOs(context));
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkExpressionValueIsNotNull(bytes, Xg.qd("H\u0016\u000b\r\u0018E\b\u001bH\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)( & bh#\"2\u000195'6k(.(:</?t", (short) (C1633zX.Xd() ^ (-28417)), (short) (C1633zX.Xd() ^ (-24328))));
            byte[] bArrEncryptDataInit = z2 ? iDSecurityApiImpl.encryptDataInit(context, activity, bytes) : iDSecurityApiImpl.encryptData(context, activity, bytes);
            short sXd = (short) (C1607wl.Xd() ^ 1530);
            short sXd2 = (short) (C1607wl.Xd() ^ 11023);
            int[] iArr = new int[".B?MR\u000bM_&,AK\u0015)\u000f`\u001bjo".length()];
            QB qb = new QB(".B?MR\u000bM_&,AK\u0015)\u000f`\u001bjo");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Object[] objArr = {bArrEncryptDataInit, 0};
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(ZO.xd("\bf:\u001cv ", (short) (FB.Xd() ^ 14300), (short) (FB.Xd() ^ 7342)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                short sXd3 = (short) (C1499aX.Xd() ^ (-15778));
                short sXd4 = (short) (C1499aX.Xd() ^ (-21000));
                int[] iArr2 = new int["p`G\u000f2yuk5yG]\u000bWs\u000b\u0011__XTNNUb|Z;!;[z/Xo8cwx=".length()];
                QB qb2 = new QB("p`G\u000f2yuk5yG]\u000bWs\u000b\u0011__XTNNUb|Z;!;[z/Xo8cwx=");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                Intrinsics.checkExpressionValueIsNotNull(bArr, new String(iArr2, 0, i3));
                iDNowSecureRequest.setPayload(new String(bArr, Charsets.UTF_8));
                String json = new Gson().toJson(iDNowSecureRequest);
                Intrinsics.checkExpressionValueIsNotNull(json, Ig.wd("`^h\u000fI\u0016~\raKn\u0015e\u001d@S\u0019%yt\u001be_[9\u0013uQ", (short) (C1499aX.Xd() ^ (-17119))));
                return json;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final String getOs() {
        return this.os;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getUuidDevice() {
        return this.uuidDevice;
    }

    public final void setOs(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.os = str;
    }

    public final void setPayload(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.payload = str;
    }

    public final void setUuidDevice(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuidDevice = str;
    }
}
