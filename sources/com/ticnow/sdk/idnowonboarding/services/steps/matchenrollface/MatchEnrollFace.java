package com.ticnow.sdk.idnowonboarding.services.steps.matchenrollface;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.ticnow.sdk.idnowonboarding.model.http.IDMatchEnrollFaceRequest;
import com.ticnow.sdk.idnowonboarding.model.multipart.IDMultipartClient;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchEnrollFaceActivity;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {1, 0, 3}, d1 = {"ЯZ\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNog\u0005JbŏK\u000f\u001c\u0016\u0001j2g]xk!\u00172HoG3[\u007fE9ft>\u0005.T*\u0600\u0010ڎ1,:J v)C[\u000e\"0npJT\u001dM3\u001b@\u0005~Y\u0011\"jif6vom>='\u001bipS7c>\u0003e\rt[7\u0011\u0005i6+n@E\u00193]\u001b\u0007\u0001fO\rM}U\u000bx)7+w\u0002\u0006Cݼ\u0004\u0014#:\u00182k\">^\u001bP\u000f\rW?]\u0014cZ\u001e.}y\f\u000fR\u0003<\u0006UyN/0e6\u000ey\u0007ɤW@^4'R\u000e.y8-$.g[=)\u001ciai$\u00157D%\u001bT;\r~#kT<a%\u001ddw\u007f2\u007fwmR\\\u0016qC}\u0006\u0001b082=\u000e\u007f\u007f\"\u001f6/3GeI+?|*JZf%\b\u000fk\u0002y)̹Ḻr\"?ѧ!\u000e`Vr\u0018\fRZl:&\u001e4b\u001d\u0016\bA'3ʃHƼ)\u001cVи\u0001kpdk\"E1lPg\t<&eTv3cV:ߋm؏z Gֺz\u0007^\u0003Pp,\\bF0Q\u0019\t\u001e\u0018\u0014J^\u000e#2m\u007fJA\u0003ւ%Å\u0019T\u000bٜZC\u0003*m|\t\u0012\u0005wAHS\u00022\u001a!\u0001~eGטs֑M8\u0005ʠ:/GwC@FW(\u0011B&s\u001f\r\u001e\u0018G\u0016W\u001eƉxטya\u0004\u008d.\u001c?|=i3\u0011\u0005V@0θI\u0005"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005yC\u001e v+A\u0003r*Qv0TVU3]Np=]yV\u001dL.l\u000efK+u%3\u001d\b\u0002", "\u001a`]1e6BRb\t\t(\b\u000b\u001d8cn$\nFV", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "", ";`c0[\fG`#\u0006\u0002?(z\t\u000bc\u000f,\rD\u0010+", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&NpL\u0018#^\u001dbtp\u0004A=3lG\u0017(\u00156P\t\u001cd~\fq\fDn\u0002Fe$\u001d", ";`c0[\fG`#\u0006\u0002?(z\t\u001ce\f8{N\u0010", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sP]H\u0005f\fW\u00041NS/(ZR_= \"Z\u001c]\u0001", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "4`R2", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G.Fm!<\u0017MDh>\u001a\"geB\tq;N\u00025\u0011MJ*\\\u001cn;#\u0016k\u0012]?VhX) }B:~\u00119S\tBI|\n\u0016i3ytSZ\u001f[O{sK12U]]\u0003QS\u000fp)jUc\u001ceDL.\u001dn#\u0017uO2\u0013}\u001d\u0019|Qyn1J(\nCm\"LCBTmX\u001c}4)R\u0003X\u000e0Xa+\u0001=\u0004B9\fK\u0001Tf%Hbw^*fJ6&?K\\\u001dUl\u0005lQ\u001d>\u0006]\u0011\ro?5\u0018/anSXb[&_Fen\u0015\r9\u0002GH|\u001f+EHDhu \f\u000b\"{/&G*\\|%F+'[\"~Lv' 5_\u0019f\u001cd>F;[\"^,)", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u000eV;Bd\u001d\u000e\u000f", "u(;7T=:\u001d z\u0004`u\n\t0/q(wFm\u0017\u0018G|\u000eEt%\u000b", "Adc\u000eV;Bd\u001d\u000e\u000f", "uKY.i(\bZ\u0015\b|(9|\nxW\u007f$\u0002-\u0001\u0018\u0017To\u0017:vzxJ", "/o_\u0010b5MS,\u000e", "5dc\u000ec7\u001c]\"\u000ezq;", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "Adc\u000ec7\u001c]\"\u000ezq;", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";`c0[\fG`#\u0006\u0002?(z\t\u001ce\f8{N\u0010\u0001\u0014Lo\fK", "5dc\u001aT;<Vx\b\bh3\u0004i+c\u007f\u0015{L\u0011\u0017%VY\u000bAv#D", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@!\u0003r*QV0TVU3=Np=\u0001\u0012f\u001eN9\u001cZ", "Adc\u001aT;<Vx\b\bh3\u0004i+c\u007f\u0015{L\u0011\u0017%VY\u000bAv#D", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGI5\u0016a/.\u007f4QSU\rXPr*\u0014\u001ej\u000e\\:bHJ", "@d`BX:M6\u0019zy^9\u000b", "5dc\u001fX8NS'\u000e]^({\t<s", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u001fX8NS'\u000e]^({\t<s", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "Asa<a.\u001aQ(\u0003\fb;\u0011", "5dc g9H\\\u001bZxm0\u000e\r>y", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "Adc g9H\\\u001bZxm0\u000e\r>y", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ8", "Hn^:9(<S", "5dc'b6F4\u0015|z", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzc", "Adc'b6F4\u0015|z", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013REQ-", "2n8;5(<Y\u001b\f\u0005n5{", ">`a.`:", "", "uZ;7T=:\u001d z\u0004`um\u00133dUkbE|(\u0013\u0011v\nExn#h\u000b$@ok", "5dc\u0016`(@Sy\u0003\u0002^", "", "0hc:T7", ">q^0X:L6\u0019zy^9\u000b", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class MatchEnrollFace extends AsyncTask<Void, Void, String> {
    private WeakReference<IdMatchEnrollFaceActivity> activity;
    private Context appContext;
    private IDMatchEnrollFaceRequest matchEnrollFaceRequestObject;
    private ArrayList<KeyValue> requestHeaders;
    private Activity strongActivity;
    private Bitmap zoomFace;

    public MatchEnrollFace(IdMatchEnrollFaceActivity matchEnrollFaceActivity, IDMatchEnrollFaceRequest matchEnrollFaceRequest, Context context, Activity activity, Bitmap face, ArrayList<KeyValue> headers) {
        Intrinsics.checkParameterIsNotNull(matchEnrollFaceActivity, "matchEnrollFaceActivity");
        Intrinsics.checkParameterIsNotNull(matchEnrollFaceRequest, "matchEnrollFaceRequest");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(face, "face");
        Intrinsics.checkParameterIsNotNull(headers, "headers");
        this.activity = new WeakReference<>(matchEnrollFaceActivity);
        this.strongActivity = activity;
        this.appContext = context;
        this.matchEnrollFaceRequestObject = matchEnrollFaceRequest;
        this.zoomFace = face;
        this.requestHeaders = headers;
    }

    private final byte[] getImageFile(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private final Map<String, String> processHeaders(ArrayList<KeyValue> arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (KeyValue keyValue : arrayList) {
            linkedHashMap.put(keyValue.getKey(), keyValue.getValue());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public String doInBackground(Void... params) {
        Intrinsics.checkParameterIsNotNull(params, "params");
        try {
            new IDSecurityApiImpl();
            byte[] imageFile = getImageFile(this.zoomFace);
            Integer.parseInt(String.valueOf((imageFile != null ? imageFile.length : 0) / 1024));
            RequestBody.Companion companion = RequestBody.Companion;
            MediaType mediaType = MediaType.Companion.parse("image/*");
            if (imageFile == null) {
                Intrinsics.throwNpe();
            }
            MultipartBody.Part partCreateFormData = MultipartBody.Part.Companion.createFormData(OptionalModuleUtils.FACE, "faceImage", RequestBody.Companion.create$default(companion, mediaType, imageFile, 0, 0, 12, (Object) null));
            IDEndPoints currentInstance = IDEndPoints.getCurrentInstance();
            Intrinsics.checkExpressionValueIsNotNull(currentInstance, "IDEndPoints.getCurrentInstance()");
            ((IDMultipartClient) new Retrofit.Builder().baseUrl(currentInstance.getMatchFaceZoom()).addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient.Builder().connectTimeout(1L, TimeUnit.MINUTES).readTimeout(1L, TimeUnit.MINUTES).writeTimeout(1L, TimeUnit.MINUTES).build()).build().create(IDMultipartClient.class)).matchEnrollFace(processHeaders(this.requestHeaders), RequestBody.Companion.create((MediaType) null, this.matchEnrollFaceRequestObject.toJson()), partCreateFormData);
            return "matchEnrollFaceCallBlock";
        } catch (NullPointerException unused) {
            return "matchEnrollFaceCallBlock";
        }
    }

    public final WeakReference<IdMatchEnrollFaceActivity> getActivity() {
        return this.activity;
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public final IDMatchEnrollFaceRequest getMatchEnrollFaceRequestObject() {
        return this.matchEnrollFaceRequestObject;
    }

    public final ArrayList<KeyValue> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final Activity getStrongActivity() {
        return this.strongActivity;
    }

    public final Bitmap getZoomFace() {
        return this.zoomFace;
    }

    public final void setActivity(WeakReference<IdMatchEnrollFaceActivity> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "<set-?>");
        this.activity = weakReference;
    }

    public final void setAppContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.appContext = context;
    }

    public final void setMatchEnrollFaceRequestObject(IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest) {
        Intrinsics.checkParameterIsNotNull(iDMatchEnrollFaceRequest, "<set-?>");
        this.matchEnrollFaceRequestObject = iDMatchEnrollFaceRequest;
    }

    public final void setRequestHeaders(ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.requestHeaders = arrayList;
    }

    public final void setStrongActivity(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "<set-?>");
        this.strongActivity = activity;
    }

    public final void setZoomFace(Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "<set-?>");
        this.zoomFace = bitmap;
    }
}
