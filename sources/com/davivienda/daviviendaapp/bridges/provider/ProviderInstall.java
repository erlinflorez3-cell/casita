package com.davivienda.daviviendaapp.bridges.provider;

import android.content.Intent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JhP.`_2şs{B$c$wDCU(\u0004*ޛWN}gvJ`\fYƤ6\u0016'i\\I\u0004x\u001e\u001d\u001f6PpW3{qެ=`\u00039M&@,Py3\f`>\u0011\u001e\u0005\u0007[K:\u001f`D~Hj\r{\n`\u0017NV.\u00106\\\u0016[fLzmR/Q\u0014\u001aH\\9w2\u0013L;Y\u001b;U|o2C@eB[9\u001c\t\u0015gs?1L8=U\u00015+CI\"\\\rݠ,Џ\u00197WՕut,b\u0013X\u0001\u000e-3]l\u001c\\\u001c)\u0010z*\u000f\u0013ǌ\u0010Ν+H6Ʀըj\u001e"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wXPE|8\u001d\u0015u+$\u0014m=Ru'T0W:kNyDi", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Uo\fL\u0004)DmG\u000bDw'2LCHO=,$dh@\u0007pj9\u00041XPM,i6{K#\u000ea\u00155/\u001b\u0014YJ${\u001a", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`[95(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5dc\u0010T3E0\u0015|\u0001", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00031`\u0005\u001d3k\u001c\u0004", "Adc\u0010T3E0\u0015|\u0001", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006T!<`z\u001c5skq>", "5dc\u001bT4>", "", "7mbAT3E>&\t\fb+|\u0016", "", "1`[9U(<Y", "=m??b=BR\u0019\f^g:\f\u00056l`$\u007fG\u0001\u0016", ">/", "", ">0", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m??b=BR\u0019\f^g:\f\u00056l\u007f'", ">q^C\\+>`|\b\tm(\u0004\u0010/r", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ProviderInstall extends ReactContextBaseJavaModule implements ProviderInstaller.ProviderInstallListener {
    public Callback callBack;
    private final ReactApplicationContext reactContext;

    public static /* synthetic */ void $r8$lambda$lftamyMtGxb6YnnwUeRY2GTRJgw(ProviderInstall providerInstall) throws Throwable {
        Object[] objArr = {providerInstall};
        Method declaredMethod = Class.forName(ZO.xd(" \u001d%aHH\u007f\\\u0016p<DS\u0018H\t\r%h\u0007\u001f)\u0014M\u0002z`m\rt\f\tW\u0016,IDG=bai\u00167k\u001aKIPg31SH%W8/S\u0019p", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1145780896 ^ (-463753297)))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134238290)))).getDeclaredMethod(Ig.wd("N\u0002pSNiPDO\u0017\u0018AZes\u0011D}|<\r,ZU\u0018K", (short) (Od.Xd() ^ (962327726 ^ (-962310144)))), Class.forName(C1626yg.Ud("&x%;\u0015M\u0002N6YC|TnR\u0017F\u0016 G\u0007\u0003nX|_A\u007f\u0004&s-vOc2[\u0014K S\\(Q<\u0003-\u0004\t(O~r}B<O<\n+\n", (short) (C1580rY.Xd() ^ (797609461 ^ (-797614082))), (short) (C1580rY.Xd() ^ ((365571359 ^ 128415796) ^ (-309159928))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProviderInstall(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, EO.Od("o\u0011pX;?}>gZeE", (short) (Od.Xd() ^ (OY.Xd() ^ (2006809343 ^ (-1941325115))))));
        this.reactContext = reactApplicationContext;
    }

    private final void providerInstaller() {
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.davivienda.daviviendaapp.bridges.provider.ProviderInstall$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    ProviderInstall.$r8$lambda$lftamyMtGxb6YnnwUeRY2GTRJgw(this.f$0);
                }
            });
        } catch (IOException unused) {
        }
    }

    private static final void providerInstaller$lambda$1(ProviderInstall providerInstall) {
        Intrinsics.checkNotNullParameter(providerInstall, C1561oA.Qd("<//8gr", (short) (ZN.Xd() ^ (637423847 ^ 637404022))));
        ProviderInstaller.installIfNeededAsync(providerInstall.reactContext, providerInstall);
    }

    public final Callback getCallBack() {
        Callback callback = this.callBack;
        if (callback != null) {
            return callback;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C1593ug.zd("po{|Ssv\u007f", (short) (ZN.Xd() ^ (OY.Xd() ^ 69928342)), (short) (ZN.Xd() ^ (OY.Xd() ^ 69928375))));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C1561oA.od("#'++\u0017! \u0003$ &\u0018\u0012\u0012\u001ekwlyunh", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (821539771 ^ (-25098487)))));
    }

    @ReactMethod
    public final void installProvider(Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.Kd("_^jkbben", (short) (Od.Xd() ^ (713887184 ^ (-713904363)))));
        Object[] objArr = {callback};
        Method method = Class.forName(Wg.Zd("G\u0006}:\u0007w\u0007ux_uzf\u0018^\r\u0004-\u001a?\f{~\r\u0004w=;p;?4G \u0012\u001ep)~ZY>QPU\u0003\u001d=2K6\u000ffg8yt\nPWM", (short) (FB.Xd() ^ (FB.Xd() ^ (1969526850 ^ 713797487))), (short) (FB.Xd() ^ ((1881009925 ^ 93571681) ^ 1972262124)))).getMethod(Wg.vd("hYg5R\\[0^_f", (short) (C1633zX.Xd() ^ (1665726324 ^ (-1665702457)))), Class.forName(C1561oA.Xd("=JI\u000bD@CFDRSP\u0014YMJM_\u001aO`XTXW!7VbcZZ]f", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951493043))))));
        try {
            method.setAccessible(true);
            method.invoke(this, objArr);
            int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.reactContext);
            if (iIsGooglePlayServicesAvailable == 1) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("n.a\u0018ud3\u0018n\u0013\tCd\u000fYA\u0004\u000f78TB\u0007,r$/\\\bks `YNN4f\"\u0011a\u0004|-$RjB\u0007\u007f.\u0017CBRiy*\u0011O5", (short) (Od.Xd() ^ ((869704834 ^ 125741996) ^ (-883436528))), (short) (Od.Xd() ^ (516609575 ^ (-516592416))))).getMethod(ZO.xd("+\u000er&Hps\u001auAr", (short) (C1633zX.Xd() ^ (2003499818 ^ (-2003485592))), (short) (C1633zX.Xd() ^ (621488204 ^ (-621484962)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(this, objArr2)).invoke(null, true);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (iIsGooglePlayServicesAvailable == ((409845461 ^ 128353471) ^ 533412457)) {
                Class<?> cls = Class.forName(C1561oA.Yd("9FE\u0007><RFTHEOFD\u0012IG]Q_SPZQOP`a Uf^Z^]l(knlthdft1Twu}qmo}U{\u0002\u0004q}~", (short) (C1499aX.Xd() ^ (632490928 ^ (-632510508)))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd = (short) (ZN.Xd() ^ ((1050717834 ^ 1161874135) ^ 2078299394));
                short sXd2 = (short) (ZN.Xd() ^ (1566233402 ^ 1566244295));
                int[] iArr = new int["\t\b\u0018g\u0007\u0013\u0014j\u000b\u000e\u0017".length()];
                QB qb = new QB("\t\b\u0018g\u0007\u0013\u0014j\u000b\u000e\u0017");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                Method method3 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(this, objArr3)).invoke(null, true);
                    return;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (iIsGooglePlayServicesAvailable != (2133684267 ^ 2133684258)) {
                Object[] objArr4 = new Object[0];
                Method declaredMethod = Class.forName(Qg.kd(":EB\u000273G9E72:/+v,(<.:,'/$ \u001f-,h\u001c+!\u001b\u001d\u001a'`\"#\u001f%\u0017\u0011\u0011\u001dWx\u001a\u0016\u001c\u000e\b\b\u0014i\u000e\u0012\u0012}\b\u0007", (short) (OY.Xd() ^ (2057881101 ^ 2057870630)), (short) (OY.Xd() ^ ((1092295828 ^ 1967644123) ^ 878490222)))).getDeclaredMethod(hg.Vd("klhn`ZZf<`ddPZYQ]", (short) (Od.Xd() ^ (1022206712 ^ (-1022211728))), (short) (Od.Xd() ^ (1905493598 ^ (-1905523203)))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr4);
                    return;
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            Class<?> cls2 = Class.forName(C1561oA.ud("\u0017\"\u001f^\u0014\u0010$\u0016\"\u0014\u000f\u0017\f\bS\t\u0005\u0019\u000b\u0017\t\u0004\f\u0001|{\n\tEx\b}wyv\u0004=~\u007f{\u0002smmy4UvrxjddpFjnnZdc", (short) (C1499aX.Xd() ^ (66703389 ^ (-66683885)))));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr5 = new Object[0];
            short sXd3 = (short) (FB.Xd() ^ (1026391802 ^ 1026360562));
            int[] iArr2 = new int["MJX&KUT)?@G".length()];
            QB qb2 = new QB("MJX&KUT)?@G");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                i3++;
            }
            Method method4 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                method4.setAccessible(true);
                ((Callback) method4.invoke(this, objArr5)).invoke(null, true);
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i2, Intent intent) throws Throwable {
        Class<?> cls = Class.forName(C1626yg.Ud("\n\r8Fe\u007f\u0010q\u001eU\u0010G\u000f-sqn\u0019{?81AB\u0011\btx)e4m0\u0002k\u0010>}t?|wf1Z<{lC\u0011\u0005\u0010&\rt`0\u0010\u000bM]", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609504160)), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1434447737 ^ (-1693878083))))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ ((1555463589 ^ 81887703) ^ 1482152271));
        int[] iArr = new int["\u000bQ|quK5QMQa".length()];
        QB qb = new QB("\u000bQ|quK5QMQa");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Callback) method.invoke(this, objArr)).invoke(null, false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() throws Throwable {
        int iXd = C1499aX.Xd() ^ (-1134239393);
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("d:\n/\u001eW\r(oC=(LSX-ni5\u000e;\u007f+%,d\u0016f*\u00111FY\u0003@\u001diTW^mx\"9\u0011\\#lYFS,?m\u0014z{\\\u00150*", (short) (C1607wl.Xd() ^ iXd))).getMethod(C1561oA.Qd("\u0018\u0015#p\u000e\u0018\u0017k\n\u000b\u0012", (short) (OY.Xd() ^ (FB.Xd() ^ (633403624 ^ 2049962019)))), new Class[0]);
        try {
            method.setAccessible(true);
            ((Callback) method.invoke(this, objArr)).invoke(null, true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void setCallBack(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, C1593ug.zd("\u0017OBR\f\u001f\u001f", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864702221))), (short) (C1580rY.Xd() ^ ((296511134 ^ 898542174) ^ (-606245061)))));
        this.callBack = callback;
    }
}
