package com.ticnow.sdk.idnowonboarding.model.api;

import android.app.Activity;
import android.content.Context;
import com.ticnow.sdk.idnowonboarding.model.http.IDGetEnrollmentReintentNewsRequest;
import com.ticnow.sdk.idnowonboarding.model.http.IDUpdateEnrollmentReintentRequest;
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
@Metadata(bv = {1, 0, 3}, d1 = {"ЯH\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}8\tWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:U]xc\u0015%˰rom2\u0006oRO!wȥ\t @\"\u0001<\u0013\u00022*v\u0012'~QN$\u0012^D!>`\u0012e\u0005H\u00186B.\b6\\\u0016VfLzfR/Q\r\u001aZ\\2wD\rO\u001dF\u00034#u\u0010*\u0014HG7%%\u0002\u0010\u001dQ:MIS:\u0018\u0013w?'YY$[D[\u0018\u0014C/\u007f\u0011kw>\\3W\u0011\u001052gcyX>,\u0006\u0004\u0014\rj\u000e>\n5YF-Hx8\u0012A\b\u000bSnb2bP\u0014\u0013ad)U\u0018A6Q/vSq;G[Mz3\u0019\u0007+\u0011p1[\u0003\u001bv\u0014yb>ešUW"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`VE\u001f\u00190", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`H", "u(E", "5d]2e(MSz~\n>5\n\u00136l\b(\u0005Om\u0017\u001bP~\u000eE_%Gg", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`VE\u001f\u0019\u0019oN4\r\u0012UP$PDF~\u00119S\tBp\u0001\u0015%z5nyQV\u0019Vb\u0015\bO\u0016hTif\t\u001d", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "/cS6g0H\\\u0015\u0006]^({\t<s", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5d]2e(MS\t\nyZ;|h8r\n/\u0003H\u0001 &4o\u0012E\u0006%>B}2E", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`VE\u001f\u0019\u0019oN4\r\u0012UP$^O6\u001b\u0017,)\u000bHr\b\u0013\u001e\u000e>y]BZ\u0019Vy\u001e\u0005*)zTF_\bWHT8", "CtX185K] \u0006\u0003^5\f", "", "CtX17,OW\u0017~", "3qa<e\nHR\u0019", "\u0015d]2e(MSz~\n>5\n\u00136l\b(\u0005Om\u0017\u001bP~\u000eE\u0006\u000e5k\f\r7{&5\\", "\u0015d]2e(MS\t\nyZ;|h8r\n/\u0003H\u0001 &4o\u0012E\u0006%>hf I{\u0003.[SBz", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDReintentServicesImpl implements IDReintentServices {

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00173V\u000eP_T\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~137s;9 \u001a\u0003\u001fֺsЛ\tlpׅ\u0002TNL0{690\u0017\u001ai\u0015\u0005\u0013oh\\h.!MJZ\u001d|6\u0018vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`VE\u001f\u0019\u0019oN4\r\u0012UP$PDF~\u00119S\tBp\u0001\u0015%z5nyQV\u0019Vb\u0015\bO\u0016hTif\t\u001d", "", "5dc\u0012a9HZ \u0007zg;i\t3n\u000f(\u0005Oi\u0017)U\\\u000eH\u0007%Ch", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sJaHfl9X}.OLW;IRvF#\u0012c\u001d7+\u001f\u0013FA0~DE.]", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGC9\u0016C5[\u0001.NTN5k?rA\u001d!Z\u0017]\u0014\r\u0017g.$zT7-\u0017\u00020\u00077y|U\u001d\n>l:0e\u001dK\u0003\u0017K(.dWU)\nVEL,\u0006q\u0019[1C>H3i5\n", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0014X;\u001e\\&\t\u0002e4|\u0012>R\u007f,\u0005O\u0001 &0o Jc%Ai}.F", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@\u001b\u0007r\fW\u00041NSV,ea_=\u0018\u001bi\u000eW:u\u0005kO\u0011nPG\u001f\u0016;\u001f", "Adc\u0014X;\u001e\\&\t\u0002e4|\u0012>R\u007f,\u0005O\u0001 &0o Jc%Ai}.F", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGC9\u0016C5[\u0001.NTN5k?rA\u001d!Z\u0017]\u0014\r\u0017g.$zT7-\u0017\u0002\rr", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateGetEnrollmentReintentNewsResult {
        private String error;
        private IDGetEnrollmentReintentNewsRequest getEnrollmentReintentNewsRequest;
        private ArrayList<KeyValue> headers;

        public GenerateGetEnrollmentReintentNewsResult(IDGetEnrollmentReintentNewsRequest iDGetEnrollmentReintentNewsRequest, String str, ArrayList<KeyValue> arrayList) {
            this.getEnrollmentReintentNewsRequest = iDGetEnrollmentReintentNewsRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateGetEnrollmentReintentNewsResult copy$default(GenerateGetEnrollmentReintentNewsResult generateGetEnrollmentReintentNewsResult, IDGetEnrollmentReintentNewsRequest iDGetEnrollmentReintentNewsRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                iDGetEnrollmentReintentNewsRequest = generateGetEnrollmentReintentNewsResult.getEnrollmentReintentNewsRequest;
            }
            if ((2 & i2) != 0) {
                str = generateGetEnrollmentReintentNewsResult.error;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                arrayList = generateGetEnrollmentReintentNewsResult.headers;
            }
            return generateGetEnrollmentReintentNewsResult.copy(iDGetEnrollmentReintentNewsRequest, str, arrayList);
        }

        public final IDGetEnrollmentReintentNewsRequest component1() {
            return this.getEnrollmentReintentNewsRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateGetEnrollmentReintentNewsResult copy(IDGetEnrollmentReintentNewsRequest iDGetEnrollmentReintentNewsRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateGetEnrollmentReintentNewsResult(iDGetEnrollmentReintentNewsRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateGetEnrollmentReintentNewsResult)) {
                return false;
            }
            GenerateGetEnrollmentReintentNewsResult generateGetEnrollmentReintentNewsResult = (GenerateGetEnrollmentReintentNewsResult) obj;
            return Intrinsics.areEqual(this.getEnrollmentReintentNewsRequest, generateGetEnrollmentReintentNewsResult.getEnrollmentReintentNewsRequest) && Intrinsics.areEqual(this.error, generateGetEnrollmentReintentNewsResult.error) && Intrinsics.areEqual(this.headers, generateGetEnrollmentReintentNewsResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final IDGetEnrollmentReintentNewsRequest getGetEnrollmentReintentNewsRequest() {
            return this.getEnrollmentReintentNewsRequest;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            IDGetEnrollmentReintentNewsRequest iDGetEnrollmentReintentNewsRequest = this.getEnrollmentReintentNewsRequest;
            int iHashCode = (iDGetEnrollmentReintentNewsRequest != null ? iDGetEnrollmentReintentNewsRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setGetEnrollmentReintentNewsRequest(IDGetEnrollmentReintentNewsRequest iDGetEnrollmentReintentNewsRequest) {
            this.getEnrollmentReintentNewsRequest = iDGetEnrollmentReintentNewsRequest;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public String toString() {
            return "GenerateGetEnrollmentReintentNewsResult(getEnrollmentReintentNewsRequest=" + this.getEnrollmentReintentNewsRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00173V\u000eP_T\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~73;sA3#{\u0002vJ}u3e?\u05ccuʐLL*Â.90\u0015\u001agdf\u000by^c)F\u001fM4V\u001d|6\u0014vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`VE\u001f\u0019\u0019oN4\r\u0012UP$^O6\u001b\u0017,)\u000bHr\b\u0013\u001e\u000e>y]BZ\u0019Vy\u001e\u0005*)zTF_\bWHT8", "", "CoS.g,\u001e\\&\t\u0002e4|\u0012>R\u007f,\u0005O\u0001 &4o\u001aLv3D", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sXl8\u0003r,.\u007f4QSU4\\[\u0002*\u0014\u0016c\u001dN4\u001cqYM4nRFt", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGQD\u0006_;NV0TVU3dR{L\u0001\u0012^\u0017]+\u0016\u0014FA0~DE.]\u0013N}LdJ\u0013\u0012\u001774^Qc\u0014P{j\\F%yB#o\tKH\u000f>7q\bs\u0004`HIyWb", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "5dc\"c+:b\u0019^\u0004k6\u0004\u00107e\t7h@\u0005 &Gx\u001d)v1EY\f/", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r>zC)^L@)\u0012b(]v\u0007PYX3cZrF#~Z\u0012W:\r\u000eh.$zT7-\u0017\u0002", "Adc\"c+:b\u0019^\u0004k6\u0004\u00107e\t7h@\u0005 &Gx\u001d)v1EY\f/", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017FJz?gxGQD\u0006_;NV0TVU3dR{L\u0001\u0012^\u0017]+\u0016\u0014FA0~DE.]o:", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateUpdateEnrollmentReintentNewsResult {
        private String error;
        private ArrayList<KeyValue> headers;
        private IDUpdateEnrollmentReintentRequest updateEnrollmentReintentRequest;

        public GenerateUpdateEnrollmentReintentNewsResult(IDUpdateEnrollmentReintentRequest iDUpdateEnrollmentReintentRequest, String str, ArrayList<KeyValue> arrayList) {
            this.updateEnrollmentReintentRequest = iDUpdateEnrollmentReintentRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateUpdateEnrollmentReintentNewsResult copy$default(GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResult, IDUpdateEnrollmentReintentRequest iDUpdateEnrollmentReintentRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                iDUpdateEnrollmentReintentRequest = generateUpdateEnrollmentReintentNewsResult.updateEnrollmentReintentRequest;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                str = generateUpdateEnrollmentReintentNewsResult.error;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                arrayList = generateUpdateEnrollmentReintentNewsResult.headers;
            }
            return generateUpdateEnrollmentReintentNewsResult.copy(iDUpdateEnrollmentReintentRequest, str, arrayList);
        }

        public final IDUpdateEnrollmentReintentRequest component1() {
            return this.updateEnrollmentReintentRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateUpdateEnrollmentReintentNewsResult copy(IDUpdateEnrollmentReintentRequest iDUpdateEnrollmentReintentRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateUpdateEnrollmentReintentNewsResult(iDUpdateEnrollmentReintentRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateUpdateEnrollmentReintentNewsResult)) {
                return false;
            }
            GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResult = (GenerateUpdateEnrollmentReintentNewsResult) obj;
            return Intrinsics.areEqual(this.updateEnrollmentReintentRequest, generateUpdateEnrollmentReintentNewsResult.updateEnrollmentReintentRequest) && Intrinsics.areEqual(this.error, generateUpdateEnrollmentReintentNewsResult.error) && Intrinsics.areEqual(this.headers, generateUpdateEnrollmentReintentNewsResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public final IDUpdateEnrollmentReintentRequest getUpdateEnrollmentReintentRequest() {
            return this.updateEnrollmentReintentRequest;
        }

        public int hashCode() {
            IDUpdateEnrollmentReintentRequest iDUpdateEnrollmentReintentRequest = this.updateEnrollmentReintentRequest;
            int iHashCode = (iDUpdateEnrollmentReintentRequest != null ? iDUpdateEnrollmentReintentRequest.hashCode() : 0) * 31;
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

        public final void setUpdateEnrollmentReintentRequest(IDUpdateEnrollmentReintentRequest iDUpdateEnrollmentReintentRequest) {
            this.updateEnrollmentReintentRequest = iDUpdateEnrollmentReintentRequest;
        }

        public String toString() {
            return "GenerateUpdateEnrollmentReintentNewsResult(updateEnrollmentReintentRequest=" + this.updateEnrollmentReintentRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.model.api.IDReintentServices
    public GenerateGetEnrollmentReintentNewsResult generateGetEnrollmentReintenNews(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDGetEnrollmentReintentNewsRequest iDGetEnrollmentReintentNewsRequest = new IDGetEnrollmentReintentNewsRequest();
            iDGetEnrollmentReintentNewsRequest.setCommonParamsRequest(commonParamsRequest);
            iDGetEnrollmentReintentNewsRequest.setCommonUserDataRequest(commonUserDataRequest);
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
            return new GenerateGetEnrollmentReintentNewsResult(iDGetEnrollmentReintentNewsRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateGetEnrollmentReintentNewsResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.model.api.IDReintentServices
    public GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintenNews(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String uuidEnrollment, String uuidDevice, String errorCode, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        Intrinsics.checkParameterIsNotNull(uuidEnrollment, "uuidEnrollment");
        Intrinsics.checkParameterIsNotNull(uuidDevice, "uuidDevice");
        Intrinsics.checkParameterIsNotNull(errorCode, "errorCode");
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDUpdateEnrollmentReintentRequest iDUpdateEnrollmentReintentRequest = new IDUpdateEnrollmentReintentRequest();
            iDUpdateEnrollmentReintentRequest.setCommonParamsRequest(commonParamsRequest);
            iDUpdateEnrollmentReintentRequest.setCommonUserDataRequest(commonUserDataRequest);
            iDUpdateEnrollmentReintentRequest.setUuidEnrollment(uuidEnrollment);
            iDUpdateEnrollmentReintentRequest.setUuidDevice(uuidDevice);
            iDUpdateEnrollmentReintentRequest.setErrorCode(errorCode);
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
            return new GenerateUpdateEnrollmentReintentNewsResult(iDUpdateEnrollmentReintentRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateUpdateEnrollmentReintentNewsResult(null, e2.getLocalizedMessage(), null);
        }
    }
}
