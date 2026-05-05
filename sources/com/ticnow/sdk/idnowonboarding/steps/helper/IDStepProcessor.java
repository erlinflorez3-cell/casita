package com.ticnow.sdk.idnowonboarding.steps.helper;

import com.ticnow.sdk.idnowonboarding.model.step.IDNowStep;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^L@'\u0016c79\u00041EL\\:f_H", "", "u(E", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDStepProcessor {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007njO0Le^.Zݷ2\u000f\u0002{<$a$w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN\"\u0007kDI\u0004z\u000e\u0016\u001d5Zom5\u0016\fK=x\u0005F\u000702P>(\ni :J v)I*\u0013B4NxRR;VM6 \u0010V0\u0011 lg|8vqF@?%\u0013ipP\u0006f`\u0001[\u0015^TU\u0016ȡe)"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^L@'\u0016c79\u00041EL\\:f_1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "2hb=_(R<\u0015\u0007z?6\nl8t\u007f5\u0005<\b\u0005&Ts\u0017>", "", "AsT=>0GR", "5d]2e(MS\u0007\u000ezi\u000bx\u0018+", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sQkKtr,YL", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "3ma<_3)O(\u0002", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "5d]2e(MS\u0007\u000ezi\u000bx\u0018+L{%{G\u000f", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final String displayNameForInternalString(String stepKind) {
            Intrinsics.checkParameterIsNotNull(stepKind, "stepKind");
            switch (stepKind.hashCode()) {
                case -2120945764:
                    return stepKind.equals("MATCH ENROLL FACE") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case -1185442822:
                    return stepKind.equals("MATCH FACIAL PERU NUEVA") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case -1155134665:
                    return stepKind.equals("ENVIO SMS OTP") ? "Registro teléfono" : "SIN NOMBRE";
                case -1055105962:
                    return stepKind.equals("VALIDAT OTP EMAIL") ? "Validar e-mail" : "SIN NOMBRE";
                case -811347919:
                    return stepKind.equals("ANALIZE DNI CO CE") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case -770555959:
                    return stepKind.equals("ANALIZAR DNI CE") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case -770555949:
                    return stepKind.equals("ANALIZAR DNI CO") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case -422345597:
                    return stepKind.equals("ENVIO ADRESS") ? "Registro dirección" : "SIN NOMBRE";
                case -302829419:
                    return stepKind.equals("ANALIZE DNI RDOM") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case -74011846:
                    return stepKind.equals("ENVIO EMAIL OTP") ? "Registro e-mail" : "SIN NOMBRE";
                case 140828185:
                    return stepKind.equals("ANALIZAR DNI") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 187393710:
                    return stepKind.equals("ANALIZE DNI CL") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 187393716:
                    return stepKind.equals("ANALIZE DNI CR") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 187393867:
                    return stepKind.equals("ANALIZE DNI HN") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 187394032:
                    return stepKind.equals("ANALIZE DNI MX") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 187394115:
                    return stepKind.equals("ANALIZE DNI PN") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 187394216:
                    return stepKind.equals("ANALIZE DNI SV") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 217532547:
                    return stepKind.equals("FINALIZAR ENROLAMIENTO") ? "Continue su proceso" : "SIN NOMBRE";
                case 349913495:
                    return stepKind.equals("MATCH FACE CR") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 349913646:
                    return stepKind.equals("MATCH FACE HN") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 349913894:
                    return stepKind.equals("MATCH FACE PN") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 349913995:
                    return stepKind.equals("MATCH FACE SV") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 593998781:
                    return stepKind.equals("MATCH FACIAL ARG") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 594001542:
                    return stepKind.equals("MATCH FACIAL DNI") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 634711082:
                    return stepKind.equals("MATCH FACIAL DNI BR") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 634711110:
                    return stepKind.equals("MATCH FACIAL DNI CO") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 644122790:
                    return stepKind.equals("ANALIZE DNI PERU NUEVA") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                case 799443320:
                    return stepKind.equals("VALIDAR OTP") ? "Validar teléfono" : "SIN NOMBRE";
                case 816754326:
                    return stepKind.equals("ANALIZE PASSPORT") ? "Capturar Pasaporte" : "SIN NOMBRE";
                case 1027977620:
                    return stepKind.equals("MATCH ENROLL FACE RDOM") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 1234586345:
                    return stepKind.equals("MATCH FACIAL RDOM") ? "Tomar foto de su rostro" : "SIN NOMBRE";
                case 1514236049:
                    return stepKind.equals("ANALIZE DNI ARG") ? "Tomar foto de su cédula" : "SIN NOMBRE";
                default:
                    return "SIN NOMBRE";
            }
        }

        public final ArrayList<IDNowStep> generateStepData(EnrollPath enrollPath) {
            Intrinsics.checkParameterIsNotNull(enrollPath, "enrollPath");
            ArrayList<IDNowStep> arrayList = new ArrayList<>();
            do {
                IDNowStep iDNowStep = new IDNowStep();
                iDNowStep.setError(false);
                iDNowStep.setSuccess(false);
                iDNowStep.setSelected(false);
                iDNowStep.setAction(enrollPath);
                iDNowStep.setInternalStepName(enrollPath.getType().getName());
                iDNowStep.setStepName(displayNameForInternalString(iDNowStep.getInternalStepName()));
                arrayList.add(iDNowStep);
                EnrollPath nextAction = null;
                try {
                    if (enrollPath.getNextAction().isNextActionInitialized()) {
                        nextAction = enrollPath.getNextAction();
                    }
                } catch (JSONException unused) {
                }
                enrollPath = nextAction;
            } while (enrollPath != null);
            return arrayList;
        }

        public final ArrayList<String> generateStepDataLabels(EnrollPath enrollPath) {
            Intrinsics.checkParameterIsNotNull(enrollPath, "enrollPath");
            ArrayList<String> arrayList = new ArrayList<>();
            do {
                arrayList.add(enrollPath.getType().getName());
                EnrollPath nextAction = null;
                try {
                    if (enrollPath.getNextAction().isNextActionInitialized()) {
                        nextAction = enrollPath.getNextAction();
                    }
                } catch (JSONException unused) {
                }
                enrollPath = nextAction;
            } while (enrollPath != null);
            return arrayList;
        }
    }
}
