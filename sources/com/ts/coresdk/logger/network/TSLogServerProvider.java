package com.ts.coresdk.logger.network;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.JsonStringConvertor;
import com.ts.coresdk.TSCall;
import com.ts.coresdk.TSCallback;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.TSNetworkManager;
import com.ts.coresdk.TSNetworkResponse;
import com.ts.coresdk.controllers.TSDataSyncServer;
import com.ts.coresdk.logger.db.TSLogEntity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&˛\bDZc|\u0004G\b8\u000b<N\u0007\"2\u0012\u007f\u0007tqA0JeP.hS2\u000f\u0002{<$q$yCIU\"Ԃ*\t]logtOb\u000bY\u000f\fǝ\u000f̓JH\u0006\u0005m\u0014\u001f2pzO5]okE\u000f\rn\u0005\u001fGbE\n\t\u000f BH>vټGM\u0012(>W9_`\fe\u0005H\u00176B.\u00076\\\u0016SfLzdR/Q\b\u001aF\\0w0+USFù+\u000f|`,5\t^C\u0014=S1\u0015\u0003_M\tWqk\u0010\u0019-52aum5\u0007\fD\u00199X%]!3#\u0019Ōd\u000e-*]r\u0014}\u001c'\u0010z*\u001bl\u000e\u001c\f?N>/*f6\u0019a\u0005#YNW\u001a`X~)mf\u001b3\tK+g(-eň?\u001bT6\n\u0016U/1\u0013\u0007!\nY6`C \u001bwΦ5SFOVaRjK\u0002\u001cp\u0011\u0007R\u0004^LF/ɨ\u00150\u001d9En\n;/j\u001aHrg-\n7íUׂVRH$t\u0017E,!\u000e`Gr\t"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~Hk\u0007Ao\u0004.ZT;x\u001f+\u001fye8\u0007p\u0002", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1g", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "H", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "", ">/", ">0", "", ">1", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0013\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0016D9|*]/79\u0007/;|*\u0004", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "", "uKR<`uMab|\u0005k,\u000b\b5/\u00072}B\u0001$`FlW+d\f?[])Fq%B#*@gE\u001a^o]B\t-\u001dXz&\u001d3L6d\u001c\u0002K]\u0010d\u001bN9\f\u000b#%\u0013\\,A\u001e\u00183IeDi\u000baY~", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006g/9XS\u00075w\u001ew\\Q\u0005i>+\u0015v`?PG\u001b<^1F\\U,@[sGiUK", "7", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "6", "\"R;<Z\bIW\u0007~\bo0z\t", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSLogServerProvider implements TSDataSyncServer<TSLogEntity, Void> {

    /* JADX INFO: renamed from: a */
    public static final a f18285a = new a(null);
    private final Context ch;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000ePLш|\u0004O\r8\u000b4B\u0007\"B\u0012\u007fјnjG6LeN0ZS@\u000fs{J$c$wCCU(Ԃ(neȞ\u0018g\u001dY#jQ\u001c\u001e\u001c\tl<I\u0004\u0005\f\u001d?8HnM3eok8\u0011xD\u000782P9*\u000b\u0007\u00198K(v)B{\u0012\u0018/NuRR;Q5\u001e \rV /$\rmT5Vtu:]\"3oHM5hH|{\fvZ-\f\u0005k6+n6{:ȏW\u0005\r_iM"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~Hk\u0007Ao\u0004.ZT;x\u001f+\u001fye8\u0007pj=d\u000eQN*7`@rJ%\u0016X\u000e$", "", ">/", "", ">0", ">1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~G}-Hm#\u0015WEIA", ">2", "", ">3", ">4", ">5", ">6", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0006wG\bl", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "Ad]1?6@a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044AEs}-#2_C\u0014c:M|pNVP.\\_<F\u0014!l\u0018[1VrYN5nQ\u001e)\n:\u001fe\"m|\u001d\u0012W<fyD }V\u0007\u0019~C~OKUpu\u0011HAk,.yn*`C<yzv\u0015,d\u001a5\u0006\u0005UZ`a\u0007kpIn>\u001f\"Hu%US9SF\u0002'-J\u0002A\u0001 6p2{\u0003", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public interface TSLogApiService {
        @InterfaceC1492Gx
        @POST("a\u001e$\u001b]$,\u001e8h ( \u001b',q=0)8j/!8/JzB9B;G7BQ}IDE=\u0007PUJJ>E`")
        TSCall<Void> sendLogs(@InterfaceC1492Gx @Header("\fa\n\n|{f\b!1\u001f#!5#") String str, @InterfaceC1492Gx @Header("\fa\n\n|{f\u000f%*#24\"/3") long j2, @InterfaceC1492Gx @Header("\fa\n\n|{f\u000e%$, 464(") String str2, @Body ServerLogs serverLogs, @Path(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) @InterfaceC1492Gx int i2, @Path(">9N\u0003E9F?") @InterfaceC1492Gx String str3, @Path("FMHJ<E") @InterfaceC1492Gx String str4, @Path("FI7\u0003JQLN@I") @InterfaceC1492Gx String str5);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u0003İGّ1!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~Hk\u0007Ao\u0004.ZT;x\u001f+\u001fye8\u0007pjJL", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements TSCallback<Void> {
        final /* synthetic */ ITSModuleInfo cj;

        b(ITSModuleInfo iTSModuleInfo) {
            this.cj = iTSModuleInfo;
        }

        @Override // com.ts.coresdk.TSCallback
        public void error(TSNetworkResponse tSNetworkResponse) {
            Intrinsics.checkNotNullParameter(tSNetworkResponse, "");
            TSLog.e(TSLogServerProvider.this.z(), this.cj, tSNetworkResponse.toString(), null);
        }

        @Override // com.ts.coresdk.TSCallback
        public void success(TSNetworkResponse<? extends Void> tSNetworkResponse) {
            Intrinsics.checkNotNullParameter(tSNetworkResponse, "");
            TSLog.d(TSLogServerProvider.this.z(), this.cj, tSNetworkResponse.toString());
        }
    }

    public TSLogServerProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.ch = context;
    }

    private final String a(String str, String str2, long j2) {
        try {
            return i(h(str + j2 + str2));
        } catch (Throwable unused) {
            return "";
        }
    }

    private final String h(String str) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str2 = "";
        for (byte b2 : bArrDigest) {
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            str2 = str2 + str3;
        }
        return str2;
    }

    private final String i(String str) throws Throwable {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Object[] objArr = {bytes, 2};
        Method declaredMethod = Class.forName(Ig.wd("{Q\u0017\u000b\rRoFg8)\u0010'30&[$w", (short) (OY.Xd() ^ 24196))).getDeclaredMethod(EO.Od("X\tq_.|", (short) (C1580rY.Xd() ^ (-29724))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(bArr, "");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            return new String(bArr, charset);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.ts.coresdk.controllers.TSDataSyncServer
    /* JADX INFO: renamed from: a */
    public void sendDataToServer(TSLogEntity tSLogEntity, Void r3, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(tSLogEntity, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        a(CollectionsKt.listOf(tSLogEntity), r3, iTSModuleInfo);
    }

    public void a(List<TSLogEntity> list, Void r29, ITSModuleInfo iTSModuleInfo) {
        String json;
        String strQd = C1561oA.Qd("3oqh/u0,_gc^fk%`Yl# ]^PVXP\u0019", (short) (C1580rY.Xd() ^ (-9434)));
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        try {
            TSNetworkManager tSNetworkManager = TSNetworkManager.INSTANCE;
            Context context = this.ch;
            TSLogApiService tSLogApiService = (TSLogApiService) TSNetworkManager.create$default(tSNetworkManager, context, iTSModuleInfo, C1593ug.zd("\r\u001a\u001b\u0018\u001ccYZ!\u0013\u001b\u0015\u001e\u0017'&.b101-!$p3u!m7&q&s9=7w,<=", (short) (OY.Xd() ^ 18232), (short) (OY.Xd() ^ 18299)), iTSModuleInfo.endpointIgnoreList(context), TSLogApiService.class, false, null, 96, null);
            if (tSLogApiService != null) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                String str = strQd + iTSModuleInfo.subSystemName();
                JsonStringConvertor jsonStringConvertor = JsonStringConvertor.INSTANCE;
                Context context2 = this.ch;
                Class<?> cls = Class.forName(C1561oA.od("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w", (short) (Od.Xd() ^ (-31920))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-12258));
                int[] iArr = new int["CBR/ADMDKJ4HUN".length()];
                QB qb = new QB("CBR/ADMDKJ4HUN");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    String str2 = (String) method.invoke(context2, objArr);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    String strTenantID = iTSModuleInfo.tenantID();
                    int i3 = Build.VERSION.SDK_INT;
                    short sXd2 = (short) (ZN.Xd() ^ 24261);
                    short sXd3 = (short) (ZN.Xd() ^ 2488);
                    int[] iArr2 = new int[":\u0001m2&bQ".length()];
                    QB qb2 = new QB(":\u0001m2&bQ");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i4++;
                    }
                    try {
                        json = new Gson().toJson(new com.ts.coresdk.logger.network.a(str2, strTenantID, i3, new String(iArr2, 0, i4), iTSModuleInfo.version(), C1561oA.Xd("\u0006\u0014\u000b\u001a\u0018\u0013\u000f", (short) (Od.Xd() ^ (-23966)))));
                    } catch (Throwable unused) {
                        json = null;
                    }
                    String str3 = json != null ? json : "";
                    short sXd4 = (short) (C1633zX.Xd() ^ (-7313));
                    int[] iArr3 = new int["+ **\"!,\u0017\u001a\u0011\u000f\u0010\u0012\u0018)\u0015\u0011\u0005\u0010\u001c\" \b\u000b\u0007\u0003\u0012\u0005\u0018\u0018\b\t?L".length()];
                    QB qb3 = new QB("+ **\"!,\u0017\u001a\u0011\u000f\u0010\u0012\u0018)\u0015\u0011\u0005\u0010\u001c\" \b\u000b\u0007\u0003\u0012\u0005\u0018\u0018\b\t?L");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK((sXd4 ^ i5) + xuXd3.CK(iKK3));
                        i5++;
                    }
                    String strA = a(str, new String(iArr3, 0, i5), seconds);
                    ServerLogs serverLogs = new ServerLogs(com.ts.coresdk.logger.network.b.INSTANCE.a(this.ch, iTSModuleInfo, list));
                    String strKd = Qg.kd("F?R\t", (short) (FB.Xd() ^ 24316), (short) (FB.Xd() ^ 21540));
                    short sXd5 = (short) (C1633zX.Xd() ^ (-935));
                    short sXd6 = (short) (C1633zX.Xd() ^ (-22247));
                    int[] iArr4 = new int["RSEKME".length()];
                    QB qb4 = new QB("RSEKME");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(sXd5 + i6 + xuXd4.CK(iKK4) + sXd6);
                        i6++;
                    }
                    tSLogApiService.sendLogs(str3, seconds, strA, serverLogs, 2, strKd, new String(iArr4, 0, i6), iTSModuleInfo.subSystemName()).enqueue(new b(iTSModuleInfo));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.ts.coresdk.controllers.TSDataSyncServer
    public /* synthetic */ void sendDataToServer(List<? extends TSLogEntity> list, Void r2, ITSModuleInfo iTSModuleInfo) {
        a((List<TSLogEntity>) list, r2, iTSModuleInfo);
    }

    public final Context z() {
        return this.ch;
    }
}
