package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r44ߚ\u007f\u0007|jA0RiP.XU2\u000f\u0002{<řc$\u007fHCU ~*\teNogtKb\u000bQ\u0015\u000e\u0016~p4Ikxe\u0012\u0015=JoM<UoCFhtDӌ(2(E\u0002\u0005\u000f!2H\u0016|\u0003Ca\f\u001a0FvPĥ+*5\u001a@\u0005v\u001f]^\u001embFNr\\H/;\u0003\u0018C^-e/\u000bO%F\u0003*\u001d\u0007o\"CLG7%%\u0002\t\u0017Tk?1E B\u0015x5.CU\u0004YFX.\u001a%-_\r\fxTaԇU`\u001a/k)i_`\u0014.v\t{%<2\u000f\u0016-N-;#~\b<6\u0005vaJh\u0002\rM\u0010\u000bo:/1\u00105;9IlacK\u0019|=*\n\u001d.1\b\u0007-kV\u001e`C!dya1\u007fFkM^\u000egI\u0006\u0004\u001fo\u0012.\u0012>_\u007f]\t 2\u00173F\u001cZ)5{\bNCuv\u001d`\u0017TyXN?0p.7X\f\u001c^Rt\u001dk~eг0\u0011[.\u00150\u0004\u001c#&bvJ!=\u0010|PxopLk\u0013=/\u0015:iry\u0018o9\r>EUq yR%%͖@b\u0013k'oY\u001aj`6\"JH\u0019\u0011\b\u007fRW$\u0013`B\u0002 B6I\u0019\u000b X\u0007,RY|7pjl\u001e\u0013l3R\u0018Ȑ(t\u0017\u0017\u0011}v\u0004w~O+\u000b`:-oRE\u001f,T0jL|Q\n\u000fw\u000e^\u007fLuR̡\u001auc\u0014`? Ma5C\u0012\u001d~A20.URxd_V*')\u007f\n\u0013IrFg6u\u00010n\u0002bO\u0003\u001dȔz^\u0001<H\"\u0006\bqJ\tG{T9\\NM\u0001\fq<|;\r\t-(=\u0001\u001e-\r9;Z?\u001dD}$3#mui\u001e;\nf\u001d4\re29s\u001a}vi]`PΒMY\rXbAr\u0011RLx\u0013 B7ͩ\u001d7V]|p\u0005;]\u000f=\b~\u0007Z\u0018\u0080Z[H00W:ʝo.\u0002C\u0016\u0014\rD5\u0015[\\\u007fm\u001cNl\u000fX\u0019\"\u000b*<~\u0018*Y8Xma73\u0016w&:Y;\u0011#L\r2;D<6)SXw\u0012(z.So\u0013%@Zsic\u001eZ\u0007{nJ\u001b_sq1.\u000f\u0013'3L\u000e\u00985\u0005{f\u001d@ql\u0019SK5Kp]:~'AC\u0003uaϐXI)S\u001b[I094K7,\u0004o:EH\u0001+\u00020\u001bg^Ac\u0005pv\u000b\u0004q\u0015i?\"t\u0010f\"W\u0002+\u0003\u0014;\u0018P#\u0019}u6guZ\\:OCH\u0004GH7H$|\u0012IaAN;;\u0001ajB*B\\\u001cK\fK8 U\u0007%'bV\u001c\u000f\"]I=\\v^p\u0010M+PN\u0011^N\u00038\".6K\u0016\u0016{\u0010!%qk&.p+92\u001eBy}?\u001e,rq6m\u000b1iw[B~;\u00185\tUP^\u0019^YH\u001ak \u0007\u0014F\u0019],-~ bW\u0013\u0016h1\u0001y\u0018s\rY2\u001c0g0>n6}M|<\trZ6^SV{S+\u001d%\u000bP\"&^\u0019+\u0015x\u001ag,|-U\u000f\u0015!s^rLq_;'_s\rumM\t\u000eY4kIRm\u001eg8\u0011n68)\u0003he;\u0005re\u0017>\u0018gZyvXKg?YRz\u0015\u00074\u001a]8p\u0015\\\u0015\u001c`GZf-\u0005jӭ ;W\u0004\n'\u001fR-84r7\u001dC,iSS-G\u0011I0MLIkh\u0001gv1|'oId\u0017?3\u0004}LU\u00192iXNec\u0005\u001c(:ޜ9E$M\u001e{\u000e^7$R[&'\u000e\u001cIHXl\rDdKo\u0004T7frR{_l'\u0001:0wq\fd\nndE\t/1Dl)szڄDހ́x\nް\u0011G\u001a\u0012\u001dayN%\u0004([\u0002B;I!S?^m<Ay2?ߴe<\u0002ÙX[0';4%ux\u000e\u0006Q\u000e.\u000fܷ\u000fƒ\b}9ׯx\u0002fA&L\u001c\tT\\tx{_9ޒBǦ(d6˷$\r\f=<mg\u0014\frx\u0015A6\u001eؔCۊ\u0016\\\u0004״5\u0013aN\u0014O8|Ujmq\u0007i\u0010ߩ\rǮN^=ƶt\u0007[LY\u0012{'\u000e\u0019C.u\u0003\u0015ϭ,Ө\n\u0014MĹ`\u0012J'RU><>>h~\tP4Ӡ\u001e؞AU\u001d֧O>pCsd?8\u000eǝpדY#5ҼR\u001e\u001eE1\u001f\u001b c9`)\u0004\u000fA>*\u000e\u000bNʳ\u0001sQʝ\u001bcPP=(\u0010AO{\u0005V\u0014]oٌAך\u0010&/Ձ\u001e\u0015*\u0014u8: 0\u0012\u001bLdt\u007fڰMá\u0015lJب'|z?<1\tg\u0014F\u001e\u0011\u0011\u001f\fĤaޱ04xĤ_Qp08\u0010@w\u0003xeGAtGOқu\u0017kٔw\u0016t\u0007j\u000f\u000f)eBX\u00130\u001dsöcҨL/8ļmes\"\u0002~1 g>\u00040\u0013\u0005ܛjjF͔V>N%' ߰}$YDh(hsNƈ,\u0011k\u0557+\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X6\u001bj", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "<`\\2", "", "BnG&M", "", "=dc3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "3nc3", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aL\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqLaY~", ">qX:T9BS'", "EgXAX\u0017HW\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005]7\"$hLC\u000bl;$", ";h]", "", ";`g", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0006\u0015^\u001dN\u0016\u0017\tbPyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchE\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"F\u000e\u0005\u001f1L", "4t]0g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005ZA\u001a\u001evb9\u0014N([r/G[N9j(", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0003\u001fV\u0017\\,\r\u0012D=1jL7.\b9WW~Y", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0006\u0015^\u001dN\u0016\u0017\tbPyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)wQHOo8o\b]\u001d&)G \u001d\u007f\u001a\u001bu;*\u0017w[\u0011\u0002R\u0007u=\u000b\n", "7c", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0006\u0015^\u001dN\u0016\u0017\tbPyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)wQHOo8o\b]\u001d&)G \u001d\u007f\u001a\u001bu;*\u0017w[\u0011\u0002R\u0007u=+\\k", "5`\\:T", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!_Z\b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0006\u0015^\u001dN\u0016\u0017\tbPyM\b(", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0006\u0015^\u001dN\u0016\u0017\tbPyM%\u0018\u0003K\u001d", "1n[<e\u001aIO\u0017~", "BqP;f-H`!", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5! \u0012>W\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q*S\tEu\u000f\u0017\u0012\f54bEZ\u001fGd\u001fyJ8>\nJ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005J>.\u0012oa\u001a\u0017l*]z1P\"", "BqP;f->`\u0004z\bZ4|\u0018/r\u000e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q!g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005quL\u0001.QY\\7XPr\u0007\u0006\u0015^\u001dN\u0016\u0017\tbPyd%\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^wN%sI]]\b\u0011?Oi4q\u001aj\u0019Z:\u0004\u0003\u001e\u0002\u0016\"h1>\u0013yb\u0015|[ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA\u0014?T\u007f.x+\u0012}(@k\u000fXu#:\\x^\u000bfQ$-6\u001d#HIryvGcI\u007fH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+o\u0005\u0001T\u0013:Tr\u0019%TH@e\u0001\u001f\u0016\u0015/icI\r\na|#~E\"l{~\u0010b \u001c=\u0016JgdLmP", "5dc\u0012b;?", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "3nc39<GQ", "5dc\u0012b;?4)\bx\u001d<\u0001\u00031r{3~D~%\u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}|\u001fx^@\u0007D<Wt6KVW\u0002", "3nc3B9BU", "5dc\u0012b;?=&\u0003|\u001d<\u0001\u00031r{3~D~%\u0011To\u0015<r35", "7me2e:>B&z\u0004l-\u0007\u00167", "5dc\u0016a=>`'~ik(\u0006\u00170o\r0:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "u(J\u0013", "7rB?Z)", "", "u(I", "7rF6W, O!\u000f\n", "5dc\u001cX;?", "=dc39<GQ", "5dc\u001cX;?4)\bx\u001d<\u0001\u00031r{3~D~%\u0011To\u0015<r35", "=dc3B9BU", "5dc\u001cX;?=&\u0003|\u001d<\u0001\u00031r{3~D~%\u0011To\u0015<r35", "5dc\u001de0FO&\u0003zlj\r\r)g\r$\u0007C\u0005\u0015%A|\u000eCv!CY", "5dc!e(Ga\u001a~\bI(\n\u00057e\u000f(\tN", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}\r\"djG\bc99r4CTN;\\_\u0001\u0013", "5dc!e(Ga\u001a\t\bfj\r\r)g\r$\u0007C\u0005\u0015%A|\u000eCv!CY", "5dc$[0MS\u0004\t~g;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}\u0010\u0018lp9qm0W\u0006|", "3pd._:", "=sW2e", "", "4q^:?0GS\u0015\f", "@", "5", AdkSettings.PLATFORM_TYPE_MOBILE, "D", "4q^:K@S", "5dc\u0016a=>`'~ik(\u0006\u00170o\r0", "5dc\u001aT?/O \u000fz", "1n\\=b5>\\(", "5dc\u001a\\5/O \u000fz", "5dc\u001de0FO&\u0003zl", "5dc!e(Ga\u001a\t\bf", "6`b566=S", "Bn;6a,:`", "BnGF", "", "D/", "D0", "D1", "BnGF\u0017<BM\u001b\fvi/\u0001\u0007=_\r(\u0003@|%\u0017", "BnGFm", "BnI", "BnIph08U&z\u0006a0z\u0017)r\u007f/{<\u000f\u0017", "Fxi.G6\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "F", "G", "H", RemoteSettings.FORWARD_SLASH_STRING, "Fxi.G6\u001c] \t\b&\u0011\u0004q3L\u000e*:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oA", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Rgb extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d2) {
            return Rgb.DoubleIdentity$lambda$12(d2);
        }
    };
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    public static final double DoubleIdentity$lambda$12(double d2) {
        return d2;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, TransferParameters transferParameters, int i2) {
        super(str, ColorModel.Companion.m4592getRgbxdoWZVw(), i2, null);
        this.whitePoint = whitePoint;
        this.min = f2;
        this.max = f3;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return invoke(d2.doubleValue());
            }

            public final Double invoke(double d2) {
                return Double.valueOf(RangesKt.coerceIn(this.this$0.getOetfOrig$ui_graphics_release().invoke(d2), this.this$0.min, this.this$0.max));
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb.oetfFunc$lambda$0(this.f$0, d2);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return invoke(d2.doubleValue());
            }

            public final Double invoke(double d2) {
                return Double.valueOf(this.this$0.getEotfOrig$ui_graphics_release().invoke(RangesKt.coerceIn(d2, this.this$0.min, this.this$0.max)));
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb.eotfFunc$lambda$1(this.f$0, d2);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f3 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 != null) {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        } else {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f2, f3);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f2, f3, i2);
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    public static final double oetfFunc$lambda$0(Rgb rgb, double d2) {
        return RangesKt.coerceIn(rgb.oetfOrig.invoke(d2), rgb.min, rgb.max);
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    public static final double eotfFunc$lambda$1(Rgb rgb, double d2) {
        return rgb.eotfOrig.invoke(RangesKt.coerceIn(d2, rgb.min, rgb.max));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function12) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$2(function1, d2);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$3(function12, d2);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public static final double _init_$lambda$2(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    public static final double _init_$lambda$3(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function12, float f2, float f3) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda10
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$4(function1, d2);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda11
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$5(function12, d2);
            }
        }, f2, f3, null, -1);
    }

    public static final double _init_$lambda$4(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    public static final double _init_$lambda$5(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i2) {
        this(str, fArr, whitePoint, null, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda12
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$6(transferParameters, d2);
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$7(transferParameters, d2);
            }
        }, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda2
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$8(transferParameters, d2);
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda3
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return Rgb._init_$lambda$9(transferParameters, d2);
            }
        }, 0.0f, 1.0f, transferParameters, i2);
    }

    public static final double _init_$lambda$6(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.rcpResponse(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    public static final double _init_$lambda$7(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.rcpResponse(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    public static final double _init_$lambda$8(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.response(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    public static final double _init_$lambda$9(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.response(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, double d2) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d2, 0.0f, 1.0f, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d2) {
        this(str, fArr, whitePoint, d2, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d2, float f2, float f3, int i2) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d2 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d3) {
                    return Rgb._init_$lambda$10(d2, d3);
                }
            };
        }
        if (d2 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda9
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d3) {
                    return Rgb._init_$lambda$11(d2, d3);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction, doubleFunction2, f2, f3, new TransferParameters(d2, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i2);
    }

    public static final double _init_$lambda$10(double d2, double d3) {
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return Math.pow(d3, 1.0d / d2);
    }

    public static final double _init_$lambda$11(double d2, double d3) {
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return Math.pow(d3, d2);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }

    public final float[] getPrimaries(float[] fArr) {
        return ArraysKt.copyInto$default(this.primaries, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] fArr) {
        return ArraysKt.copyInto$default(this.transform, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getInverseTransform(float[] fArr) {
        return ArraysKt.copyInto$default(this.inverseTransform, fArr, 0, 0, 0, 14, (Object) null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return this.max;
    }

    public final float[] toLinear(float f2, float f3, float f4) {
        return toLinear(new float[]{f2, f3, f4});
    }

    public final float[] toLinear(float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final float[] fromLinear(float f2, float f3, float f4) {
        return fromLinear(new float[]{f2, f3, f4});
    }

    public final float[] fromLinear(float[] fArr) {
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f2, float f3, float f4) {
        float fInvoke = (float) this.eotfFunc.invoke(f2);
        float fInvoke2 = (float) this.eotfFunc.invoke(f3);
        float fInvoke3 = (float) this.eotfFunc.invoke(f4);
        float[] fArr = this.transform;
        float f5 = (fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3);
        float f6 = (fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3);
        long jFloatToRawIntBits = Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
        long j2 = jFloatToRawIntBits << 32;
        long j3 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return (j2 + j3) - (j2 & j3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f2, float f3, float f4) {
        float fInvoke = (float) this.eotfFunc.invoke(f2);
        float fInvoke2 = (float) this.eotfFunc.invoke(f3);
        float fInvoke3 = (float) this.eotfFunc.invoke(f4);
        float[] fArr = this.transform;
        return (fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4595xyzaToColorJlNiLsg$ui_graphics_release(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4)), (float) this.oetfFunc.invoke((fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4)), (float) this.oetfFunc.invoke((fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4)), f5, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f2 = this.min;
        int iFloatToIntBits = (iHashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f3 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    /* JADX INFO: compiled from: Rgb.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0017\u007fјnjGBL͜P.`\\2şs{B(c$wGCU0}*\tU\\og|Pb\u000bI\u0010\fǞy\u0001ߚyU'\\R\u00148BņC3[o\u0006GnwN\u0005N6R<\b\n\u0019\u001aXNVvCaY\u0013*0nxjV\u001bV\u001d\u001a@\u0010n$\u000f)tg|8xpkFG#1k\tNor>\ne\rtZW\u0011\u0005o6+n={ՖȏW\u0003\ra$M\u0011O\n=3yW+9W\fWd^F\u0014]A]\u001furTb5Un\u0011?+}i{T\u001c;\u0010z*\u001e\u0003\u0004V\u001c5\\F-Hn8\u0012A\n\u000bSnV2bP\u0016\u0013ad\u001dk\u007f{QG2~Q\u0010?IRE\u0014\u001d\rL'1r/tl\u000e\u000f\u0019KX\u0006kIQnAxR\u0018tUm2t)\u0002rB>c\u0018/*\u0019^\u001b3<s9Q'\u001c\u0006VW\u007fv3q\u0019Wwo`@PpF;8'$Zrf5o^sp,?QLX\u0015\u001e \u0013N`(@/F(N}\u000b0j\u0016{\u0018HGfea\u001fo\u001c\\Q^a;\u0002g\u001e\u0001jvBClf\u0013x~B\u0002\u0010!\\p0@l\u0003\u0010&\u0002tR\u001a\u0018J? \"z,\u0002%j\u0016`\u0003LD\u0018Ҕ\u000bރ^h\u0018зՇ7I"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X6\u001bSFkA\u0012_5R\u00010\u001d", "", "u(E", "\u0012nd/_,\"R\u0019\b\nb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005J>.\u0012oa\u001a\u0017l*]z1P\"", "/qT.", "", ">qX:T9BS'", "", "1n\\=T9>", "", ">nX;g", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1n\\=h;>>&\u0003\u0003Z9\u0001\t=", "BnG&M", "1n\\=h;>>&\u0003\u0003Z9\u0001\t=$\u0010,uB\u000e\u0013\"Js\fJp25`}\u001cEm", "1n\\=h;>E\u001c\u0003\n^\u0017\u0007\r8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005]7\"$hLC\u000bl;$", "1n\\=h;>F\rsbZ;\n\rB", "EgXAX\u0017HW\"\u000e", "1n]AT0Ga", ">0", ">1", "1q^@f", "/w", "/x", "0w", "0x", "7rB?Z)", "\u001dDC\u0013", "\u0013NC\u0013", ";h]", ";`g", "7c", "", "7rF6W, O!\u000f\n", "Fx??\\4:`\u001d~\t", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float cross(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private Companion() {
        }

        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, int i2) {
            if (i2 == 0) {
                return true;
            }
            if (!ColorSpaceKt.compare(fArr, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f2 != 0.0f || f3 != 1.0f) {
                return false;
            }
            Rgb srgb = ColorSpaces.INSTANCE.getSrgb();
            for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                if (!compare(d2, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d2, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        private final boolean compare(double d2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d2) - doubleFunction2.invoke(d2)) <= 0.001d;
        }

        public final boolean isWideGamut(float[] fArr, float f2, float f3) {
            return (area(fArr) / area(ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release())) || (f2 < 0.0f && f3 > 1.0f);
        }

        private final float area(float[] fArr) {
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float f8 = ((((((f2 * f5) + (f3 * f6)) + (f4 * f7)) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
            return f8 < 0.0f ? -f8 : f8;
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f2 = fArr[0];
            float f3 = fArr2[0];
            float f4 = fArr[1];
            float f5 = fArr2[1];
            float f6 = fArr[2] - fArr2[2];
            float f7 = fArr[3] - fArr2[3];
            float f8 = fArr[4];
            float f9 = fArr2[4];
            float f10 = fArr[5];
            float f11 = fArr2[5];
            float[] fArr3 = {f2 - f3, f4 - f5, f6, f7, f8 - f9, f10 - f11};
            return cross(fArr3[0], fArr3[1], f3 - f9, f5 - f11) >= 0.0f && cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] fArr) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f2 = fArrMul3x3Float3[0];
            float f3 = fArrMul3x3Float3[1];
            float f4 = f2 + f3 + fArrMul3x3Float3[2];
            float f5 = fArrMul3x3Float32[0];
            float f6 = fArrMul3x3Float32[1];
            float f7 = f5 + f6 + fArrMul3x3Float32[2];
            float f8 = fArrMul3x3Float33[0];
            float f9 = fArrMul3x3Float33[1];
            float f10 = f8 + f9 + fArrMul3x3Float33[2];
            return new float[]{f2 / f4, f3 / f4, f5 / f7, f6 / f7, f8 / f10, f9 / f10};
        }

        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f2 = fArrMul3x3Float3[0] + fArrMul3x3Float3[1] + fArrMul3x3Float3[2];
            return new WhitePoint(fArrMul3x3Float3[0] / f2, fArrMul3x3Float3[1] / f2);
        }

        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = f2 + f3 + fArr[2];
                fArr2[0] = f2 / f4;
                fArr2[1] = f3 / f4;
                float f5 = fArr[3];
                float f6 = fArr[4];
                float f7 = f5 + f6 + fArr[5];
                fArr2[2] = f5 / f7;
                fArr2[3] = f6 / f7;
                float f8 = fArr[6];
                float f9 = fArr[7];
                float f10 = f8 + f9 + fArr[8];
                fArr2[4] = f8 / f10;
                fArr2[5] = f9 / f10;
            } else {
                ArraysKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float x2 = whitePoint.getX();
            float y2 = whitePoint.getY();
            float f8 = 1;
            float f9 = (f8 - f2) / f3;
            float f10 = (f8 - f4) / f5;
            float f11 = (f8 - f6) / f7;
            float f12 = (f8 - x2) / y2;
            float f13 = f2 / f3;
            float f14 = (f4 / f5) - f13;
            float f15 = (x2 / y2) - f13;
            float f16 = f10 - f9;
            float f17 = (f6 / f7) - f13;
            float f18 = (((f12 - f9) * f14) - (f15 * f16)) / (((f11 - f9) * f14) - (f16 * f17));
            float f19 = (f15 - (f17 * f18)) / f14;
            float f20 = (1.0f - f19) - f18;
            float f21 = f20 / f3;
            float f22 = f19 / f5;
            float f23 = f18 / f7;
            return new float[]{f21 * f2, f20, f21 * ((1.0f - f2) - f3), f22 * f4, f19, f22 * ((1.0f - f4) - f5), f23 * f6, f18, f23 * ((1.0f - f6) - f7)};
        }
    }
}
