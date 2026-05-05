package com.ticnow.sdk.idnowonboarding.connectivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.OkCallback;
import com.ticnow.sdk.idnowonboarding.dialog.ConnectivityDialogNew;
import com.ticnow.sdk.idnowonboarding.dialog.IDDialog;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDCredentials;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeV.ZS0\u000fs{J$c$wFCU(\u0004*\tUUog\u0005Jb\u000bI\u001a\u000e\u0016\u000fj4I[\u0002s܈-drom2\u0006noyuzJ\u0015$@\"Py3\u0002*.V\u0012\u000fzqNë\u00160Ntzu\u0013a\u0015\u001e \u0006V /\u001flk\\8`l\f=?-\u0011nZT7a@|{\u0014tZܮ\u0011vo&sDEb-%\u0002\nO]ih\u001b? eKiҊ++O\" :f/,\u0015YVUa\u0001Vt\u0005\u007fgT+9\u0001{K~\u0015x\u0010\t\u0005%<2\u0018\\ΰTͶ1&nڜ&5z}aLp\u0004dO\u000e\t2N%4\u00183YIqƟ]ň?%Vљ\u0014\u0007\u0013/1\u0013\u000f#ag\u001cte9b|i7aBMH|\u0011\bCDՕ|Ċ\u00066\f\u0382_\u00025\u0011\u001fD7'=rG;q\u0004\u0010a\\g%\u001f7ì_ׂVTH̎\u0007\u0018=E\u0017(zFj\"yn%p:\u0011e\u001c\u0003\bTܸ\u001fء`\u0004Dƙ=\u0012Tnv\n\u000bOc+3Q7Ogp\u0004\u000e\u0006<5گAɄg\u001ci\u05ec\u000f\u0016E_p)xhHx\u001a\u0001-@0Y`j> RͰZܟ\u0017>Gڤ462Z'\u00075J\tIPmҺ\r\u0013"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#{*@v\u0016,\\GLoC2^L`\"\u0011u\nX\u007f0GJ]0f[P@\u0014\u0010`\u000e[\u0001", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4qP4`,Gb\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;#", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u0017;IECk=-^dlDPD9Jx/GU]\u0014X[n?\u0014\u001f0Q?", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u0017;IECk=-^dlDPD9Jx/GU]\u0014X[n?\u0014\u001f0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003_K\u0005\u001a", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dc\u000eV;Bd\u001d\u000e\u000f", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "Adc\u000eV;Bd\u001d\u000e\u000f", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ8", "/sc2`7M", "", "5dc\u000eg;>[$\u000e", "u(8", "Adc\u000eg;>[$\u000e", "uH\u0018#", "5dc\u0010T3EP\u0015|\u0001", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0010T3EP\u0015|\u0001", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "1n];X*MW*\u0003\nr\u000b\u0001\u00056o\u0002\u0011{R", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!Et=\u001e\u0013weJ\u000br@-z#NVP\u0015\\dH", "5dc\u0010b5GS\u0017\u000e~o0\f\u001d\u000ei{/\u0006Bi\u0017)", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi6q\u00125WE\u0005I>'\u001eh_H\u000bt0]\u000b\u0006KHU6^;rOi", "Adc\u0010b5GS\u0017\u000e~o0\f\u001d\u000ei{/\u0006Bi\u0017)", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G\u001f;i\u001d8O\r\u0019u='\u0015fp=\u0018g;bU+CSX.ER\u0005\u0013W\u0003", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "Adc\u0010b5MS,\u000e", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "5dc\u0013e(@[\u0019\b\nF(\u0006\u00051e\r", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\r\b3v\u00120MP\u0011", "Adc\u0013e(@[\u0019\b\nF(\u0006\u00051e\r", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>he\u001c@i\u0018.Z\u0019~\\", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "5dc\u001fX8NS'\u000e", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "Adc\u001fX8NS'\u000e", "uK^8[;M^fHg^8\r\t=tUkl", "1gT0^", "5dc\u001fX8NS'\u000eF", "Ag^D:,GS&z\u0002>9\n\u0013<", "Ag^D<5MS&\bzm\n\u007f\t-k\u007f5", "Ag^D<5MS&\bzm\n\u007f\t-k\u007f5[M\u000e!$", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdNowConnectionChecker {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_ATTEMPTS = 3;
    public static final String TAG = "IdNowConnectionChecker";
    private Activity activity;
    private int attempt;
    private Function0<Unit> callback;
    private ConnectivityDialogNew connectivityDialogNew;
    private Context context;
    private FragmentManager fragmentManager;
    private Request request;

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȥ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޓ0ܫ\u00132JģЩ7R"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#{*@v\u0016,\\GLoC2^L`\"\u0011u\nX\u007f0GJ]0f[P@\u0014\u0010`\u000e[ij\u000faL wHA(]", "", "u(E", "\u001b@G,4\u001b-3\u0001iiL", "", "\"@6", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$check$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я'\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZݷR\u000eӆ\u0002<:ӋTqq:\u001e0\f\"!O|h\u0018rX\\#C=\tF|x0aU'bX#zX}EKM\u001e>id\u00038\u001d `%h}\u0013\b2*v\u0018=\u000fŸO\u0015"}, d2 = {"1n\\{g0<\\#\u0011Dl+\u0003R3d\t2\u000eJ\n\u0014!C|\r@\u007f'~W\b)@m\u0014=QT?zHgxgJC\u0019A6W\u007f'E[R6e0u=\u0012\u0018Z\u001b\r)\u0010\u0005WGb:", "\u001anZ5g;I!b\\ve3y\u0005-kU", "=m5.\\3N`\u0019", "", "1`[9", "\u001anZ5g;I!b\\ve3R", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "=mA2f7H\\'~", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class C12531 implements Callback {
        C12531() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e2) {
            OkCallback.onFailure_enter(call, e2);
            try {
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(e2, "e");
                e2.printStackTrace();
                if (IdNowConnectionChecker.this.getAttempt() < 3) {
                    IdNowConnectionChecker.this.showInternetChecker();
                } else {
                    IdNowConnectionChecker.this.showInternetCheckerError();
                }
            } finally {
                OkCallback.onFailure_exit();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            OkCallback.onResponse_enter(call, response);
            try {
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(response, "response");
                Response response2 = response;
                try {
                    if (response.code() != 404) {
                        if (IdNowConnectionChecker.this.getCallback() != null) {
                            IdNowConnectionChecker.this.getCallback().invoke();
                        }
                    } else if (IdNowConnectionChecker.this.getAttempt() < 3) {
                        IdNowConnectionChecker.this.showInternetChecker();
                    } else {
                        IdNowConnectionChecker.this.showInternetCheckerError();
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(response2, null);
                } finally {
                }
            } finally {
                OkCallback.onResponse_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showGeneralError$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class RunnableC12541 implements Runnable {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showGeneralError$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class ViewOnClickListenerC02771 implements View.OnClickListener {
            ViewOnClickListenerC02771() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dynatrace.android.callback.Callback.onClick_enter(view);
                try {
                    IdNowConnectionChecker.this.getActivity().setResult(170054, new Intent());
                    IdNowConnectionChecker.this.getActivity().finish();
                } finally {
                    com.dynatrace.android.callback.Callback.onClick_exit();
                }
            }
        }

        RunnableC12541() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IDDialog.showDialog(IdNowConnectionChecker.this.getFragmentManager(), IdNowConnectionChecker.this.getActivity(), IdNowConnectionChecker.this.getContext(), "Comunicación no disponible", "Intente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showGeneralError.1.1
                ViewOnClickListenerC02771() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.dynatrace.android.callback.Callback.onClick_enter(view);
                    try {
                        IdNowConnectionChecker.this.getActivity().setResult(170054, new Intent());
                        IdNowConnectionChecker.this.getActivity().finish();
                    } finally {
                        com.dynatrace.android.callback.Callback.onClick_exit();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showInternetChecker$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004G\u0006>éFB-!T\u0012&\u0007-ʜwӧHgN/`U"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class C12551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showInternetChecker$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC02781 implements Runnable {
            RunnableC02781() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IdNowConnectionChecker.this.getConnectivityDialogNew().show();
            }
        }

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showInternetChecker$1$2 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IdNowConnectionChecker.this.getConnectivityDialogNew().dismiss();
            }
        }

        C12551(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            C12551 c12551 = IdNowConnectionChecker.this.new C12551(completion);
            c12551.p$ = (CoroutineScope) obj;
            return c12551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = this.p$;
                IdNowConnectionChecker idNowConnectionChecker = IdNowConnectionChecker.this;
                idNowConnectionChecker.setAttempt(idNowConnectionChecker.getAttempt() + 1);
                IdNowConnectionChecker.this.getActivity().runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showInternetChecker.1.1
                    RunnableC02781() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IdNowConnectionChecker.this.getConnectivityDialogNew().show();
                    }
                });
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(4500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    IdNowConnectionChecker.this.check();
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            IdNowConnectionChecker.this.getActivity().runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showInternetChecker.1.2
                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IdNowConnectionChecker.this.getConnectivityDialogNew().dismiss();
                }
            });
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            IdNowConnectionChecker.this.check();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showInternetCheckerError$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class RunnableC12561 implements Runnable {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showInternetCheckerError$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class ViewOnClickListenerC02791 implements View.OnClickListener {
            ViewOnClickListenerC02791() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dynatrace.android.callback.Callback.onClick_enter(view);
                try {
                    IdNowConnectionChecker.this.getActivity().setResult(3036, new Intent());
                    IdNowConnectionChecker.this.getActivity().finish();
                } finally {
                    com.dynatrace.android.callback.Callback.onClick_exit();
                }
            }
        }

        RunnableC12561() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IDDialog.showDialog(IdNowConnectionChecker.this.getFragmentManager(), IdNowConnectionChecker.this.getActivity(), IdNowConnectionChecker.this.getContext(), "", "Revise su conexión a internet.\nPor favor intente su proceso más tarde.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showInternetCheckerError.1.1
                ViewOnClickListenerC02791() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.dynatrace.android.callback.Callback.onClick_enter(view);
                    try {
                        IdNowConnectionChecker.this.getActivity().setResult(3036, new Intent());
                        IdNowConnectionChecker.this.getActivity().finish();
                    } finally {
                        com.dynatrace.android.callback.Callback.onClick_exit();
                    }
                }
            });
        }
    }

    public IdNowConnectionChecker(Context context, FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        this.attempt = 1;
        this.activity = (Activity) context;
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.callback = AnonymousClass1.INSTANCE;
        this.request = getRequest1();
        this.connectivityDialogNew = new ConnectivityDialogNew(context);
    }

    public IdNowConnectionChecker(Context context, FragmentManager fragmentManager, Function0<Unit> callback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.attempt = 1;
        this.activity = (Activity) context;
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.callback = callback;
        this.request = getRequest1();
        this.connectivityDialogNew = new ConnectivityDialogNew(context);
    }

    private final Request getRequest1() {
        IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
        Request.Builder builder = new Request.Builder();
        IDEndPoints currentInstance = IDEndPoints.getCurrentInstance();
        Intrinsics.checkExpressionValueIsNotNull(currentInstance, "IDEndPoints.getCurrentInstance()");
        Request.Builder builderUrl = builder.url(new URL(currentInstance.getGetEnrollmentReintenNews()));
        Object objRequireNonNull = Objects.requireNonNull(iDSecurityApiImpl.getIdNowCredentials(this.context, this.activity));
        if (objRequireNonNull == null) {
            Intrinsics.throwNpe();
        }
        Request.Builder builderHeader = builderUrl.header("API-KEY", ((IDCredentials) objRequireNonNull).getApiKey());
        Object objRequireNonNull2 = Objects.requireNonNull(iDSecurityApiImpl.getIdNowCredentials(this.context, this.activity));
        if (objRequireNonNull2 == null) {
            Intrinsics.throwNpe();
        }
        return builderHeader.header("API-USER", ((IDCredentials) objRequireNonNull2).getApiUser()).build();
    }

    public final void check() {
        try {
            String str = "checking internet connection, attempt " + this.attempt;
            OkCallback.enqueue(new OkHttpClient().newCall(this.request), new Callback() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.check.1
                C12531() {
                }

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e2) {
                    OkCallback.onFailure_enter(call, e2);
                    try {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(e2, "e");
                        e2.printStackTrace();
                        if (IdNowConnectionChecker.this.getAttempt() < 3) {
                            IdNowConnectionChecker.this.showInternetChecker();
                        } else {
                            IdNowConnectionChecker.this.showInternetCheckerError();
                        }
                    } finally {
                        OkCallback.onFailure_exit();
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    OkCallback.onResponse_enter(call, response);
                    try {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(response, "response");
                        Response response2 = response;
                        try {
                            if (response.code() != 404) {
                                if (IdNowConnectionChecker.this.getCallback() != null) {
                                    IdNowConnectionChecker.this.getCallback().invoke();
                                }
                            } else if (IdNowConnectionChecker.this.getAttempt() < 3) {
                                IdNowConnectionChecker.this.showInternetChecker();
                            } else {
                                IdNowConnectionChecker.this.showInternetCheckerError();
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(response2, null);
                        } finally {
                        }
                    } finally {
                        OkCallback.onResponse_exit();
                    }
                }
            });
        } catch (Exception unused) {
            showGeneralError();
        }
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final Function0<Unit> getCallback() {
        return this.callback;
    }

    public final ConnectivityDialogNew getConnectivityDialogNew() {
        return this.connectivityDialogNew;
    }

    public final Context getContext() {
        return this.context;
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final void setActivity(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "<set-?>");
        this.activity = activity;
    }

    public final void setAttempt(int i2) {
        this.attempt = i2;
    }

    public final void setCallback(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "<set-?>");
        this.callback = function0;
    }

    public final void setConnectivityDialogNew(ConnectivityDialogNew connectivityDialogNew) {
        Intrinsics.checkParameterIsNotNull(connectivityDialogNew, "<set-?>");
        this.connectivityDialogNew = connectivityDialogNew;
    }

    public final void setContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.context = context;
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "<set-?>");
        this.fragmentManager = fragmentManager;
    }

    public final void setRequest(Request request) {
        Intrinsics.checkParameterIsNotNull(request, "<set-?>");
        this.request = request;
    }

    public final void showGeneralError() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showGeneralError.1

            /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showGeneralError$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
            static final class ViewOnClickListenerC02771 implements View.OnClickListener {
                ViewOnClickListenerC02771() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.dynatrace.android.callback.Callback.onClick_enter(view);
                    try {
                        IdNowConnectionChecker.this.getActivity().setResult(170054, new Intent());
                        IdNowConnectionChecker.this.getActivity().finish();
                    } finally {
                        com.dynatrace.android.callback.Callback.onClick_exit();
                    }
                }
            }

            RunnableC12541() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(IdNowConnectionChecker.this.getFragmentManager(), IdNowConnectionChecker.this.getActivity(), IdNowConnectionChecker.this.getContext(), "Comunicación no disponible", "Intente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showGeneralError.1.1
                    ViewOnClickListenerC02771() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.dynatrace.android.callback.Callback.onClick_enter(view);
                        try {
                            IdNowConnectionChecker.this.getActivity().setResult(170054, new Intent());
                            IdNowConnectionChecker.this.getActivity().finish();
                        } finally {
                            com.dynatrace.android.callback.Callback.onClick_exit();
                        }
                    }
                });
            }
        });
    }

    public final void showInternetChecker() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C12551(null), 3, null);
    }

    public final void showInternetCheckerError() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showInternetCheckerError.1

            /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker$showInternetCheckerError$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
            static final class ViewOnClickListenerC02791 implements View.OnClickListener {
                ViewOnClickListenerC02791() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.dynatrace.android.callback.Callback.onClick_enter(view);
                    try {
                        IdNowConnectionChecker.this.getActivity().setResult(3036, new Intent());
                        IdNowConnectionChecker.this.getActivity().finish();
                    } finally {
                        com.dynatrace.android.callback.Callback.onClick_exit();
                    }
                }
            }

            RunnableC12561() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(IdNowConnectionChecker.this.getFragmentManager(), IdNowConnectionChecker.this.getActivity(), IdNowConnectionChecker.this.getContext(), "", "Revise su conexión a internet.\nPor favor intente su proceso más tarde.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker.showInternetCheckerError.1.1
                    ViewOnClickListenerC02791() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.dynatrace.android.callback.Callback.onClick_enter(view);
                        try {
                            IdNowConnectionChecker.this.getActivity().setResult(3036, new Intent());
                            IdNowConnectionChecker.this.getActivity().finish();
                        } finally {
                            com.dynatrace.android.callback.Callback.onClick_exit();
                        }
                    }
                });
            }
        });
    }
}
