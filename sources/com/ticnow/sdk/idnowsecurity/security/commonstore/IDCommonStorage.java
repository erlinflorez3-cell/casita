package com.ticnow.sdk.idnowsecurity.security.commonstore;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007f\u0007l\u0018A0ZeP\u008cZS@\u000fsڔ<$q$yCAU0Ԃ@B\u007fN\u0016f'I\u0014KN\u001f\n$x\u0003,wVޯa\u0012\u001d4\u0013\u0016M8eqS8\u000fxf\u000b.5::\u0010\u0004/\u001e`\rN;QŖWë\u0016:Xr@X\u001bT%\u001c\u0018\u000eL)QDjqf8^k\f>_)\u0011lZP=^^\u0001\u0004Q\u0005\u0019}ˠ\u0003Ґ\"5X9; 3Z#\tXgM\f\u0010\u0018K\u0012\u0001)=*ww\b<f\u0003,\u0017AN;a)j\u001bI(ӧ\u0018ˏ/Y{MV\u001c6~\u001b}\u0013K\u0012\u0017V9V>E\u001a\u0015\fdޞ7ɤWFX\u061cvD\u0006\fo=g7\u000eEC9Ij(Ĭ}ϭR=\u0004˜% )\u0014|(,f\u001ct-\u001b\u0003{(Ŀ\u0014͘ANVˣq?s\u0019~iR<\u0012F_\u007f]\u007fgыYÉ;aA\u05fa9m\b_RnG\u0017n\u0001ki\u0001L\u0017̕1ގ;0\u0011ȱrFj\u001eyW%j:+e\u001c\u0003\u000bTܸUء`}Dƙ=\u0012Tjvp;_k&=/\u0015;0ʫ.ް[?fڨMSi-oYG&MZz\u0005\u0007j\u0019ʹNȺ`.*õ`l\u0016\u0017\nK\u001f\u001e!RWqJ8\u0003ւ[Å\u0019N\u000bٜZC\u0003*ma9\"\rvK$1mzږKɹTbxב\u007fzOO\u000bgrSOuM\u001b<TPld\u00031\n\u0017u\u0016F\u0016P}\u0011+ZLɤ\b°\u001a$QS5b!\u0016\u001f+8(;N\u001d\u0019sxe\u0014=y+}?Av1\u007f\n\u0001oZd!\u000f\u000e\u0019mǸ\u0003݈v- f\u0006\"oM\u001bIi}\u0019d\u000fo\u0001-q>d7+\tO$3\u0004\b$\u00134[G]aT<jٳ!˸as\b0\u007f\u000e\u001d-\u0015g\nXq\u001f@\t_\u000bJ=NH\b\u0003n(2o\u001bD^i&\fxMrQ\nǬMяt`PO\u0011]\fm'.\u0013 dd\u000b9}.L0u)\"G.\u001alF=\u0013cR\u0016q$\u0010\u001bO!\u0601\u0016ν\u007f;\u0007\u0014\"n.]wd\u000fb\u0014|hBOnz\u0005j=zҌ.ѧ\f\u000bKҍ:\u0012\u001e0\u0018F\u000eEmϫDǠ?V\u0016֊Ihd\u007f\u001d`s\u0019wƤ\u0003϶\u00133&֭\u009e5?"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017AEs<(\u001evpC\u0014cu2U\u0005QTV6e@\u0002G!\u000e\\\u000e$", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "D`[BX", "", "\u000fO8\u0015b:M", "5dc\u000eC\u0010!]'\u000e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eC\u0010!]'\u000e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u000fO8\u0018X@", "5dc\u000eC\u0010$S-", "Adc\u000eC\u0010$S-", "\u000fO8\"f,K", "5dc\u000eC\u0010.a\u0019\f", "Adc\u000eC\u0010.a\u0019\f", "\u0017C=\u001cJ&\u001a>|x]H\u001ak\u0003\u0013D_\u0011j$azv4", "5dc\u00167\u0015(E\u0013ZeB&_r\u001dTy\fZ i\u0006z(Sm)", "\u0017C=\u001cJ&\u001a>|x`> vl\u000eEh\u0017_!dv\u0004", "5dc\u00167\u0015(E\u0013ZeB&bh#_c\u0007[)ozw+Oz", "\u0017C=\u001cJ&\u001a>|xjL\fi\u0003\u0013D_\u0011j$azv4", "5dc\u00167\u0015(E\u0013ZeB&lv\u000fRy\fZ i\u0006z(Sm)", "\u0017C=\u001cJ&)@x_hX\u0010[", "5dc\u00167\u0015(E\u0013ig>\rj\u0003\u0013D", "\u0017C=\u001cJ&)@x_hX\u0014Xv\u001eEl\"a t", "5dc\u00167\u0015(E\u0013ig>\rj\u0003\u0017Am\u0017[-z|v;", "\u0017C=\u001cJ&,3vng>&gl\u0018_c\u0007[)ozw+Oz", "5dc\u00167\u0015(E\u0013lZ<\u001cih)Pc\u0011u$_v\u007f6Sn V\u0012", "\u0017C=\u001cJ&,6\u0007xeN\u001a_n\u000fYy\fZ i\u0006z(Sm)", "5dc\u00167\u0015(E\u0013l]L&gx\u001dHe\bo:duv0^q\u001dZ\u0005\"", "\u0017C=\u001cJ&,6\u0007xhB\u000een\u000fYy\fZ i\u0006z(Sm)", "5dc\u00167\u0015(E\u0013l]L&jl\u0011Ne\bo:duv0^q\u001dZ\u0005\"", "\u0017C=\u001cJ&.<|jj>&[h I]\bu$_v\u007f6Sn V\u0012", "5dc\u00167\u0015(E\u0013ncB\u0018lh)D_\u0019_\u001e`\u0011z&Ov+Z\u0006\u00199j", "\u0017C=\u001cJ&/\u001flxhB\u000ee", "5dc\u00167\u0015(E\u0013oF2&jl\u0011N", "!GB\u001dh:A", "5dc ;\u001a)c'\u0002", "Adc ;\u001a)c'\u0002", "!GB \\.G", "5dc ;\u001a,W\u001b\b", "Adc ;\u001a,W\u001b\b", "!dRBe,)W\"", "5dc X*N`\u0019i~g", "Adc X*N`\u0019i~g", "$0( \\.G", "5dc#$\u007f,W\u001b\b", "Adc#$\u007f,W\u001b\b", "7c=<j\u001c.7w", "5dc\u0016W\u0015He\tn^=", "Adc\u0016W\u0015He\tn^=", "9dh\u0014X5", "\u001a`]1e6BRb\rz\\<\n\r>yI.{T\u000f&!ToW\"v9\u0017Y\u0007\u000b3z\u00126MR;x\")\u0015f7", ";`bAX9$S-", "\u001a`]1e6BR,H\t^*\r\u00163t\u0014qyM\u0015\"&Q9u8\u000545fc KC", ">qT3f", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "\u0011n\\=T5B]\"", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDCommonStorage {
    public static final Companion Companion = new Companion(null);
    private final String IDNOW_API_HOST_IDENTIFIER;
    private final String IDNOW_API_KEY_IDENTIFIER;
    private final String IDNOW_API_USER_IDENTIFIER;
    private final String IDNOW_PREFS_ID;
    private final String IDNOW_PREFS_MASTER_KEY;
    private final String IDNOW_SECURE_PIN_IDENTIFIER;
    private final String IDNOW_SHS_PUSHKEY_IDENTIFIER;
    private final String IDNOW_SHS_SIGNKEY_IDENTIFIER;
    private final String IDNOW_UNIQUE_DEVICE_IDENTIFIER;
    private final String IDNOW_V19_SIGN;
    private final KeyGenParameterSpec keyGen;
    private final MasterKey masterKey;
    private final SharedPreferences prefs;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fTuj\u0007Lp\nq\u0013َ\u001a}"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017AEs<(\u001evpC\u0014cu2U\u0005QTV6e@\u0002G!\u000e\\\u000e\r\t\u0017\rd=-rN@t", "", "u(E", "7r=B_3(`x\u0007\u0006m@", "", "Asa", "", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isNullOrEmpty(String str) {
            return str == null || str.length() <= 0;
        }
    }

    public IDCommonStorage(Context context) throws Throwable {
        Intrinsics.checkParameterIsNotNull(context, EO.Od(".\u0012^D]F\u001e", (short) (OY.Xd() ^ 19750)));
        String strQd = C1561oA.Qd("\u0012\u0013\u001f\u0014!\u001d\u0016\u0010#\t\u001c\r\n\u001b\u0017\r\u0017\u001b\u007f\r\u007f\u0011\u0011\u0001\rx\u0004|\u0010t", (short) (C1607wl.Xd() ^ 24839));
        this.IDNOW_PREFS_MASTER_KEY = strQd;
        String strZd = C1593ug.zd("\u001f,+l4*%13<s0,79By=@46D\u007f6CBCFFLNJN>ED", (short) (Od.Xd() ^ (-21629)), (short) (Od.Xd() ^ (-11774)));
        this.IDNOW_PREFS_ID = strZd;
        short sXd = (short) (OY.Xd() ^ 31036);
        int[] iArr = new int["VPYY`gJeZYLF`SCI".length()];
        QB qb = new QB("VPYY`gJeZYLF`SCI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        this.IDNOW_UNIQUE_DEVICE_IDENTIFIER = new String(iArr, 0, i2);
        this.IDNOW_SHS_SIGNKEY_IDENTIFIER = C1561oA.Kd("\u0014\u0010\u001b\u001d&/\u00141&\u001c(5*! (", (short) (C1580rY.Xd() ^ (-25515)));
        this.IDNOW_SHS_PUSHKEY_IDENTIFIER = Wg.Zd("\u001d4\b`qc\u007fE\u0002\u000f\"JD2hG", (short) (Od.Xd() ^ (-755)), (short) (Od.Xd() ^ (-8104)));
        short sXd2 = (short) (C1607wl.Xd() ^ 15161);
        int[] iArr2 = new int["~z\u0006\b\u0011\u001a|\u001c\t\u0004\u0019".length()];
        QB qb2 = new QB("~z\u0006\b\u0011\u001a|\u001c\t\u0004\u0019");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        this.IDNOW_API_KEY_IDENTIFIER = new String(iArr2, 0, i3);
        this.IDNOW_API_USER_IDENTIFIER = Wg.vd("RLYYdkPmfcXd", (short) (Od.Xd() ^ (-30613)));
        this.IDNOW_API_HOST_IDENTIFIER = Qg.kd(")#,,3:\u001b87\u001f%((", (short) (FB.Xd() ^ 31201), (short) (FB.Xd() ^ 8690));
        this.IDNOW_SECURE_PIN_IDENTIFIER = hg.Vd("MGPPW^Q\\[KCG", (short) (ZN.Xd() ^ 21785), (short) (ZN.Xd() ^ 3490));
        this.IDNOW_V19_SIGN = C1561oA.ud("mgppw~tNUzyla^d", (short) (Od.Xd() ^ (-1496)));
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(strQd, 3);
        Object[] objArr = {new String[]{C1561oA.yd("KHO", (short) (ZN.Xd() ^ 6214))}};
        Method method = Class.forName(C1561oA.Yd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u001b\u000e\r \u001e\u0016\"(]\u001c\u0017,')%)\u001df\u0005 5\u0004#-\u0010\"4$1*:,:\u001c:0/p\u0010D9=68F", (short) (C1607wl.Xd() ^ 14672))).getMethod(Xg.qd("aTd3^bW`Cf\\^m", (short) (C1607wl.Xd() ^ 11844), (short) (C1607wl.Xd() ^ 27116)), String[].class);
        try {
            method.setAccessible(true);
            KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr);
            String[] strArr = new String[1];
            short sXd3 = (short) (Od.Xd() ^ (-28633));
            short sXd4 = (short) (Od.Xd() ^ (-30498));
            int[] iArr3 = new int["I\u001b0Y1Az8U".length()];
            QB qb3 = new QB("I\u001b0Y1Az8U");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
                i4++;
            }
            strArr[0] = new String(iArr3, 0, i4);
            short sXd5 = (short) (C1633zX.Xd() ^ (-14499));
            short sXd6 = (short) (C1633zX.Xd() ^ (-25825));
            int[] iArr4 = new int["2nvF\u000e\u0007h@\u0012=h4\u0015`\fL\u0006\u0014\u0010Dr{[\u0012<\u0012yMV\rb zo\u0003Szz4[\u0017?_|2<wR+'\"\u0012U".length()];
            QB qb4 = new QB("2nvF\u000e\u0007h@\u0012=h4\u0015`\fL\u0006\u0014\u0010Dr{[\u0012<\u0012yMV\rb zo\u0003Szz4[\u0017?_|2<wR+'\"\u0012U");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd6) + sXd5)));
                i5++;
            }
            Object[] objArr2 = {strArr};
            Method method2 = Class.forName(new String(iArr4, 0, i5)).getMethod(C1626yg.Ud("c\u0019<'N\u0004Iv8WDfM\u001b\"$]\u0003b[[", (short) (ZN.Xd() ^ 6988), (short) (ZN.Xd() ^ 15113)), String[].class);
            try {
                method2.setAccessible(true);
                KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr2);
                short sXd7 = (short) (OY.Xd() ^ 29774);
                int[] iArr5 = new int["\u0003]1\u001c\t=PJ</\u0017~LQL,;rEM\u0004].-|%`\"xS\n,>hi\"C[qp}\u0006\\C/W\u0012r\u00197O,\t".length()];
                QB qb5 = new QB("\u0003]1\u001c\t=PJ</\u0017~LQL,;rEM\u0004].-|%`\"xS\n,>hi\"C[qp}\u0006\\C/W\u0012r\u00197O,\t");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd7 + i6)));
                    i6++;
                }
                Object[] objArr3 = {256};
                Method method3 = Class.forName(new String(iArr5, 0, i6)).getMethod(EO.Od("W\"\u00012E}\u0006>\u0006_", (short) (Od.Xd() ^ (-6785))), Integer.TYPE);
                try {
                    method3.setAccessible(true);
                    KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr3);
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(C1561oA.Qd("Zf[hd]W dURc_U_c\u0017SL_XXRTF\u000e*CV#@H)9I7B9G7C#?30o\r?24++7", (short) (C1633zX.Xd() ^ (-4575)))).getMethod(C1593ug.zd(";ODHA", (short) (C1607wl.Xd() ^ 8523), (short) (C1607wl.Xd() ^ 1257)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) method4.invoke(builder4, objArr4);
                        Intrinsics.checkExpressionValueIsNotNull(keyGenParameterSpec, C1561oA.od("\u00181D\u0011.6\u0017'7%0'5%1\u0011-!\u001egz- \"쳲\u001d-\u0017XaccU5JIHGFEDCP\u0004\u0016\t\u000b\u0002DD", (short) (FB.Xd() ^ 19133)));
                        this.keyGen = keyGenParameterSpec;
                        MasterKey masterKeyBuild = new MasterKey.Builder(context).setKeyGenParameterSpec(keyGenParameterSpec).build();
                        Intrinsics.checkExpressionValueIsNotNull(masterKeyBuild, C1561oA.Kd("7L_aSa;Vk!6j_c\\^l#_llsey\ud8b4piyky[yon4xs\tWv\u0001<Bw\f\u0001\u0005}BD", (short) (C1607wl.Xd() ^ 20449)));
                        this.masterKey = masterKeyBuild;
                        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, strZd, masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                        Intrinsics.checkExpressionValueIsNotNull(sharedPreferencesCreate, Wg.Zd("q8\u0019C6J:F1\u001c>3O>J2@N;WPV[\\柏TvYz[|gHefnrw<[Z\\HGSxle[R", (short) (Od.Xd() ^ (-18854)), (short) (Od.Xd() ^ (-22964))));
                        this.prefs = sharedPreferencesCreate;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public final String getAPIHost() {
        return this.prefs.getString(this.IDNOW_API_HOST_IDENTIFIER, "");
    }

    public final String getAPIKey() {
        return this.prefs.getString(this.IDNOW_API_KEY_IDENTIFIER, "");
    }

    public final String getAPIUser() {
        return this.prefs.getString(this.IDNOW_API_USER_IDENTIFIER, "");
    }

    public final String getIDNOW_API_HOST_IDENTIFIER() {
        return this.IDNOW_API_HOST_IDENTIFIER;
    }

    public final String getIDNOW_API_KEY_IDENTIFIER() {
        return this.IDNOW_API_KEY_IDENTIFIER;
    }

    public final String getIDNOW_API_USER_IDENTIFIER() {
        return this.IDNOW_API_USER_IDENTIFIER;
    }

    public final String getIDNOW_PREFS_ID() {
        return this.IDNOW_PREFS_ID;
    }

    public final String getIDNOW_PREFS_MASTER_KEY() {
        return this.IDNOW_PREFS_MASTER_KEY;
    }

    public final String getIDNOW_SECURE_PIN_IDENTIFIER() {
        return this.IDNOW_SECURE_PIN_IDENTIFIER;
    }

    public final String getIDNOW_SHS_PUSHKEY_IDENTIFIER() {
        return this.IDNOW_SHS_PUSHKEY_IDENTIFIER;
    }

    public final String getIDNOW_SHS_SIGNKEY_IDENTIFIER() {
        return this.IDNOW_SHS_SIGNKEY_IDENTIFIER;
    }

    public final String getIDNOW_UNIQUE_DEVICE_IDENTIFIER() {
        return this.IDNOW_UNIQUE_DEVICE_IDENTIFIER;
    }

    public final String getIDNOW_V19_SIGN() {
        return this.IDNOW_V19_SIGN;
    }

    public final String getIdNowUUID() {
        return this.prefs.getString(this.IDNOW_UNIQUE_DEVICE_IDENTIFIER, "");
    }

    public final String getSHSPush() {
        return this.prefs.getString(this.IDNOW_SHS_PUSHKEY_IDENTIFIER, "");
    }

    public final String getSHSSign() {
        return this.prefs.getString(this.IDNOW_SHS_SIGNKEY_IDENTIFIER, "");
    }

    public final String getSecurePin() {
        return this.prefs.getString(this.IDNOW_SECURE_PIN_IDENTIFIER, "");
    }

    public final String getV19Sign() {
        return this.prefs.getString(this.IDNOW_V19_SIGN, "");
    }

    public final void setAPIHost(String str) {
        this.prefs.edit().putString(this.IDNOW_API_HOST_IDENTIFIER, str).apply();
    }

    public final void setAPIKey(String str) {
        this.prefs.edit().putString(this.IDNOW_API_KEY_IDENTIFIER, str).apply();
    }

    public final void setAPIUser(String str) {
        this.prefs.edit().putString(this.IDNOW_API_USER_IDENTIFIER, str).apply();
    }

    public final void setIdNowUUID(String str) {
        this.prefs.edit().putString(this.IDNOW_UNIQUE_DEVICE_IDENTIFIER, str).apply();
    }

    public final void setSHSPush(String str) {
        this.prefs.edit().putString(this.IDNOW_SHS_PUSHKEY_IDENTIFIER, str).apply();
    }

    public final void setSHSSign(String str) {
        this.prefs.edit().putString(this.IDNOW_SHS_SIGNKEY_IDENTIFIER, str).apply();
    }

    public final void setSecurePin(String str) {
        this.prefs.edit().putString(this.IDNOW_SECURE_PIN_IDENTIFIER, str).apply();
    }

    public final void setV19Sign(String str) {
        this.prefs.edit().putString(this.IDNOW_V19_SIGN, str).apply();
    }
}
