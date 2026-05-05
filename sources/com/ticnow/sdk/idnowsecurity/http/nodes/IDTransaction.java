package com.ticnow.sdk.idnowsecurity.http.nodes;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u0006\u0010nj?3LeV2ZS09\u0002ڔd$\n#2FтY\u001a\f\"Yg\\h\u007fnx\\aÃ\u001bو\u001a\u0005rߚaW~` \u0013RDuDAS@UGg\r63(\tĹDѩ\t\r\"ݒ`\u0012|\u0004QU,\u00146K~F#%[\u00122\u00124LvҼ*֔kZ>ԟ\u0005_@>1\u0013\nDT8mBMe\u001bYl';\u00058ӣ7Ë;A\u001dǬk\u0005\rfiO#AwR\u0013zw?9_\fWdfVϳ!ۣS\u0019eö>^\u000bhn\u001cG-U{Yb^@\u0006\u0014\u0014\rj\fd\u03813ρ29\"Ǒ \u00109\u000f\u0001]`R\byP\fKyD3=\u007fa-\u0010ӜrЂeG!\u05cbO}\u000b*,'!p'yb\u00141-)s\u0010Q_S\u0017ׇTݳ\u000eeEЧ\u001crh\"8\bPI\u0006P\n\u0017~/3Ys9Q#BȼTזk\u0003\r\u009b\u0001UouVDBp\u001c[8\u000f\\rR\n\u001dk~V/\u0093\u001dܖ `\u000fâ \u0015&\u0003\u0006@A'\u0016u]n:\u0003[\u0006\"%]h\u000eձz«\u0012cAӔK7W\r\u001eerx\u001aiJhUptmk\f\t^~ζ>ʮn\u001c\u007fӻ\\P\u0012?@C\u0012\u001e:Y?\u001f--V16Bo~_ݧfӳ\u0014\u000b\\՜<\u0005oS\u0003\r!Rb!}mIa:.x\"[C(ڈ%łY.pؔ\u0015%\r1\u0002\u0004giRzZrf\u000ec08\u0016H;(ȄIт\u0013\u000b1Ʌ\u001a/K\u0002\u0001iqO\u0018]\t\u0003J'I Fg6lGݡlʧN[\\ϟ:xd+1\f\u0005\u0002\u007f\u001bT\u0001ěg\u000f"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013\r\"djG\u0003a;R\u00010\u001d", "", "u(E", "/tc5<+", "", "5dc\u000eh;A7\u0018", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eh;A7\u0018", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2`c.43E]+\rik(\u0006\u0017+c\u000f,\u0006I", "", "5dc\u0011T;:/ \u0006\u0005p:k\u0016+n\u000e$yO\u0005! ", "u(I", "Adc\u0011T;:/ \u0006\u0005p:k\u0016+n\u000e$yO\u0005! ", "uY\u0018#", "2`c285=", "", "5dc\u0011T;>3\"}", "u(3", "Adc\u0011T;>3\"}", "uC\u0018#", "2`c2<5Bb", "5dc\u0011T;>7\"\u0003\n", "Adc\u0011T;>7\"\u0003\n", "4dR5T", "5dc\u0013X*AO", "Adc\u0013X*AO", "4q^:5(<Y\u001b\f\u0005n5{", "5dc\u0013e6F0\u0015|\u0001`9\u0007\u00198d", "Adc\u0013e6F0\u0015|\u0001`9\u0007\u00198d", ";db@T.>C\tbY", "5dc\u001aX:LO\u001b~jN\u0010[", "Adc\u001aX:LO\u001b~jN\u0010[", "<dgA4*MW#\b", "5dc\u001bX?M/\u0017\u000e~h5", "Adc\u001bX?M/\u0017\u000e~h5", "@hR5C(RZ#zy", "5dc\u001f\\*A>\u0015\u0013\u0002h({", "Adc\u001f\\*A>\u0015\u0013\u0002h({", "AdRBe,\u001dO(z", "5dc X*N`\u0019]vm(", "Adc X*N`\u0019]vm(", "AsPAX", "5dc g(MS", "Adc g(MS", "BqP;f(<Q\u001d\t\u0004", "5dc!e(Ga\u0015|xb6\u0006", "Adc!e(Ga\u0015|xb6\u0006", "Bs[\u001af.", "5dc!g3&a\u001b", "Adc!g3&a\u001b", "Bx_24<MV", "5dc!l7>/)\u000e}", "Adc!l7>/)\u000e}", "Crd.e0H", "5dc\"f<:`\u001d\t", "Adc\"f<:`\u001d\t", "CtX1G9Q", "5dc\"h0=B&\u0012", "Adc\"h0=B&\u0012", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDTransaction {
    private boolean dataAllowsTransaction;
    private double dateEnd;
    private double dateInit;
    private double fecha;
    private boolean fromBackground;
    private String authId = "";
    private String ttlMsg = "";
    private String typeAuth = "";
    private String uuidTrx = "";
    private String transaccion = "";
    private String usuario = "";
    private String nextAction = "";
    private String state = "";
    private String messageUUID = "";
    private String secureData = "";
    private String richPayload = "";

    public final String getAuthId() {
        return this.authId;
    }

    public final boolean getDataAllowsTransaction() {
        return this.dataAllowsTransaction;
    }

    public final double getDateEnd() {
        return this.dateEnd;
    }

    public final double getDateInit() {
        return this.dateInit;
    }

    public final double getFecha() {
        return this.fecha;
    }

    public final boolean getFromBackground() {
        return this.fromBackground;
    }

    public final String getMessageUUID() {
        return this.messageUUID;
    }

    public final String getNextAction() {
        return this.nextAction;
    }

    public final String getRichPayload() {
        return this.richPayload;
    }

    public final String getSecureData() {
        return this.secureData;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTransaccion() {
        return this.transaccion;
    }

    public final String getTtlMsg() {
        return this.ttlMsg;
    }

    public final String getTypeAuth() {
        return this.typeAuth;
    }

    public final String getUsuario() {
        return this.usuario;
    }

    public final String getUuidTrx() {
        return this.uuidTrx;
    }

    public final void setAuthId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.authId = str;
    }

    public final void setDataAllowsTransaction(boolean z2) {
        this.dataAllowsTransaction = z2;
    }

    public final void setDateEnd(double d2) {
        this.dateEnd = d2;
    }

    public final void setDateInit(double d2) {
        this.dateInit = d2;
    }

    public final void setFecha(double d2) {
        this.fecha = d2;
    }

    public final void setFromBackground(boolean z2) {
        this.fromBackground = z2;
    }

    public final void setMessageUUID(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.messageUUID = str;
    }

    public final void setNextAction(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.nextAction = str;
    }

    public final void setRichPayload(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.richPayload = str;
    }

    public final void setSecureData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.secureData = str;
    }

    public final void setState(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.state = str;
    }

    public final void setTransaccion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.transaccion = str;
    }

    public final void setTtlMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ttlMsg = str;
    }

    public final void setTypeAuth(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.typeAuth = str;
    }

    public final void setUsuario(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.usuario = str;
    }

    public final void setUuidTrx(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuidTrx = str;
    }
}
