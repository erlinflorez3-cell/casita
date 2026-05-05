package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,l\bDJc|\u0004O\f8\u000b4V\u0007\":\u001e\u007f\u0007lsA0ZeP.`^2\u000fq{<$q$yCQU\"Ԃ*\teNog\u0005JbŏK\u000f\u001c\u0016\u0001̓DWc\u001du\u0014%1p\u0015g5cnk_'ҚN\u000f.Y:8(+)\u001aXmV͌\u0013KY4*0n\u001abR;w\u001d\" 1V /J\u0005g|chxkŽG#1h\u0019úyۢ4|Uεf`5\r\u000faL*\u0017ʽ\bչ)S\u000bޗrgM\u0004Wqk\u0007?ѪyȅMs_̬x\f\"\u0018CO;_I̩/ԇU`\u0014ʬK[qOh\u000eVvQԋ_ʀ\b\u000e\u000eΩh:;\u001f~\b<5KɄ&ĖT\u0002fۍ \u0007o</%.5\u0002ݐmƻUaCϊnC\n\f%\u001eQ\u007fEĒ.ڍ\u0012`\u001dÑt\u0004_9i@kG%˦,ǀq\u0004xç\"6\u00129_\u007f]zgчiÉ;[A\u05faAw\u0010R\\g%\u00047è&ׂVHH̎\u000f\"E5!\f\tC;ʐ>ÏXX4Ҋm(b\u0013\u0016\bA\"3ɿ\u000fƼ)\u0010Vи\tuxZu\nS.=ƀ,ˇo\u000e_ު~?C_{\u0010\u0010QMܠ\u0012םf\u0005`٨b_\u001ait(P1\u001fНbȑ\u007fDVۼ3>M\u000244Z3o¥gȠ\u0007\u001eJˆ\u001d\u0015mk\u0001\u0010-S\nɷUȐ(t\u0011ɖph~\u0002\u007fxw+SʣtέEQ=ӧFa0{L|Q\u0006U͡RěkLOƂ\r\"\u0004i\u0014 D\u001c\u0010֚\u0002ˮ\u0017\u000f\u0007ǻR\u000e;Zdr\u0014S$ȿyϸ\u0001y\u0017\u0090\t:u\u001e\u0003pZ_A\u07bd\"ݚ\u001b\"~ܥ\u0013/\u0016{\u0018y\u0010HQõ6ӝ\u000f[Fδ\u0013\u000fgTf8+\u001euǊw˽s\"\u0005ކMO57.wB.k˘0ɳs.\u0002ʬ/2\u0003\u0001\u001c,\u0012\u0018F̨$Є6;@Ծy\u000bL><l1A\u001f۶JڇF\t<ؿSTO\u0002\tVfOaɃP֨\u000b,\u0015ߞvgH1\b}b-6͋Fʸ\u0002\u0014fƹE\u001d[r\u007fm\u001cM3֨\u001d؝\u000e\u000b\u0004ς\u000f\u001e*]8V\u0006d_ݸX֯\u001c6Iݥ\u0003\u0011J*<4Z;^Մ\u0016Ұm\u0006\u0018ÿ Rm1/2pr\u0012ٜ`֭|\\^ޠ%lS\u00049*/}eɿpא91\rևn\\=\u0012R\u0001\u0002L9\u001b\u0019~ǔjU"}, d2 = {"\u0010@2\u0018:\u0019(C\u0002]tB\u000b", "", "\u0010@B\u0012?\u0010'3\u0013l]B\rk\u0003\u0013D", "\u0010@B\u0012?\u0010'3\u0013l]B\rk\u0003\u001dIt\b", "", "\u0010XC\u0012R\u001a\"Hx", "\u0011N;\u001cE&\"2", "\u0011N;\u001cE&,7\u000e^", "\u0014K>\u000eG&,7\u000e^", "\u0014N=!R\r\u001e/\bng>&jh\u001eTc\u0011].zzu", "\u0014N=!R\u001a\"Hxx^=", "\u0014N=!R\u001a-G\u007f^tB\u000b", "\u0014N=!R\u001a-G\u007f^tB\u001bXo\u0013C", "\u0014N=!R\u001a-G\u007f^tG\u0016ip\u000bL", "\u0014N=!R\u001a-G\u007f^tL\u0010qh", "\u0014N=!R\u001a2<\baZL\u0010j\u0003\u000bLf", "\u0014N=!R\u001a2<\baZL\u0010j\u0003\u0013D", "\u0014N=!R\u001a2<\baZL\u0010j\u0003\u0018Oh\b", "\u0014N=!R\u001a2<\baZL\u0010j\u0003\u001dIt\b", "\u0014N=!R\u001a2<\baZL\u0010j\u0003\u001dTs\u000f[", "\u0014N=!R\u001a2<\baZL\u0010j\u0003!Ec\n^/", "\u0014N=!R\u001e\u001e7zaiX\u0010[", "\u0014N=!R\u001e\u001e7zaiX\u001a`}\u000f", "\u0017MC,F\u001033", "\u001aDC!8\u00198A\u0004ZXB\u0015^\u0003\u0013D", "\u001aN=\u0014R\u001a\"Hx", "\u001eK0\u0016A&-3\fmtE\bYh\u0016", "", "!G0\u0011B\u001e87w", "!G0\u0011B\u001e8A|sZ", "\"DG!R\u000b\u001e1\u0003kVM\u0010fq)I^", "\"DG!R\u000b\u001e1\u0003kVM\u0010fq)Sc\u001d[", "\"DG!R\u000e\u001e=\u0001^iK\u0010Z\u0003\u001eR[\u0011i!j\u0004~ASl", "\"DG!R\u000e\u001e=\u0001^iK\u0010Z\u0003\u001eR[\u0011i!j\u0004~A]q1V", "\"DG!R\u001c'7\bxhB!\\", "#M8!R\u001b2>xxZF", "#M8!R\u001b2>xxhI", "#M8!R\u001b2>xxjG\u001agh\rI`\f[\u001f", "1n]CX9MB#Z\u0004g6\f\u0005>e~\u0016\u000bM\u0005 \u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "", "1n]CX9MB#\\}Z9j\t;u\u007f1y@", "Bn29\\7\u001e\\(\f\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u0017v%;a\u0019", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK_\u0013&CE", "Bn29\\7&S(zyZ;x", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u001fm%*L?Jg\n", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK_\u0017%E|\u0012G\u0006)?bS", "\u001c`c6i,\u001cZ\u001d\nwh(\n\b", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK}!\u0013Tnu8\u007f!7Y\u000bu", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidClipboardManager_androidKt {
    private static final byte BACKGROUND_ID = 10;
    private static final byte BASELINE_SHIFT_ID = 8;
    private static final int BASELINE_SHIFT_SIZE = 4;
    private static final int BYTE_SIZE = 1;
    private static final byte COLOR_ID = 1;
    private static final int COLOR_SIZE = 8;
    private static final int FLOAT_SIZE = 4;
    private static final byte FONT_FEATURE_SETTINGS_ID = 6;
    private static final byte FONT_SIZE_ID = 2;
    private static final byte FONT_STYLE_ID = 4;
    private static final byte FONT_STYLE_ITALIC = 1;
    private static final byte FONT_STYLE_NORMAL = 0;
    private static final int FONT_STYLE_SIZE = 1;
    private static final byte FONT_SYNTHESIS_ALL = 1;
    private static final byte FONT_SYNTHESIS_ID = 5;
    private static final byte FONT_SYNTHESIS_NONE = 0;
    private static final int FONT_SYNTHESIS_SIZE = 1;
    private static final byte FONT_SYNTHESIS_STYLE = 3;
    private static final byte FONT_SYNTHESIS_WEIGHT = 2;
    private static final byte FONT_WEIGHT_ID = 3;
    private static final int FONT_WEIGHT_SIZE = 4;
    private static final int INT_SIZE = 4;
    private static final byte LETTER_SPACING_ID = 7;
    private static final int LONG_SIZE = 8;
    private static final String PLAIN_TEXT_LABEL = "plain text";
    private static final byte SHADOW_ID = 12;
    private static final int SHADOW_SIZE = 20;
    private static final byte TEXT_DECORATION_ID = 11;
    private static final int TEXT_DECORATION_SIZE = 4;
    private static final byte TEXT_GEOMETRIC_TRANSFORM_ID = 9;
    private static final int TEXT_GEOMETRIC_TRANSFORM_SIZE = 8;
    private static final int TEXT_UNIT_SIZE = 5;
    private static final byte UNIT_TYPE_EM = 2;
    private static final byte UNIT_TYPE_SP = 1;
    private static final byte UNIT_TYPE_UNSPECIFIED = 0;

    public static final ClipEntry toClipEntry(ClipData clipData) {
        return new ClipEntry(clipData);
    }

    public static final ClipMetadata toClipMetadata(ClipDescription clipDescription) {
        return new ClipMetadata(clipDescription);
    }

    public static final AnnotatedString convertToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i2 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int lastIndex = ArraysKt.getLastIndex(annotationArr);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i2];
                if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence convertToCharSequence(AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        EncodeHelper encodeHelper = new EncodeHelper();
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i2);
            SpanStyle spanStyleComponent1 = range.component1();
            int iComponent2 = range.component2();
            int iComponent3 = range.component3();
            encodeHelper.reset();
            encodeHelper.encode(spanStyleComponent1);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), iComponent2, iComponent3, 33);
        }
        return spannableString;
    }
}
