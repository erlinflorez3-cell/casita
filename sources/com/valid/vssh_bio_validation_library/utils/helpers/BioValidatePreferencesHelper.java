package com.valid.vssh_bio_validation_library.utils.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007fјnjG<LeN3hݷH\u001d\u001c{b#\u0014#\u007f\u0004Fe\u001e\f\"!O|h̊rJh\r\u0014\u001e\u0014\u0016\u0011jZJǤ|c\u001aƁJDuBAQ@IGe\r63&\tĵ:ѩ\t\u0001\"ݒ\u00196\u0005\u0004[M\"\u0011^H!@`\u0014e\u00070\u00114FVE\\!>\u07b5BՂpgR1)\rwMn)e<\u000bZϞJc"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^ka@\u0012c9\\@\u0004KV?(cVq9#\u0012E\u001bN,\r\u0012YJ\"nR\u001a\u001f\u000f7I\u000f\u0011", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "Asa6a.", "", "BnZ2a\u001cGW%\u000fz;@[\t@i}(", "5dc!b2>\\\t\b~j<|eCD\u007f9\u007f>\u0001", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!b2>\\\t\b~j<|eCD\u007f9\u007f>\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u0011n\\=T5B]\"", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidatePreferencesHelper {
    public static final Companion Companion;
    private static final String KEY_VALIDATION;
    private static final int MODE_PRIVATE = 0;
    public static final String PREF_NAME;
    private final Context context;
    private final SharedPreferences preferences;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007f\u0007lj?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004|4܋a̓FoG\u074c\u001e{K>xtd\u0007v\u074ctأ}\u0005\tɝݻL\u0016"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^ka@\u0012c9\\@\u0004KV?(cVq9#\u0012E\u001bN,\r\u0012YJ\"nR\u001a\u001f\u000f7I\u000fyF\u000b\u0014!\n>nzK,", "", "u(E", "\u0019DH,I\b%7wZiB\u0016e", "", "\u001bN3\u0012R\u0017+7\nZi>", "", "\u001eQ4\u0013R\u0015\u001a;x", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        short sXd = (short) (C1580rY.Xd() ^ ((1481519103 ^ 1363247601) ^ (-152034660)));
        int[] iArr = new int["4_B%bCLr-\u0011\u001bZB'".length()];
        QB qb = new QB("4_B%bCLr-\u0011\u001bZB'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        PREF_NAME = new String(iArr, 0, i2);
        KEY_VALIDATION = EO.Od(">fj+c\u001bLS\r\t\u0018p! ", (short) (C1580rY.Xd() ^ ((1131733461 ^ 2103230121) ^ (-1042829895))));
        Companion = new Companion(null);
    }

    public BioValidatePreferencesHelper(Context context) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (1797919436 ^ (-528173071))));
        int[] iArr = new int["NYW\\L^Y".length()];
        QB qb = new QB("NYW\\L^Y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        this.context = context;
        int iXd = C1607wl.Xd() ^ 1849975241;
        short sXd2 = (short) (FB.Xd() ^ ((621380712 ^ 1427051213) ^ 1879489478));
        short sXd3 = (short) (FB.Xd() ^ iXd);
        int[] iArr2 = new int["!$\u0018\u001a\u001a(\u001c&\u001c\u001f.\u0007\"7".length()];
        QB qb2 = new QB("!$\u0018\u001a\u001a(\u001c&\u001c\u001f.\u0007\"7");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        Class<?> cls = Class.forName(C1561oA.od("Q]R_[TN\u0017KVTYIQV\u000f#NLQASN", (short) (C1633zX.Xd() ^ ((913225523 ^ 1027294042) ^ (-190157148)))));
        Class<?>[] clsArr = new Class[ZN.Xd() ^ (1650426616 ^ 1372961802)];
        clsArr[0] = Class.forName(C1561oA.Kd("aYo[)h^lf.Tvumsm", (short) (C1580rY.Xd() ^ ((1834690559 ^ 29621186) ^ (-1821956057)))));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = new Object[(715649849 ^ 978361041) ^ 284649962];
        objArr[0] = str;
        objArr[1] = 0;
        Method method = cls.getMethod(Wg.Zd("\u0016+cg6F|\u0019MP\u001c3m\u00046RP^\b;", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (806751404 ^ 1145516222))), (short) (C1580rY.Xd() ^ (314876695 ^ (-314869264)))), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, C1561oA.Xd("FSSZL`]\u0018RQaAWQcWWDg[]]k_刼$MPDF`PDQJ2'UXNPk]`XfRfX=", (short) (C1607wl.Xd() ^ ((471250094 ^ 891308089) ^ 691461811))));
            this.preferences = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getTokenUniqueByDevice() {
        SharedPreferences sharedPreferences = this.preferences;
        short sXd = (short) (ZN.Xd() ^ ((2045629090 ^ 1680020149) ^ 500095353));
        int[] iArr = new int["}v\u000er\rv\u0005\u0001~z\u0011\u0005\u000e\f".length()];
        QB qb = new QB("}v\u000er\rv\u0005\u0001~z\u0011\u0005\u000e\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        return sharedPreferences.getString(new String(iArr, 0, i2), "");
    }

    public final void setTokenUniqueByDevice(String str) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        int iXd = FB.Xd() ^ (1143576084 ^ 466019738);
        editorEdit.putString(Qg.kd("f_rWmWa]WSeY^\\", (short) (OY.Xd() ^ ((360526898 ^ 1054308692) ^ 732566108)), (short) (OY.Xd() ^ iXd)), str);
        editorEdit.apply();
    }
}
