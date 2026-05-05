package com.ticnow.sdk.idnowonboarding.services.steps.dni;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.ticnow.sdk.idnowonboarding.model.http.IDAnalizeDniRequest;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}8\tWNmhvJp\u000bK\u000f\f7\u0001j:X]xc\u0012\u00172P\u007fG\u074cUoS9hҚ>\u0005.T*\u0600\u0002\u0005\u0017\u001a2H\u0016w\u0011ŏ{\u001e\"2PphR\u001dO\u0015\u001a@\u0006N\"\u0011\u001e\u000bh|5\t.m>=%\u001bipQ7c>\u0001e\rtY7\u0011\u0005g6+n>E\u00193[\u001b\u0007\u0001dO\rM{U\u000bx)7+w\u007f\u0006Ah\u0004\"\"CO;^\u0003*j\u0013i`:(˦ScY_VM\u0006-\u0014\u000fR\u0003<\u0007W\\<`2p\u0018\u00149s\u0003UVO0^p4\u001bcL\u0016S\u007fy=ݰ\u001ff_\u0017\u0004)\\m\u0014\u0007#\u001dQ8\u001f%i\r&`CT\u001bw\u001aQ_zUT^\fi=\u001c\u0005\u0001d\u0012*21u;_\u0006\u001f8/+G]I#Ow0S\u000bg?\u001cn%ki\u0001\u0006p&|TO*7\r!ը#̆j¬Ԝ\\,\u001f\rlz\u0015\u0006 !0f\bD?68Peg\u0018m{`85\u0006ϐC֍rw\u0016ãQ`9G_v0cX\u000b\"T\rz\u0013n~B\u0002\u00111٩4ϒ6Trݘ\u0010}Je\u001a+RAw5BF\u00021j0`\u0003LI\u0018Ҙ\u0015ރ^t\u0018зl5*\u001fwA\u0015\u000b\u0007nj\u0010@\u007f\u0007iD|\u000f#\u0004ے]ڤ\u001d2]Ȩ\u00016\u0003D\u0015!\u0014\u0002M\u000bZk\u001d\u0005$\u001bm{N\u0017pߠ]ȠA\u001f\u0017ȯA4\bSSn\u0013gWt KK\u001b\b7Sn>i\u0018j\u001f8\u000fu!֩`Ђ&\u0003fа;\nj)\b\ff|M\u000fb7,VW \u001bYjW\u000fُ\u0011ȷ\"1\tǻ:~;[QV=\u0018}D=F˘]kw.\u007fyϰ*5"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005yC\u001e v+8\u0010gu*\u007f#NPc,;[v\u0013", "\u001a`]1e6BRb\t\t(\b\u000b\u001d8cn$\nFV", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "", "2mX\u000eV;Bd\u001d\u000e\u000f", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pFURuXP\u0002A%\u0016i\"\u0018\u001c\t\f]@ }D\u0016(\f\bG\u0011?y\u0005\u001b*c", "/mP9\\A>2\"\u0003g^8\r\t=t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sDj5\u000egANU0K9N8lR\u0001Li", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "4q^;g\u0017:b\u001c", "0`R8C(MV", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G.Fm!<\u0017MDh>\u001a\"geB\tq;N\u00025\u0011KW0&NpL\u0018#^\u001dbt}\u0001`E#jS7}\u00110%\u007fJl\u0012\u0010%\"\u000bQnL^YV}\u0013~K;2TXeCK@Nl<n\u0015\\'XG9(\u001dsb#rO.\u0011EV \u0002]CKF#\"v?(Sm:OI\\UH\u0005'-ZQ^\u000e;W\u00025x,M24?s\u0005Tva\u001ch\u0002$,oP|\r2E\u0012LUgt6:\u0019sh=\u0006\u001dfF5(y;JM\u000b\u0018Y`kDefJ\u0013_\u0013:]V\u00195UT)`u&\u0005P+inK\r\tc\u000e\u001eyFwF\u0016~\u0014ba#*\u001f?#|w7c@OhLY", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u000eV;Bd\u001d\u000e\u000f", "u(;7T=:\u001d z\u0004`u\n\t0/q(wFm\u0017\u0018G|\u000eEt%\u000b", "Adc\u000eV;Bd\u001d\u000e\u000f", "uKY.i(\bZ\u0015\b|(9|\nxW\u007f$\u0002-\u0001\u0018\u0017To\u0017:vzxJ", "/mP9\\A>2\"\u0003g^8\r\t=ti%\u0001@~&", "5dc\u000ea(EW.~Yg0i\t;u\u007f6\u000b*}\u001c\u0017E~", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@\u0015\u0010_3R\f'&UR\u0019\\^\u0003=\"!0", "Adc\u000ea(EW.~Yg0i\t;u\u007f6\u000b*}\u001c\u0017E~", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxG=B\u0003j0cv\u0006PP;,hbrK#g\u001e~", "/o_\u0010b5MS,\u000e", "5dc\u000ec7\u001c]\"\u000ezq;", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "Adc\u000ec7\u001c]\"\u000ezq;", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0`R890ES\u0004z\na", "5dc\u000fT*D4\u001d\u0006zI(\f\f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*D4\u001d\u0006zI(\f\f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "4q^;g\rBZ\u0019ivm/", "5dc\u0013e6Gby\u0003\u0002^\u0017x\u00182", "Adc\u0013e6Gby\u0003\u0002^\u0017x\u00182", "@d`BX:M6\u0019zy^9\u000b", "5dc\u001fX8NS'\u000e]^({\t<s", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u001fX8NS'\u000e]^({\t<s", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "Asa<a.\u001aQ(\u0003\fb;\u0011", "5dc g9H\\\u001bZxm0\u000e\r>y", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "Adc g9H\\\u001bZxm0\u000e\r>y", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ8", "2n8;5(<Y\u001b\f\u0005n5{", ">`a.`:", "", "uZ;7T=:\u001d z\u0004`um\u00133dUkbE|(\u0013\u0011v\nExn#h\u000b$@ok", "5dc\u0016`(@Sy\u0003\u0002^", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", ">q^0X:L6\u0019zy^9\u000b", "", "@dSBV,*c\u0015\u0006~m@", "\u001aiPCTuB]b_~e,R", "4h[2C(MV", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class AnalizeDni extends AsyncTask<Void, Void, String> {
    private WeakReference<ValidateDniActivity> activity;
    private IDAnalizeDniRequest analizeDniRequestObject;
    private Context appContext;
    private String backFilePath;
    private String frontFilePath;
    private ArrayList<KeyValue> requestHeaders;
    private Activity strongActivity;

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0018\u001d̉=!,˛\bӵLc\u0003\u0010Iي8\u000bDB\u0007\"B\u0012\u0006ј~lO/rdx2`SB\u000f\u001a|d.i&\nIKW*}P\r}Q.˪-"}, d2 = {"@dSBV,*c\u0015\u0006~m@", "", "4h[2C(MV", "", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aiPCTuB]b_~e,R"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return AnalizeDni.this.reduceQuality(null, this);
        }
    }

    public AnalizeDni(ValidateDniActivity dniActivity, IDAnalizeDniRequest analizeDniRequest, Context context, Activity activity, ArrayList<KeyValue> headers, String frontPath, String backPath) {
        Intrinsics.checkParameterIsNotNull(dniActivity, "dniActivity");
        Intrinsics.checkParameterIsNotNull(analizeDniRequest, "analizeDniRequest");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(headers, "headers");
        Intrinsics.checkParameterIsNotNull(frontPath, "frontPath");
        Intrinsics.checkParameterIsNotNull(backPath, "backPath");
        this.activity = new WeakReference<>(dniActivity);
        this.strongActivity = activity;
        this.appContext = context;
        this.analizeDniRequestObject = analizeDniRequest;
        this.requestHeaders = headers;
        this.frontFilePath = frontPath;
        this.backFilePath = backPath;
    }

    private final byte[] getImageFile(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> processHeaders(ArrayList<KeyValue> arrayList) {
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
            return "analizeDniCallBlock";
        } catch (NullPointerException e2) {
            e2.toString();
            ValidateDniActivity validateDniActivity = this.activity.get();
            if (validateDniActivity == null) {
                return "analizeDniCallBlock";
            }
            validateDniActivity.stepResult("fail", null);
            return "analizeDniCallBlock";
        }
    }

    public final WeakReference<ValidateDniActivity> getActivity() {
        return this.activity;
    }

    public final IDAnalizeDniRequest getAnalizeDniRequestObject() {
        return this.analizeDniRequestObject;
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public final String getBackFilePath() {
        return this.backFilePath;
    }

    public final String getFrontFilePath() {
        return this.frontFilePath;
    }

    public final ArrayList<KeyValue> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final Activity getStrongActivity() {
        return this.strongActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object reduceQuality(java.lang.String r12, kotlin.coroutines.Continuation<? super java.io.File> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni.AnonymousClass1
            if (r0 == 0) goto L54
            r8 = r13
            com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$1 r8 = (com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni.AnonymousClass1) r8
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L54
            int r0 = r8.label
            int r0 = r0 - r1
            r8.label = r0
        L13:
            java.lang.Object r3 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L5a
            java.lang.Object r0 = r8.L$2
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r0 = r8.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r8.L$0
            com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni r0 = (com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni) r0
            kotlin.ResultKt.throwOnFailure(r3)
        L2f:
            java.io.File r3 = (java.io.File) r3
            return r3
        L32:
            kotlin.ResultKt.throwOnFailure(r3)
            java.io.File r5 = new java.io.File
            r5.<init>(r12)
            com.ticnow.sdk.idnowonboarding.steps.helper.compression.Compressor r3 = com.ticnow.sdk.idnowonboarding.steps.helper.compression.Compressor.INSTANCE
            android.content.Context r4 = r11.appContext
            com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1 r7 = new kotlin.jvm.functions.Function1<com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression, kotlin.Unit>() { // from class: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1
                static {
                    /*
                        com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1 r0 = new com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1) com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1.INSTANCE com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression r2) {
                    /*
                        r1 = this;
                        com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression r2 = (com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression) r2
                        r1.invoke2(r2)
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1.invoke(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "$receiver"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                        r0 = 100
                        com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.QualityConstraintKt.quality(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$compressedImageFile$1.invoke2(com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression):void");
                }
            }
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8.L$0 = r11
            r8.L$1 = r12
            r8.L$2 = r5
            r8.label = r0
            r6 = 0
            r9 = 4
            r10 = 0
            java.lang.Object r3 = com.ticnow.sdk.idnowonboarding.steps.helper.compression.Compressor.compress$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L2f
            return r2
        L54:
            com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$1 r8 = new com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni$reduceQuality$1
            r8.<init>(r13)
            goto L13
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.services.steps.dni.AnalizeDni.reduceQuality(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setActivity(WeakReference<ValidateDniActivity> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "<set-?>");
        this.activity = weakReference;
    }

    public final void setAnalizeDniRequestObject(IDAnalizeDniRequest iDAnalizeDniRequest) {
        Intrinsics.checkParameterIsNotNull(iDAnalizeDniRequest, "<set-?>");
        this.analizeDniRequestObject = iDAnalizeDniRequest;
    }

    public final void setAppContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.appContext = context;
    }

    public final void setBackFilePath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.backFilePath = str;
    }

    public final void setFrontFilePath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.frontFilePath = str;
    }

    public final void setRequestHeaders(ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.requestHeaders = arrayList;
    }

    public final void setStrongActivity(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "<set-?>");
        this.strongActivity = activity;
    }
}
