package com.valid.vssh_bio_validation_library.utils.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`S2şs{J$c$\u007fLC٥\"}0\u0015WNmn\u0005Ϻx s\u000f4\u00151iA\n`\ta \u000fJB\u001e@ݯQoK;)\rD\f82P@*\u0015\u000f#BT x\u000bCy\u0017\"2PphZ;WM  \u0012V\"\u0017\u001d\u000bt\u0017<Vzu<E\"1v\u000bn5nH|{\u0015vX5\u001d\u000faL8pGC&=_\u0013\tb[m\u000eOsM\u0005\u0017/U5\u0012\u007feHp\u007fB\u001d[S\u001bm\u000b&\u000b\u0012\u001ax\u001a:CO\u0012S\u0001\u001e6\f\u0013\b\u001d>\u0014\u000e42X0=\u001a\u0015\u0010<=E~aCh\u0002\rFVаcي\u001b%\bđ{E)kiai\u001f%ќ}˿\u0011\u001e+Ч\u0382%q"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^ka@\u0012c9\\@\u0015GJ^9\\=\u007f=\u0015\u0012g\u000eW)\r\u0013<A+yDDt", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";`X;>,R", "\u001a`]1e6BR,H\t^*\r\u00163t\u0014qyM\u0015\"&Q9u8\u000545fc KC", "AgP?X+)`\u0019\u007f\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "2d[2g,\u001dO(zhZ-|\u0010C", "", "7r32_,MS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u0011T;:A\u0015\u007fze@", "", "5dc\u0018X@'O!~hZ-|\u0010C", "Adc\u0011T;,O\u001a~\u0002r", "D`[BX", "@db=b5LS", "Adc\u0018X@'O!~hZ-|\u0010C", "D`[6W(MSx\u0012~l;j\t-u\r(Z<\u0010\u0013", "3wX@g\u000b:b\u0015", "\u0011n\\=T5B]\"", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class SecurePreferencesHelper {
    public static final Companion Companion;
    private static final String KEY_NAME_DATA;
    private static final String SECRET_KEY = hg.Vd(",(:&\u0017(%62$\t\"5", (short) (C1607wl.Xd() ^ ((2037505698 ^ 1129299816) ^ 977165766)), (short) (C1607wl.Xd() ^ ((51370188 ^ 54744371) ^ 5018958)));
    private final MasterKey mainKey;
    private final SharedPreferences sharedPrefs;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^ka@\u0012c9\\@\u0015GJ^9\\=\u007f=\u0015\u0012g\u000eW)\r\u0013<A+yDD]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "\u0019DH,A\b&3\u0013]VM\b", "", "!D2\u001f8\u001b89xr", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        short sXd = (short) (C1499aX.Xd() ^ (Od.Xd() ^ (103077947 ^ (-1104743727))));
        int[] iArr = new int["KDW+=H?\u001d9K7".length()];
        QB qb = new QB("KDW+=H?\u001d9K7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        KEY_NAME_DATA = new String(iArr, 0, i2);
        Companion = new Companion(null);
    }

    public SecurePreferencesHelper(Context context) throws GeneralSecurityException, IOException {
        Intrinsics.checkParameterIsNotNull(context, C1561oA.yd("P]]dNb_", (short) (C1499aX.Xd() ^ (1689180948 ^ (-1689160700)))));
        MasterKey masterKeyBuild = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkExpressionValueIsNotNull(masterKeyBuild, C1561oA.Yd("I^qsesMh}3H|qunp~5q~~\u0006w\f\ue233GKMw`]hE'>?@ABCDET\n\u001e\u0013\u0017\u0010TV", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1527801626 ^ 1754933181)))));
        this.mainKey = masterKeyBuild;
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, Xg.qd("v~\u0006\u0005}\u000e\r\u0005\u007f|\u0015\u0001\r\u000b\u0007\u0003\u0015\u0018\f\u000e\u000e\u001c\u0010\u001a\u0010\u0013\"", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1000928887 ^ (-2085968964)))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849952792)))), masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferencesCreate, Jg.Wd("J\u007f0\fORQNJE\u0016\\*)$\u001c:9uA\u000b\n\f\r\uf4a0\"\\\rYjcwmB\u0011a,\u0017\u0015\"H<sOHjfrn\u0004", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864702367))), (short) (C1633zX.Xd() ^ ((1800007575 ^ 1296400549) ^ (-638321419)))));
        this.sharedPrefs = sharedPreferencesCreate;
    }

    public final void deleteDataSafely(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, ZO.xd("\u001cj\u0006|\u001eo*B", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (339865354 ^ (-2047184865)))), (short) (C1633zX.Xd() ^ ((1611811526 ^ 1447516636) ^ (-911555572)))));
        Map<String, ?> all = this.sharedPrefs.getAll();
        String strUd = C1626yg.Ud("+w2G\u001dy{\u0019_z-N\u001a", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207814538))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849954885))));
        if (!all.containsKey(strUd)) {
            function1.invoke(false);
            return;
        }
        SharedPreferences.Editor editorEdit = this.sharedPrefs.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, Ig.wd("pI\\\u0003'M", (short) (C1633zX.Xd() ^ ((1238531551 ^ 1473494493) ^ (-503415032)))));
        editorEdit.remove(strUd);
        editorEdit.apply();
        function1.invoke(true);
        editorEdit.apply();
    }

    public final String getDataSafely() {
        return this.sharedPrefs.getString(EO.Od("0}\u0013'I\u0001bd\u0015+ggJ", (short) (C1633zX.Xd() ^ (628719906 ^ (-628734926)))), null);
    }

    public final String getKeyNameSafely() {
        SharedPreferences sharedPreferences = this.sharedPrefs;
        short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134263005));
        int[] iArr = new int["\u001c\u0015({\u000e\u0019\u0010m\n\u001c\b".length()];
        QB qb = new QB("\u001c\u0015({\u000e\u0019\u0010m\n\u001c\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return sharedPreferences.getString(new String(iArr, 0, i2), null);
    }

    public final void setDatSafely(String str, Function1<? super Boolean, Unit> function1) {
        int iXd = OY.Xd() ^ (-69930026);
        int iXd2 = ZN.Xd() ^ (608589185 ^ (-399259758));
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["\tt\u0001\u000b{".length()];
        QB qb = new QB("\tt\u0001\u000b{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(function1, C1561oA.od("M?LHFDH9", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1612487392 ^ 340646977)))));
        SharedPreferences.Editor editorEdit = this.sharedPrefs.edit();
        short sXd3 = (short) (FB.Xd() ^ ((1061682820 ^ 1594345007) ^ 1614833226));
        int[] iArr2 = new int["RRXd`d".length()];
        QB qb2 = new QB("RRXd`d");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, new String(iArr2, 0, i3));
        String strZd = Wg.Zd("h|'+t\u001e3\\)30\"M", (short) (FB.Xd() ^ (Od.Xd() ^ (1709133484 ^ 572700714))), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (1320964086 ^ (-220682144)))));
        editorEdit.putString(strZd, str);
        editorEdit.apply();
        editorEdit.apply();
        if (this.sharedPrefs.getAll().containsKey(strZd)) {
            function1.invoke(true);
        } else {
            function1.invoke(false);
        }
    }

    public final void setKeyNameSafely(String str) {
        Intrinsics.checkParameterIsNotNull(str, C1561oA.Xd("WCOYJ", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849977565))));
        SharedPreferences.Editor editorEdit = this.sharedPrefs.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, Wg.vd("++-99=", (short) (Od.Xd() ^ (1325788063 ^ (-1325782585)))));
        editorEdit.putString(Qg.kd("E>Q%7B9\u00173E1", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134253444))), (short) (FB.Xd() ^ (FB.Xd() ^ (419235160 ^ 1192374421)))), str);
        editorEdit.apply();
        editorEdit.apply();
    }

    public final void validateExistSecureData(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, hg.Vd("hzjssB^p\\", (short) (C1607wl.Xd() ^ (1622484570 ^ 1622475986)), (short) (C1607wl.Xd() ^ ((744850708 ^ 1233872507) ^ 1710161304))));
        if (this.sharedPrefs.getAll().containsKey(C1561oA.ud("jfxdUfctpbG`s", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (493631702 ^ 1932007776)))))) {
            function1.invoke(true);
        } else {
            function1.invoke(false);
        }
    }
}
