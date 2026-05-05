package com.ticnow.sdk.idnowonboarding.services.steps.dni;

import android.content.Context;
import android.graphics.Bitmap;
import com.ticnow.sdk.idnowonboarding.model.http.IDAnalizeDniRequest;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.Compressor;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.QualityConstraintKt;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {1, 0, 3}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP\u008cZS8\u001bs{:$c$\bCCU0}*\tUOog|Jb\u000bI\u000f\u000e\u0016\u000fj4I[ze\u0012\u001dTJģG3[\u007fEʠhtL\u0005(2(8\u0010ڎ\u001f7ZH>u3BhL\u0004@D~:j\r{\u0006*\u0016\u0014@8\u0001L_wXDL\u0005cJ13\u0003\u0018H|,o4\u000bT%F\u0003/\u001dzo'C@e=%aa\r\u001f\u000bkP\u0013N Eݾl1-7Yy]Ch\u0002\u001a\u001bQ]\u001dv\u0003=l\u0007a`:-AN\u0012Pח\u00122}\u0007\f\u0013B\u0011\u001e\b-NT<*h\u0018\u000ea\u0005!^ĖT\u0002lSH\u0012oH/%.F[=)ziai!\u0015ќ:͕\f̔ţ\u0005n/p\u001d\u0012n+3T&ayqNT`Z\u001a[Mm2xr\u0004:\u0004^O.G,\u001b<\u001b==k;3!\u001a\bvI.vMpvl\u0002T^?P\tF;8$$Zr\u0001Kk!`f,)MJU]å\u0014˙$\\\u007f˓q1\u001eWgh\u0018r$έ\u0016ɻ3f?ժ?0\u001caQ\u0017CFar>i؏z\u001eEHr\u000b^sRU\u0012`\u000362KX\u0002 y\fD|\u0012)1mvʬ867%l\u001bN\u0010.DG\u0003/njj ~\u0003CR\u000e@ˈ\u0001֊\u0005Pdʙ@s\u0007KD|\u000f%\u0004ێ]ڤ\u001d&]Ȩ9@\u000b*\u001f~\"\b\u001eшXܤPl\u001e߯&\u000e.\u001a2?a1M\u0013=\u0005W7XΒQʆveY˧ȿ'|\u0005y\u0015Rą2\u0006"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005yC\u001e v+8\u0010gu/z0CS*5XYvR\u0014pc\u0012$", "", "/mP9\\A>2\"\u0003g^8\r\t=t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sDj5\u000egANU0K9N8lR\u0001Li", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "4q^;g\rBZ\u0019ivm/", "", "0`R890ES\u0004z\na", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1nS2", "2`c.", "", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxG=B\u0003j0cv\u0006PP;,hbrK#gA\nW*\u001a\u000f]@mlN@.\b5XK\u0019r\n\u001b\u0016!D@WGR!CC%\u0005E02\"flu[(Ip9:rd\u0019m6\u0004+\u0010z\u001bdV_;\u000e\u0005UfYWuxc\u0011 vA&\b[jSIxW\u0012[-)Z\u0003{\u001b{]\u00063>.\u0014=(Eh\u000fTua\u001fn\u0002\u0013;`K0r\f\u007f\u0004", "5dc\u0010b4I`\u0019\r\t^+]\r6e", "\u001aiPCTuB]b_~e,R", "4h[2C(MV", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", ";`Z26(EZ", ">q^0X:L6\u0019zy^9\u000b", "", "Bn1Fg,\u001a`&z\u000f", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class FinalAnalizeDni {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FinalAnalizeDni";
    private IDAnalizeDniRequest analizeDniRequest;
    private String backFilePath;
    private Function2<? super String, ? super ArrayList<KeyValue>, Unit> callback;
    private Context context;
    private String frontFilePath;
    private ArrayList<KeyValue> headers;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005yC\u001e v+8\u0010gu/z0CS*5XYvR\u0014pc\u0012\r\t\u0017\rd=-rN@t", "", "u(E", "\"@6", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.steps.dni.FinalAnalizeDni$getCompressedFile$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tj\u000faL1nRE#\u00125\u001f", "7me<^,"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<Compression, Unit> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Compression compression) {
            invoke2(compression);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Compression receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            QualityConstraintKt.quality(receiver, 100);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.steps.dni.FinalAnalizeDni$makeCall$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004G\u0006>éFB-!T\u0012&\u0007-ʜwӧHgN/`U"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            AnonymousClass1 anonymousClass1 = FinalAnalizeDni.this.new AnonymousClass1(completion);
            anonymousClass1.p$ = (CoroutineScope) obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x008f A[Catch: Exception -> 0x01bc, TRY_ENTER, TryCatch #0 {Exception -> 0x01bc, blocks: (B:51:0x0027, B:63:0x0079, B:66:0x008f, B:68:0x00a3, B:70:0x00c5, B:72:0x00dd, B:73:0x00e0, B:75:0x00f3, B:76:0x00f6, B:77:0x01a8, B:78:0x01af, B:79:0x01b0, B:80:0x01b5, B:81:0x01b6, B:82:0x01bb, B:55:0x003b, B:60:0x005e, B:57:0x0044), top: B:87:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01b6 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:51:0x0027, B:63:0x0079, B:66:0x008f, B:68:0x00a3, B:70:0x00c5, B:72:0x00dd, B:73:0x00e0, B:75:0x00f3, B:76:0x00f6, B:77:0x01a8, B:78:0x01af, B:79:0x01b0, B:80:0x01b5, B:81:0x01b6, B:82:0x01bb, B:55:0x003b, B:60:0x005e, B:57:0x0044), top: B:87:0x0015 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.services.steps.dni.FinalAnalizeDni.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FinalAnalizeDni(IDAnalizeDniRequest analizeDniRequest, Context context, ArrayList<KeyValue> headers, String frontFilePath, String backFilePath, Function2<? super String, ? super ArrayList<KeyValue>, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(analizeDniRequest, "analizeDniRequest");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(headers, "headers");
        Intrinsics.checkParameterIsNotNull(frontFilePath, "frontFilePath");
        Intrinsics.checkParameterIsNotNull(backFilePath, "backFilePath");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.analizeDniRequest = analizeDniRequest;
        this.context = context;
        this.headers = headers;
        this.frontFilePath = frontFilePath;
        this.backFilePath = backFilePath;
        this.callback = callback;
    }

    public final Map<String, String> processHeaders(ArrayList<KeyValue> arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (KeyValue keyValue : arrayList) {
            linkedHashMap.put(keyValue.getKey(), keyValue.getValue());
        }
        return linkedHashMap;
    }

    private final byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str = "ByteArray size: " + byteArray.length;
        return byteArray;
    }

    final /* synthetic */ Object getCompressedFile(String str, Continuation<? super File> continuation) {
        String str2 = "Getting compressed file; " + str;
        return Compressor.compress$default(Compressor.INSTANCE, this.context, new File(str), null, AnonymousClass2.INSTANCE, continuation, 4, null);
    }

    public final void makeCall() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }
}
