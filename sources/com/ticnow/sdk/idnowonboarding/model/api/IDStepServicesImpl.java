package com.ticnow.sdk.idnowonboarding.model.api;

import android.app.Activity;
import android.content.Context;
import com.ticnow.sdk.idnowonboarding.model.http.IDAnalizeDniRequest;
import com.ticnow.sdk.idnowonboarding.model.http.IDMatchEnrollFaceRequest;
import com.ticnow.sdk.idnowonboarding.model.http.IDMatchFaceRequest;
import com.ticnow.sdk.idnowonboarding.model.http.IDRegisterPhoneRequest;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDCredentials;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
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
@Metadata(bv = {1, 0, 3}, d1 = {"ЯX\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B0c$wDCU0}*\teNog\u0005JbŏK\u000f\u001c\u0016\u0001j2L]xs\u0012\u0017˰JoU3UڎE9vt>\u0005&68\u0600*\u0005/\u0019bJ.\u0016\u001bd\f\u000fܘ4@~:\u001b_[\u00062\u00124@P\u0005,_\u007fNdL\u001daH4;\u0003\u0018H~+m7\u0015M;N\u0005+\u001b\u007fy\u001eYJg9#0k\u00035\\\fC\u0011K\n=3rW?9V\fkFZ\u0010\u0014C:e\f\f\u0001\u000fd\u0015Sp\fU:eb*`T<@e\n\u001eT\u0004<\u0018WL<02f6\u0012cx\u0001XXP0dr\u0004\thN\u0017S\bc/G$~Q\u0010EIRE\u0007\u001d\rL-1r/nl\u000e\u000f\u001fKX\u0006eIQnGxR\u0018nUm2z\u0013\u00068\u001aHG.9,)<$=Kk;3!\u001a\u0011^C\u0016\u0005mhxUyRvO8mtGp\u001dTER{\u001dk~l\t0\u001fP4T5\u00028\u0017.a\u0010<O+@R]o\u0002j{e:)=oOY\u001du>[GiK5\u007fm@e`\n,?jl5\\tVk\f\tfX&@]\u0003\u0010&\u0006tR\u001a)J? &dD?&t)X\u0005.Bo\f\u001f^\tvx\u0007d54\u0003\u00183\u000b\b_`#\u00058R\u0007bD|\u000f<]E_81&\u0004&\u00198\u000b(\u001f~\"\u0006wkZNdlD}\u0006\u007f.129\u007fKm\u0017\u001d\bA207uP\u0001piM@1+\u0011\b,Sx>i\u0018j\u001f;\u000fx3Ud\u00192v\r\u0002\u0002\u0018\u0015\u0018\bn^\u000fWed\u000b\nM_q1g%VH~\u0015\u001fL4\u0017n\u0001\r{Aϧ+?"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gYH", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ$", "u(E", "5d]2e(MSt\bve0\u0012\t\u000en\u0004\u0015{L\u0011\u0017%V", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\r`b=+rY7}\u001106\u0002Gx\u0001\u001a%z5x\u0001Iee", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", ">`c5<+", "", "CtX17,OW\u0017~", "1nd;g9R", "/cS6g0H\\\u0015\u0006]^({\t<s", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5d]2e(MS\u0001z\n\\/\\\u0012<o\u0007/\\<~\u0017\u0004G{\u001e<\u00054", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rlUP\"q$@,\u00123Pb7f\u0001x\u0016\u001aEj~QC\u0010U\n\u001c\u0005\u0017", "4`R2@(I", "Adb@\\6G7\u0018", ":he29(<S", "4`R24<=W(", "5d]2e(MS\u0001z\n\\/]\u0005-el(\bP\u0001%&", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rlUP\"q%3\u001d\b\u0019I\u000eKh\u000f\u001b\u0003\u000eCzwQ,", "5d]2e(MS\u0006~|b:\f\t<P\u00032\u0005@m\u0017#Wo\u001cK", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rqYC(|S7,r/S\u000b;U\u0001\u0018&\u000eCy]Bd N\tj", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "BqP;f(<b\u001d\t\u0004=(\f\u0005", "\u0015d]2e(MSt\bve0\u0012\t\u000en\u0004\u0015{L\u0011\u0017%V\\\u000eJ\u0007,D", "\u0015d]2e(MS\u0001z\n\\/\\\u0012<o\u0007/\\<~\u0017\u0004G{\u001e<\u00054\"Y\f0>|", "\u0015d]2e(MS\u0001z\n\\/]\u0005-el(\bP\u0001%&4o\u001cL}4", "\u0015d]2e(MS\u0006~|b:\f\t<P\u00032\u0005@m\u0017#Wo\u001cKc%Ci\u0005/", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDStepServicesImpl implements IDStepServices {

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00153V\u000eP_R\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~139s;9 \u001a\u0005\u001fֺsЛ\tlpׅ\u0002TNL0{690\u0017\u001ai\u0015\u0005\u0013oh\\h.!MJZ\u001d|6\u0018vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\r`b=+rY7}\u001106\u0002Gx\u0001\u001a%z5x\u0001Iee", "", "/mP9\\A>2\"\u0003g^8\r\t=t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sDj5\u000egANU0K9N8lR\u0001Li", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxG=B\u0003j0cv\u0006PP;,hbrK#gA\u0013J<\tN`=-p\u000e%.\u00150R\u0004\u0011O\u0006\b'\n~z\u007fF]Y#\u0007\"qU\u0010lTh5=8", "5dc\u000ea(EW.~Yg0i\t;u\u007f6\u000b", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@\u0015\u0010_3R\f'&UR\u0019\\^\u0003=\"!0", "Adc\u000ea(EW.~Yg0i\t;u\u007f6\u000b", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxG=B\u0003j0cv\u0006PP;,hbrK#g\u001e~", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateAnalizeDniRequestResult {
        private IDAnalizeDniRequest analizeDniRequest;
        private String error;
        private ArrayList<KeyValue> headers;

        public GenerateAnalizeDniRequestResult(IDAnalizeDniRequest iDAnalizeDniRequest, String str, ArrayList<KeyValue> arrayList) {
            this.analizeDniRequest = iDAnalizeDniRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateAnalizeDniRequestResult copy$default(GenerateAnalizeDniRequestResult generateAnalizeDniRequestResult, IDAnalizeDniRequest iDAnalizeDniRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((1 & i2) != 0) {
                iDAnalizeDniRequest = generateAnalizeDniRequestResult.analizeDniRequest;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str = generateAnalizeDniRequestResult.error;
            }
            if ((i2 & 4) != 0) {
                arrayList = generateAnalizeDniRequestResult.headers;
            }
            return generateAnalizeDniRequestResult.copy(iDAnalizeDniRequest, str, arrayList);
        }

        public final IDAnalizeDniRequest component1() {
            return this.analizeDniRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateAnalizeDniRequestResult copy(IDAnalizeDniRequest iDAnalizeDniRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateAnalizeDniRequestResult(iDAnalizeDniRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateAnalizeDniRequestResult)) {
                return false;
            }
            GenerateAnalizeDniRequestResult generateAnalizeDniRequestResult = (GenerateAnalizeDniRequestResult) obj;
            return Intrinsics.areEqual(this.analizeDniRequest, generateAnalizeDniRequestResult.analizeDniRequest) && Intrinsics.areEqual(this.error, generateAnalizeDniRequestResult.error) && Intrinsics.areEqual(this.headers, generateAnalizeDniRequestResult.headers);
        }

        public final IDAnalizeDniRequest getAnalizeDniRequest() {
            return this.analizeDniRequest;
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            IDAnalizeDniRequest iDAnalizeDniRequest = this.analizeDniRequest;
            int iHashCode = (iDAnalizeDniRequest != null ? iDAnalizeDniRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setAnalizeDniRequest(IDAnalizeDniRequest iDAnalizeDniRequest) {
            this.analizeDniRequest = iDAnalizeDniRequest;
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public String toString() {
            return "GenerateAnalizeDniRequestResult(analizeDniRequest=" + this.analizeDniRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00173V\u000eP_T\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~73;sA3#{\u0002vJ}u3e?\u05ccuʐLL*Â.90\u0015\u001agdf\u000by^c)F\u001fM4V\u001d|6\u0014vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rlUP\"q$@,\u00123Pb7f\u0001x\u0016\u001aEj~QC\u0010U\n\u001c\u0005\u0017", "", ";`c0[\fG`#\u0006\u0002?(z\t\u001ce\f8{N\u0010", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sP]H\u0005f\fW\u00041NS/(ZR_= \"Z\u001c]\u0001", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGI5\u0016a/.\u007f4QSU\rXPr*\u0014\u001ej\u000e\\:bk^=5j\u000e>\u001b\u0011.\u0013oJu\u0005\u0015\u0018c\u001colSRYW\t\u0019|\u000b\u0005uSUs`KOT8mU", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "5dc\u001aT;<Vx\b\bh3\u0004i+c\u007f\u0015{L\u0011\u0017%V", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@!\u0003r*QV0TVU3=Np=\u0001\u0012f\u001eN9\u001cZ", "Adc\u001aT;<Vx\b\bh3\u0004i+c\u007f\u0015{L\u0011\u0017%V", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGI5\u0016a/.\u007f4QSU\rXPr*\u0014\u001ej\u000e\\:bHJ", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateMatchEnrollFaceRequestResult {
        private String error;
        private ArrayList<KeyValue> headers;
        private IDMatchEnrollFaceRequest matchEnrollFaceRequest;

        public GenerateMatchEnrollFaceRequestResult(IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest, String str, ArrayList<KeyValue> arrayList) {
            this.matchEnrollFaceRequest = iDMatchEnrollFaceRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateMatchEnrollFaceRequestResult copy$default(GenerateMatchEnrollFaceRequestResult generateMatchEnrollFaceRequestResult, IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                iDMatchEnrollFaceRequest = generateMatchEnrollFaceRequestResult.matchEnrollFaceRequest;
            }
            if ((2 & i2) != 0) {
                str = generateMatchEnrollFaceRequestResult.error;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                arrayList = generateMatchEnrollFaceRequestResult.headers;
            }
            return generateMatchEnrollFaceRequestResult.copy(iDMatchEnrollFaceRequest, str, arrayList);
        }

        public final IDMatchEnrollFaceRequest component1() {
            return this.matchEnrollFaceRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateMatchEnrollFaceRequestResult copy(IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateMatchEnrollFaceRequestResult(iDMatchEnrollFaceRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateMatchEnrollFaceRequestResult)) {
                return false;
            }
            GenerateMatchEnrollFaceRequestResult generateMatchEnrollFaceRequestResult = (GenerateMatchEnrollFaceRequestResult) obj;
            return Intrinsics.areEqual(this.matchEnrollFaceRequest, generateMatchEnrollFaceRequestResult.matchEnrollFaceRequest) && Intrinsics.areEqual(this.error, generateMatchEnrollFaceRequestResult.error) && Intrinsics.areEqual(this.headers, generateMatchEnrollFaceRequestResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public final IDMatchEnrollFaceRequest getMatchEnrollFaceRequest() {
            return this.matchEnrollFaceRequest;
        }

        public int hashCode() {
            IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest = this.matchEnrollFaceRequest;
            int iHashCode = (iDMatchEnrollFaceRequest != null ? iDMatchEnrollFaceRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public final void setMatchEnrollFaceRequest(IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest) {
            this.matchEnrollFaceRequest = iDMatchEnrollFaceRequest;
        }

        public String toString() {
            return "GenerateMatchEnrollFaceRequestResult(matchEnrollFaceRequest=" + this.matchEnrollFaceRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00173V\u000eP_T\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~73;sA3#{\u0002vJ}u3e?\u05ccuʐLL*Â.90\u0015\u001agdf\u000by^c)F\u001fM4V\u001d|6\u0014vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rlUP\"q%3\u001d\b\u0019I\u000eKh\u000f\u001b\u0003\u000eCzwQ,", "", ";`c0[\r:Q\u0019kzj<|\u0017>", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sP]H\u0005f\rJt'4LZ<\\`\u0002\u0013", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGI5\u0016a//r%G9N8lR\u0001Lix_\n_'V\fUJ&82F,\f5KW\"m|\u001d\u0012WEytI kT\u0007\u0011\n(-vU/#j", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "5dc\u001aT;<Vyzx^\u0019|\u0015?e\u000e7", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@!\u0003r*QW#EL;,hbrK#g", "Adc\u001aT;<Vyzx^\u0019|\u0015?e\u000e7", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGI5\u0016a//r%G9N8lR\u0001LiUK", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateMatchFaceRequestResult {
        private String error;
        private ArrayList<KeyValue> headers;
        private IDMatchFaceRequest matchFaceRequest;

        public GenerateMatchFaceRequestResult(IDMatchFaceRequest iDMatchFaceRequest, String str, ArrayList<KeyValue> arrayList) {
            this.matchFaceRequest = iDMatchFaceRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateMatchFaceRequestResult copy$default(GenerateMatchFaceRequestResult generateMatchFaceRequestResult, IDMatchFaceRequest iDMatchFaceRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((1 & i2) != 0) {
                iDMatchFaceRequest = generateMatchFaceRequestResult.matchFaceRequest;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                str = generateMatchFaceRequestResult.error;
            }
            if ((i2 & 4) != 0) {
                arrayList = generateMatchFaceRequestResult.headers;
            }
            return generateMatchFaceRequestResult.copy(iDMatchFaceRequest, str, arrayList);
        }

        public final IDMatchFaceRequest component1() {
            return this.matchFaceRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateMatchFaceRequestResult copy(IDMatchFaceRequest iDMatchFaceRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateMatchFaceRequestResult(iDMatchFaceRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateMatchFaceRequestResult)) {
                return false;
            }
            GenerateMatchFaceRequestResult generateMatchFaceRequestResult = (GenerateMatchFaceRequestResult) obj;
            return Intrinsics.areEqual(this.matchFaceRequest, generateMatchFaceRequestResult.matchFaceRequest) && Intrinsics.areEqual(this.error, generateMatchFaceRequestResult.error) && Intrinsics.areEqual(this.headers, generateMatchFaceRequestResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public final IDMatchFaceRequest getMatchFaceRequest() {
            return this.matchFaceRequest;
        }

        public int hashCode() {
            IDMatchFaceRequest iDMatchFaceRequest = this.matchFaceRequest;
            int iHashCode = (iDMatchFaceRequest != null ? iDMatchFaceRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public final void setMatchFaceRequest(IDMatchFaceRequest iDMatchFaceRequest) {
            this.matchFaceRequest = iDMatchFaceRequest;
        }

        public String toString() {
            return "GenerateMatchFaceRequestResult(matchFaceRequest=" + this.matchFaceRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00173V\u000eP_T\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~73;sA3#{\u0002vJ}u3e?\u05ccuʐLL*Â.90\u0015\u001agdf\u000by^c)F\u001fM4V\u001d|6\u0014vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rqYC(|S7,r/S\u000b;U\u0001\u0018&\u000eCy]Bd N\tj", "", "@dV6f;>`\u0004\u0002\u0005g,i\t;u\u007f6\u000b", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sUa;\u000bq;N\u0004\u0012JVW,IR~M\u0014 ic", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGN9\tg:]v42OX5\\?rI$\u0012h\u001d$\u0012\u0012\u0001j=mu@@!Q\u001aX\u000f?q\u0003a|\u00131{l\ff\u001fK\u0001^QN6dZ@c\bV\u0017\tS", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "5dc\u001fX.Ba(~\bI/\u0007\u0012/R\u007f4\f@\u000f&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@&\u0007e0\\\u0006'T7Q6eR_= \"Z\u001c]\u0001", "Adc\u001fX.Ba(~\bI/\u0007\u0012/R\u007f4\f@\u000f&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGN9\tg:]v42OX5\\?rI$\u0012h\u001d$n}", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateRegisterPhoneRequestResult {
        private String error;
        private ArrayList<KeyValue> headers;
        private IDRegisterPhoneRequest registerPhoneRequest;

        public GenerateRegisterPhoneRequestResult(IDRegisterPhoneRequest iDRegisterPhoneRequest, String str, ArrayList<KeyValue> arrayList) {
            this.registerPhoneRequest = iDRegisterPhoneRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateRegisterPhoneRequestResult copy$default(GenerateRegisterPhoneRequestResult generateRegisterPhoneRequestResult, IDRegisterPhoneRequest iDRegisterPhoneRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                iDRegisterPhoneRequest = generateRegisterPhoneRequestResult.registerPhoneRequest;
            }
            if ((2 & i2) != 0) {
                str = generateRegisterPhoneRequestResult.error;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                arrayList = generateRegisterPhoneRequestResult.headers;
            }
            return generateRegisterPhoneRequestResult.copy(iDRegisterPhoneRequest, str, arrayList);
        }

        public final IDRegisterPhoneRequest component1() {
            return this.registerPhoneRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateRegisterPhoneRequestResult copy(IDRegisterPhoneRequest iDRegisterPhoneRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateRegisterPhoneRequestResult(iDRegisterPhoneRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateRegisterPhoneRequestResult)) {
                return false;
            }
            GenerateRegisterPhoneRequestResult generateRegisterPhoneRequestResult = (GenerateRegisterPhoneRequestResult) obj;
            return Intrinsics.areEqual(this.registerPhoneRequest, generateRegisterPhoneRequestResult.registerPhoneRequest) && Intrinsics.areEqual(this.error, generateRegisterPhoneRequestResult.error) && Intrinsics.areEqual(this.headers, generateRegisterPhoneRequestResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public final IDRegisterPhoneRequest getRegisterPhoneRequest() {
            return this.registerPhoneRequest;
        }

        public int hashCode() {
            IDRegisterPhoneRequest iDRegisterPhoneRequest = this.registerPhoneRequest;
            int iHashCode = (iDRegisterPhoneRequest != null ? iDRegisterPhoneRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public final void setRegisterPhoneRequest(IDRegisterPhoneRequest iDRegisterPhoneRequest) {
            this.registerPhoneRequest = iDRegisterPhoneRequest;
        }

        public String toString() {
            return "GenerateRegisterPhoneRequestResult(registerPhoneRequest=" + this.registerPhoneRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.model.api.IDStepServices
    public GenerateAnalizeDniRequestResult generateAnalizeDniRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, String pathId, String uuidDevice, String country, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(pathId, "pathId");
        Intrinsics.checkParameterIsNotNull(uuidDevice, "uuidDevice");
        Intrinsics.checkParameterIsNotNull(country, "country");
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDAnalizeDniRequest iDAnalizeDniRequest = new IDAnalizeDniRequest();
            iDAnalizeDniRequest.setCommonParamsRequest(commonParamsRequest);
            iDAnalizeDniRequest.setCountry(country);
            iDAnalizeDniRequest.setPathId(pathId);
            iDAnalizeDniRequest.setUuidDevice(uuidDevice);
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("API-USER");
            IDCredentials idNowCredentials = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue.setValue(apiUser);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("API-KEY");
            IDCredentials idNowCredentials2 = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue2.setValue(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            return new GenerateAnalizeDniRequestResult(iDAnalizeDniRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateAnalizeDniRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.model.api.IDStepServices
    public GenerateMatchEnrollFaceRequestResult generateMatchEnrollFaceRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, String pathId, String uuidDevice, String faceMap, String sessionId, String liveFace, String faceAudit, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(pathId, "pathId");
        Intrinsics.checkParameterIsNotNull(uuidDevice, "uuidDevice");
        Intrinsics.checkParameterIsNotNull(faceMap, "faceMap");
        Intrinsics.checkParameterIsNotNull(sessionId, "sessionId");
        Intrinsics.checkParameterIsNotNull(liveFace, "liveFace");
        Intrinsics.checkParameterIsNotNull(faceAudit, "faceAudit");
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDMatchEnrollFaceRequest iDMatchEnrollFaceRequest = new IDMatchEnrollFaceRequest();
            iDMatchEnrollFaceRequest.setCommonParamsRequest(commonParamsRequest);
            iDMatchEnrollFaceRequest.setPathId(pathId);
            iDMatchEnrollFaceRequest.setUuidDevice(uuidDevice);
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("facemap");
            keyValue.setValue(faceMap);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("sessionId");
            keyValue2.setValue(sessionId);
            KeyValue keyValue3 = new KeyValue();
            keyValue3.setKey("liveFace");
            keyValue3.setValue(liveFace);
            KeyValue keyValue4 = new KeyValue();
            keyValue4.setKey("base64Face");
            keyValue4.setValue(faceAudit);
            ArrayList<KeyValue> arrayList2 = new ArrayList<>();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            arrayList2.add(keyValue3);
            arrayList2.add(keyValue4);
            iDMatchEnrollFaceRequest.setAdditionalsParams(arrayList2);
            KeyValue keyValue5 = new KeyValue();
            keyValue5.setKey("API-USER");
            IDCredentials idNowCredentials = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue5.setValue(apiUser);
            KeyValue keyValue6 = new KeyValue();
            keyValue6.setKey("API-KEY");
            IDCredentials idNowCredentials2 = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue6.setValue(str);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(keyValue5);
            arrayList3.add(keyValue6);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                }
            }
            return new GenerateMatchEnrollFaceRequestResult(iDMatchEnrollFaceRequest, null, arrayList3);
        } catch (Exception e2) {
            return new GenerateMatchEnrollFaceRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.model.api.IDStepServices
    public GenerateMatchFaceRequestResult generateMatchFaceRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, String pathId, String uuidDevice, String faceMap, String sessionId, String liveFace, String faceAudit, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(pathId, "pathId");
        Intrinsics.checkParameterIsNotNull(uuidDevice, "uuidDevice");
        Intrinsics.checkParameterIsNotNull(faceMap, "faceMap");
        Intrinsics.checkParameterIsNotNull(sessionId, "sessionId");
        Intrinsics.checkParameterIsNotNull(liveFace, "liveFace");
        Intrinsics.checkParameterIsNotNull(faceAudit, "faceAudit");
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDMatchFaceRequest iDMatchFaceRequest = new IDMatchFaceRequest();
            iDMatchFaceRequest.setCommonParamsRequest(commonParamsRequest);
            iDMatchFaceRequest.setPathId(pathId);
            iDMatchFaceRequest.setUuidDevice(uuidDevice);
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("facemap");
            keyValue.setValue(faceMap);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("sessionId");
            keyValue2.setValue(sessionId);
            KeyValue keyValue3 = new KeyValue();
            keyValue3.setKey("liveFace");
            keyValue3.setValue(liveFace);
            KeyValue keyValue4 = new KeyValue();
            keyValue4.setKey("base64Face");
            keyValue4.setValue(faceAudit);
            ArrayList<KeyValue> arrayList2 = new ArrayList<>();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            arrayList2.add(keyValue3);
            arrayList2.add(keyValue4);
            iDMatchFaceRequest.setAdditionalsParams(arrayList2);
            KeyValue keyValue5 = new KeyValue();
            keyValue5.setKey("API-USER");
            IDCredentials idNowCredentials = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue5.setValue(apiUser);
            KeyValue keyValue6 = new KeyValue();
            keyValue6.setKey("API-KEY");
            IDCredentials idNowCredentials2 = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue6.setValue(str);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(keyValue5);
            arrayList3.add(keyValue6);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                }
            }
            return new GenerateMatchFaceRequestResult(iDMatchFaceRequest, null, arrayList3);
        } catch (Exception e2) {
            return new GenerateMatchFaceRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.model.api.IDStepServices
    public GenerateRegisterPhoneRequestResult generateRegisterPhoneRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String pathId, String uuidDevice, ArrayList<KeyValue> transactionData, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        Intrinsics.checkParameterIsNotNull(pathId, "pathId");
        Intrinsics.checkParameterIsNotNull(uuidDevice, "uuidDevice");
        Intrinsics.checkParameterIsNotNull(transactionData, "transactionData");
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDRegisterPhoneRequest iDRegisterPhoneRequest = new IDRegisterPhoneRequest();
            iDRegisterPhoneRequest.setCommonParamsRequest(commonParamsRequest);
            iDRegisterPhoneRequest.setPathId(Integer.parseInt(pathId));
            iDRegisterPhoneRequest.setUuidDevice(uuidDevice);
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("API-USER");
            IDCredentials idNowCredentials = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue.setValue(apiUser);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("API-KEY");
            IDCredentials idNowCredentials2 = iDSecurityApiImpl.getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue2.setValue(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            return new GenerateRegisterPhoneRequestResult(iDRegisterPhoneRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateRegisterPhoneRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }
}
