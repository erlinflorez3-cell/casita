package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TransformedTextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яğ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[*\u0015k\u00044:[,qY;]ڼ\u0006\"\u001fOVgmpRZ!C\u0017\u0006\u001c\u0003r,WU\u0001]\u0018\u000f:B}>;ݹw=O`|6\u000b\":\"F\u0003\rЏ\"*^\u0010~zYK\u0014\u0012F@x:X\u000eU\u0005(\u0018\u000e>&\u0001&\\}N>ԟt]P/+\u0003oQV'm;\u0005M\u0013G\\'#vi\u001e1I?5#1[\u0003\rUa>\u0019ӊ\u0010\u00195hU&cIO4v\b\u0010\u0018#+g\r\fs6d\u000bQn\u000e?-ebyS\u001e0}z\n\u0011T\u0006$\u0005UM>5 f\u0016\u0014Kv\tRnWؿbB\u000e\u0003*:%C\u00183YXcj_\u0002S\u0019|VD\u0019\u001b?;\u0001\u001dC\fX\u001c\u0004-\u001b\u0003\u001c\u0018Ŀ\u0010͘AH\\/\"A{*\tb0ILZU'G{?MG+=[GK9k0qt|\u0005/xyckbHnN~\u0018G*7+\to\u0081\tkV\u0002\u001f\u0093\u0017\u0016-b5\u0016\bAI\r}JP=\u0012dN\u0017h1ܫ]R+=\u0017OY\u001d\u001dTk\u0002|Agic>\u0001\u0003z\"rTb3\r\u0017FaAr\\VXŮGКݻ{}J\u0006\u001aKzU\u007fUL,_O\r\u0019V=6Bo3ɺ^ʳӳ\u0014\u0001Zn2?2=\u0003B\u0019P\u000b' k\u0007\u0007D|\u000fSЃ@Pۺ\u0018ğƁ&j:;1FG\n\u000e\b\u007fLu\u0003\u001d\u001a\u0004\u0010\u0014 DPÑPǽˮ\u0017\u0011\u0005j@>u^Z3}Q{HW~\u000b7';\u0017_֏\u0007iӪ+ߌʧNQZY06'~1K|\u007f(\u0001v~U(l\u000b\no\u0012v\u0011\u001fTNf\u001cM+,k\u0019oP\u001ce1Qn5\u0016&\\w5o'\u0002o\\\u0019\u0013\u00134<}\u0004Z,FuhQk|S8w\u0003/D($zNZH\u0019DPt\u0017\u0002%3v`\u0015td\u007fe\u000b]F\u0017\u000b:G\tV\npCu\u00044<+BsqJDdI%\u001fukg\u001c\u0017ү[֥Ί\u0013\f\u0011J?>Z KpnW\u0011(x\u001c\u0002iNAi\u00025@\u0017YL,j>ֺBҍɎ\n\u0012\u0001RT3W-@\u0017\f;\u0005-\u0005|j,`\u0005\u000f{ɰ ơܣ\u0003\u00119t\u0007\ty\u000b{\u001el/\u0012\u000bGge\r)Dg~\u0015DsRb\u00143(\u0007 ;KkEa\u0004L\u0003u,>y}\u0010P\u001a\u0013\u001cp\u001dqʆSμcv8͜[krW|\u0001\"jbP8(-\u0006\u0013\rj\u0014eԨ\u001b۽voj\u03a2\u001d\\\u00069[\u001c\u0017\u0016r,]ќ\tސJ\u001b5ݢ\u0006<KU\u0003\u0014U\t\u000e\u0018ȯ\u0002\f8\"-\u0012\u00030-e\u001cl\"_19Dxlȋ\u0004Ƥ\u0017P(Ɍ~`\u0003\u0003\"8\u0018:_\u0004I\u0001Aioj&+\u0017Ӓ-˭\nBSЕI3q\u007f{n\u0004\u001d3j?g\u0012n[bSMe\u0012\u0005\u0084͌Zϳ\u0015c(Z\u0017\u0018\".>!<\u001cp>0Qi~~\u0003 g\u001b+GkXb\bËT˗\u0002\u001f\u0002ǡT9bB-;\u0005Zt)Ԛ`pZY\u0014yx75\u0004\u001aE,|-U\u0015Uӥ8J\u000b jLE(ە[\u0016Oc\rʹaw%)1X^\u05f6;\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u001d", "7m_Bg\u001bKO\"\r{h9\u0005\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "1nS2c6B\\(m\bZ5\u000b\n9r\b$\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6Mv2QPW;K_nF\"\u0013d\u001bV'\u001c\tcJy", "=tc=h;-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r%{C)%wPF\u0003l:O\u00014OH]0f[H", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\u001a]r6G\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8EA/\u0011+E\u0011?r\nU%\u000eHy:F_\u001bW\t^YJ4xUHluPOFl7l\bn!fC\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011\u001a\u0005H-=ijJOx\u001fKt:.\u0015\u007f\u0001\u001dBg>/}<\u0004A32kN)q\u0017>i\u0003\u00195k04\"?J\u0014IXkq{B\u0018qtH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+`\u000bG[\u0005:Xs\u001f0\u0010\u000eBn\t^\r\u0010/}t\u0013-+c\f*\u007f3/[\u001a\u0011\u0004p%$*%Ac\u0018>mP", "1nS2c6B\\(m\bZ5\u000b\n9r\b(z/\u0001*&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u0003&,\u00045W\u0003Eu\t\f\u0015|5}\u007f\u0018", "=tc=h;-S,\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "5dc\u001ch;Ic(mzq;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "=tc=h;-`\u0015\b\t_6\n\u0011/dn(\u000fO", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PQ,Uv%VPX5NRq?\u0014m[\u000fR4\u0011\u0014m\u0017", "Ad[2V;B]\"pz].|d0f\u00041\u007fO\u0015", "5dc X3>Q(\u0003\u0005g\u001e|\b1e[)|D\n\u001b&[", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju<v.GJ]0f[d=\u0013\u0014ZiO,\u0011\u000e]P8D", "Adc X3>Q(\u0003\u0005g\u001e|\b1e[)|D\n\u001b&[", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001aN}'E[R6eDr<\u0016\u00126\u000fO/\u0016\thUy25", "Ad[2V;B]\"pz].|d0f\u00041\u007fO\u0015U\u0016Gv\u000e>r45", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "Cmc?T5LT#\f\u0003^+k\tBt", "5dc\"a;KO\"\r{h9\u0005\t.T\u007f;\u000b", "DhbBT3-S,\u000e", "5dc#\\:NO mzq;", "1n[9T7LS\u0007~\u0002^*\f\r9nn2[I\u007f", "", "1n[9T7LS\u0007~\u0002^*\f\r9nn2c<\u0014", "1n[9X*M7!~ch;\u0001\n3c{7\u007fJ\n%", "", "<nc6Y@\"[\u0019e~l;|\u0012/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u00065X;`S\u0007!\u001c\u0012A\u0012\\:\r\u000eYNy", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\u001a]r6G\u000b76kVsQw\u001aZtR9\u001c\u0005bA1D+=)\u00173M\u000b\u0005f\u000b\u0019 \u001eDnyBdY%\u0004\u001e\u0005E2xBhc\u0004P\u0017\tI/`\u001d[fc6C&][\u0016 hN=_", "2d[2g,,S ~xm,{w/x\u000f", "3cXAH5M`\u0015\b\t_6\n\u0011/dn(\u000fO\\%\u0007Uo\u001b", "@dbAT9M7!~^_\n\u0007\u0012>e\t7YC| \u0019G}", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJi", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3pd._:", "=sW2e", "6`b566=S", "", "6hV5_0@V(\\}Z9\u000bl8", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-wlc<\u000eg.Q\u0006\u0016[WN\u0002", "BqP;f-H`!~yK(\u0006\u000b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "6hV5_0@V(\\}Z9\u000bl8-Q\u0015WEi|i", "uH9uI", ";`_\u0013e6FB&z\u0004l-\u0007\u00167e~", "@`]4X", ";`_\u0013e6FB&z\u0004l-\u0007\u00167e~o] \u0006\u0002!:S", "uI\u0018\u0017", "=eU@X;", ";`_\u0013e6FB&z\u0004l-\u0007\u00167e~oCE\u0014h{(}", "uH\u0018\u0017", ";`_!b\u001bKO\"\r{h9\u0005\t.", ";`_!b\u001bKO\"\r{h9\u0005\t.-a\b\u0001+\u000b\nz", ";`_!b\u001bKO\"\r{h9\u0005\t.-G-\u000f\u0012ew%", ">kP0X\nN`'\t\b;,}\u0013<e]+wM\\&", "BqP;f-H`!~yH-}\u0017/t", "@dS<", "@d_9T*>/ \u0006", "<df!X?M", "", "@d_9T*>A\u0019\u0006z\\;|\b\u001ee\u00137", "1kT.e\nH[$\t\tb;\u0001\u00138", "CmS<5,AO*\u0003\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;=VrD\u0013qY\u0012]\u001b\u0016\u0004c\u001e$q@H#\u00129\u001f", "@d_9T*>B\u0019\u0012\n", "@d_9T*>B\u0019\u0012\n&\u0014O\u0018\u000eO\b.", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dTt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g\u0016rqB\u0006_;R\u00010\u0011[N?k\u001cvF\u001f\"iWR4\u001c\u0005fJ u\u000eG(\u00076\u0013p;{\u0010l\u001a\u000e<iPAZ\u001f7\u0003\u0014\u007f\u001e)kBjc\u0004T\u0017:&\u001b", "Ad[2V;\u001aZ ", "Ad[2V;\u001cV\u0015\f\tB5", "Ad[2V;\u001cV\u0015\f\tB5DXDcG7b\u0013", "uI\u0018#", "Ad[2V;.\\(\fvg:}\u0013<m\u007f'YC|$%+x", "Cmc?T5LT#\f\u0003^+i\u00058g\u007f", "Ad[2V;.\\(\fvg:}\u0013<m\u007f'YC|$%+xU\f\f#|hdr", "BnBAe0GU", "", "CmS<", "CoS.g,", "\u0011n\\=T5B]\"", "\"qP;f-H`!~yM,\u0010\u0018", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final CodepointTransformation codepointTransformation;
    private final State<TransformedText> codepointTransformedText;
    private InputTransformation inputTransformation;
    private final OutputTransformation outputTransformation;
    private final State<TransformedText> outputTransformedText;
    private final MutableState selectionWedgeAffinity$delegate;
    private final TextFieldState textFieldState;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 */
    /* JADX INFO: compiled from: TransformedTextFieldState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`\b'\u0017%+\u001f)-)\"\"\u0013%96\t-*2+\u001b=+?1", f = "!>,8<.682)'\u0016&83\u0004&!'\u001e\f,\u0018*\u001aa\u001e&", i = {0, 0}, l = {679}, m = "2?=>87I\u001fD='IOECGBAUKRRX", n = {"c^kY", "]evOXo+T;&O=K?-+%"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return TransformedTextFieldState.this.collectImeNotifications(null, this);
        }
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    @JvmStatic
    /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0 */
    private static final long m1562mapFromTransformedxdX6G0(long j2, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1575mapFromTransformedxdX6G0(j2, offsetMappingCalculator);
    }

    @JvmStatic
    /* JADX INFO: renamed from: mapToTransformed-XGyztTk */
    private static final long m1563mapToTransformedXGyztTk(long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m1576mapToTransformedXGyztTk(j2, offsetMappingCalculator, selectionWedgeAffinity);
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, final CodepointTransformation codepointTransformation, final OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TransformedTextFieldState.TransformedText invoke() {
                return TransformedTextFieldState.Companion.calculateTransformedText(this.this$0.textFieldState.getValue$foundation_release(), outputTransformation, this.this$0.getSelectionWedgeAffinity());
            }
        }) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TransformedTextFieldState.TransformedText invoke() {
                TextFieldCharSequence value$foundation_release;
                TransformedTextFieldState.TransformedText transformedText;
                TransformedTextFieldState.Companion companion = TransformedTextFieldState.Companion;
                State state = this.this$0.outputTransformedText;
                if (state == null || (transformedText = (TransformedTextFieldState.TransformedText) state.getValue()) == null || (value$foundation_release = transformedText.getText()) == null) {
                    value$foundation_release = this.this$0.textFieldState.getValue$foundation_release();
                }
                return companion.calculateTransformedText(value$foundation_release, codepointTransformation, this.this$0.getSelectionWedgeAffinity());
            }
        }) : null;
        this.selectionWedgeAffinity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : inputTransformation, (4 & i2) != 0 ? null : codepointTransformation, (i2 + 8) - (i2 | 8) != 0 ? null : outputTransformation);
    }

    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation_release();
    }

    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    public final TextFieldCharSequence getVisualText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.codepointTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity$delegate.getValue();
    }

    public final void setSelectionWedgeAffinity(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity$delegate.setValue(selectionWedgeAffinity);
    }

    public final void update(InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    public final void placeCursorBeforeCharAt(int i2) {
        m1571selectCharsIn5zctL8(TextRangeKt.TextRange(i2));
    }

    /* JADX INFO: renamed from: selectCharsIn-5zc-tL8 */
    public final void m1571selectCharsIn5zctL8(long j2) {
        m1572selectUntransformedCharsIn5zctL8(m1567mapFromTransformedGEjPoXI(j2));
    }

    /* JADX INFO: renamed from: selectUntransformedCharsIn-5zc-tL8 */
    public final void m1572selectUntransformedCharsIn5zctL8(long j2) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer$foundation_release().setSelection(TextRange.m6123getStartimpl(j2), TextRange.m6118getEndimpl(j2));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: renamed from: highlightCharsIn-7RAjNK8 */
    public final void m1565highlightCharsIn7RAjNK8(int i2, long j2) {
        long jM1567mapFromTransformedGEjPoXI = m1567mapFromTransformedGEjPoXI(j2);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer$foundation_release().m1481setHighlightK7f2yys(i2, TextRange.m6123getStartimpl(jM1567mapFromTransformedGEjPoXI), TextRange.m6118getEndimpl(jM1567mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceAll(CharSequence charSequence) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        EditCommandKt.deleteAll(mainBuffer$foundation_release);
        EditCommandKt.commitText(mainBuffer$foundation_release, charSequence.toString(), 1);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(0, mainBuffer$foundation_release.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.delete(TextRange.m6121getMinimpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()), TextRange.m6120getMaximpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()));
        mainBuffer$foundation_release.setSelection(TextRange.m6121getMinimpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()), TextRange.m6121getMinimpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk$default */
    public static /* synthetic */ void m1564replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (4 | i2) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z2 = true;
        }
        transformedTextFieldState.m1570replaceTextM8tDOmk(charSequence, j2, textFieldEditUndoBehavior, z2);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk */
    public final void m1570replaceTextM8tDOmk(CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        long jM1567mapFromTransformedGEjPoXI = m1567mapFromTransformedGEjPoXI(j2);
        mainBuffer$foundation_release.replace(TextRange.m6121getMinimpl(jM1567mapFromTransformedGEjPoXI), TextRange.m6120getMaximpl(jM1567mapFromTransformedGEjPoXI), charSequence);
        int iM6121getMinimpl = TextRange.m6121getMinimpl(jM1567mapFromTransformedGEjPoXI) + charSequence.length();
        mainBuffer$foundation_release.setSelection(iM6121getMinimpl, iM6121getMinimpl);
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i2, Object obj) {
        if ((2 & i2) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z2, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(CharSequence charSequence, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        if (z2) {
            mainBuffer$foundation_release.commitComposition();
        }
        long jM1480getSelectiond9O1mEE = mainBuffer$foundation_release.m1480getSelectiond9O1mEE();
        mainBuffer$foundation_release.replace(TextRange.m6121getMinimpl(jM1480getSelectiond9O1mEE), TextRange.m6120getMaximpl(jM1480getSelectiond9O1mEE), charSequence);
        int iM6121getMinimpl = TextRange.m6121getMinimpl(jM1480getSelectiond9O1mEE) + charSequence.length();
        mainBuffer$foundation_release.setSelection(iM6121getMinimpl, iM6121getMinimpl);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(TextRange.m6120getMaximpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()), TextRange.m6120getMaximpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(TextRange.m6118getEndimpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()), TextRange.m6118getEndimpl(mainBuffer$foundation_release.m1480getSelectiond9O1mEE()));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer$foundation_release());
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean z2, Function1<? super EditingBuffer, Unit> function1) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer$foundation_release());
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    /* JADX INFO: renamed from: mapToTransformed--jx7JFs */
    public final long m1568mapToTransformedjx7JFs(int i2) {
        long jTextRange;
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            jTextRange = offsetMapping2.m1518mapFromSourcejx7JFs(i2);
        } else {
            jTextRange = TextRangeKt.TextRange(i2);
        }
        return offsetMapping != null ? Companion.m1576mapToTransformedXGyztTk(jTextRange, offsetMapping, getSelectionWedgeAffinity()) : jTextRange;
    }

    /* JADX INFO: renamed from: mapToTransformed-GEjPoXI */
    public final long m1569mapToTransformedGEjPoXI(long j2) {
        TransformedText value;
        TransformedText value2;
        long jM1577mapToTransformedXGyztTk$default = j2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            jM1577mapToTransformedXGyztTk$default = Companion.m1577mapToTransformedXGyztTk$default(Companion, jM1577mapToTransformedXGyztTk$default, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? Companion.m1576mapToTransformedXGyztTk(jM1577mapToTransformedXGyztTk$default, offsetMapping, getSelectionWedgeAffinity()) : jM1577mapToTransformedXGyztTk$default;
    }

    /* JADX INFO: renamed from: mapFromTransformed--jx7JFs */
    public final long m1566mapFromTransformedjx7JFs(int i2) {
        long jTextRange;
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            jTextRange = offsetMapping.m1517mapFromDestjx7JFs(i2);
        } else {
            jTextRange = TextRangeKt.TextRange(i2);
        }
        return offsetMapping2 != null ? Companion.m1575mapFromTransformedxdX6G0(jTextRange, offsetMapping2) : jTextRange;
    }

    /* JADX INFO: renamed from: mapFromTransformed-GEjPoXI */
    public final long m1567mapFromTransformedGEjPoXI(long j2) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            j2 = Companion.m1575mapFromTransformedxdX6G0(j2, offsetMapping);
        }
        return offsetMapping2 != null ? Companion.m1575mapFromTransformedxdX6G0(j2, offsetMapping2) : j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collectImeNotifications(final androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener r6, kotlin.coroutines.Continuation<?> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState.AnonymousClass1
            if (r0 == 0) goto L28
            r4 = r7
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r4 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r2 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L69
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r4 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r4.<init>(r7)
            goto L13
        L2e:
            kotlin.ResultKt.throwOnFailure(r2)
            r4.L$0 = r5
            r4.L$1 = r6
            r4.label = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2.<init>(r0, r1)
            r2.initCancellability()
            r1 = r2
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            androidx.compose.foundation.text.input.TextFieldState r0 = access$getTextFieldState$p(r5)
            r0.addNotifyImeListener$foundation_release(r6)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1.invokeOnCancellation(r0)
            java.lang.Object r1 = r2.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L66
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L66:
            if (r1 != r3) goto L74
            return r3
        L69:
            java.lang.Object r0 = r4.L$1
            androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener r0 = (androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener) r0
            java.lang.Object r0 = r4.L$0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r0
            kotlin.ResultKt.throwOnFailure(r2)
        L74:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.collectImeNotifications(androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (Intrinsics.areEqual(this.textFieldState, transformedTextFieldState.textFieldState) && Intrinsics.areEqual(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return Intrinsics.areEqual(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int iHashCode2 = (iHashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return iHashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    /* JADX INFO: compiled from: TransformedTextFieldState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000enjG9LeN.ZS8\u0015sڔ<$i0yّA٨ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?e4[ɃTK\u000e`jW\u0003m\u0002\u0004\u07b2go.9Z\fWdjFу\u0014{^\u001b_\u000b&\u000b\bŌd\u0012/˃geQU\u001c.H\n\n\rT\u0004<\u0007όL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u0003&,\u00045W\u0003Eu\t\f\u0015|5}\u007f\u0018", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM-O\u0005'V4J7gV{?q\u000ea\f^2\t\u0014cNy", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\nQr45LZ<\\[p=ixV\u0017M8\u0017\tXTmlN?*\u0012:IK<r\u0011\u0015\u0015\nDnzK \u001fG\r$?E2sVh)}PPEo3`\u0013)\u0007];H$#Y\u0015&sT7\fYO\u0018pb\u0001cvQ&P{\u0015", "5dc\u001cY-LS(fvi7\u0001\u00121", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju8w(UL]\u0014X]}A\u001d\u00148\nU)\u001d\fUP.{\u001a", "5dc!X?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class TransformedText {
        private final OffsetMappingCalculator offsetMapping;
        private final TextFieldCharSequence text;

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        public final TextFieldCharSequence component1() {
            return this.text;
        }

        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        public final TransformedText copy(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            return new TransformedText(textFieldCharSequence, offsetMappingCalculator);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return Intrinsics.areEqual(this.text, transformedText.text) && Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }
    }

    /* JADX INFO: compiled from: TransformedTextFieldState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}(\tWN}gvJ`\u000fIƧ\u0007,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016\u0010K:xvL\u0004N4R<\b\b\u0019\u001aXL@z\tHc\f@6ptHY%M3\"X\u0007\u0007@\u000f\u001ftid5vn\u000e>=&\u001bipRWc>\u0006e\rt^W\u0011\u0005h6+n?{\u0016ms\u0011\u0012j[m\u000fouK\u0012\u0001'U7yweDp\u007fB$qP\u05ce\\ö͉`\u0007Wp\u001a8s{q]h\u000eV\u0004+\u007f\u001bI\u001c\u000e43x2;(~\b<B%zY@^\tvD\u0016y\u0010>]&Ƨ2ٿݰ\u001fhWtI-\u05ce7\u0001\r\u0010$Ţ\u001d\u001d ƥX#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u0003\u0015)\u00107E\u000b?r\na", "", "u(E", "1`[0h3:b\u0019m\bZ5\u000b\n9r\b(z/\u0001*&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u0003&,\u00045W\u0003Eu\t\f\u0015|5}\u007f\u0018", "Cmc?T5LT#\f\u0003^+m\u00056u\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "=tc=h;-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r%{C)%wPF\u0003l:O\u00014OH]0f[H", "EdS4X\b?T\u001d\b~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PQ,Uv%VPX5NRq?\u0014m[\u000fR4\u0011\u0014m\u0017", "1nS2c6B\\(m\bZ5\u000b\n9r\b$\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6Mv2QPW;K_nF\"\u0013d\u001bV'\u001c\tcJy", ";`_\u0013e6FB&z\u0004l-\u0007\u00167e~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "@`]4X", ";`_=\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM-O\u0005'V4J7gV{?q\u000ea\f^2\t\u0014cNy", ";`_\u0013e6FB&z\u0004l-\u0007\u00167e~o\u000f?sg^):", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju8w(UL]\u0014X]}A\u001d\u00148\nU)\u001d\fUP.{\u001az\u0004", ";`_!b\u001bKO\"\r{h9\u0005\t.", ";`_!b\u001bKO\"\r{h9\u0005\t.-r\n\u0010U\u0010\u0006\u001d", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju8w(UL]\u0014X]}A\u001d\u00148\nU)\u001d\fUP.{\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYH\u0004%~@%wJchCVAXqsh\u0015j-k\u0004>-#q&$dWww{Z\u0011pa}qp9\u0019y:$\u001an\\JNsdPJj\u0004", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Companion {

        /* JADX INFO: compiled from: TransformedTextFieldState.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, null, null, offsetMappingCalculator, 6, null);
            outputTransformation.transformOutput(textFieldBuffer);
            TextRange textRangeM6111boximpl = null;
            if (textFieldBuffer.getChanges().getChangeCount() == 0) {
                return null;
            }
            long jM1576mapToTransformedXGyztTk = m1576mapToTransformedXGyztTk(textFieldCharSequence.m1446getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange textRangeM1445getCompositionMzsxiRA = textFieldCharSequence.m1445getCompositionMzsxiRA();
            if (textRangeM1445getCompositionMzsxiRA != null) {
                textRangeM6111boximpl = TextRange.m6111boximpl(TransformedTextFieldState.Companion.m1576mapToTransformedXGyztTk(textRangeM1445getCompositionMzsxiRA.m6127unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(textFieldBuffer.m1442toTextFieldCharSequenceudt6zUU$foundation_release(jM1576mapToTransformedXGyztTk, textRangeM6111boximpl), offsetMappingCalculator);
        }

        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            TextRange textRangeM6111boximpl = null;
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long jM1576mapToTransformedXGyztTk = m1576mapToTransformedXGyztTk(textFieldCharSequence.m1446getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange textRangeM1445getCompositionMzsxiRA = textFieldCharSequence.m1445getCompositionMzsxiRA();
            if (textRangeM1445getCompositionMzsxiRA != null) {
                textRangeM6111boximpl = TextRange.m6111boximpl(TransformedTextFieldState.Companion.m1576mapToTransformedXGyztTk(textRangeM1445getCompositionMzsxiRA.m6127unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(visualText, jM1576mapToTransformedXGyztTk, textRangeM6111boximpl, null, 8, null), offsetMappingCalculator);
        }

        /* JADX INFO: renamed from: mapToTransformed-XGyztTk$default */
        static /* synthetic */ long m1577mapToTransformedXGyztTk$default(Companion companion, long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i2, Object obj) {
            if ((i2 + 4) - (i2 | 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m1576mapToTransformedXGyztTk(j2, offsetMappingCalculator, selectionWedgeAffinity);
        }

        @JvmStatic
        /* JADX INFO: renamed from: mapToTransformed-XGyztTk */
        public final long m1576mapToTransformedXGyztTk(long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            long jTextRange;
            long jM1518mapFromSourcejx7JFs = offsetMappingCalculator.m1518mapFromSourcejx7JFs(TextRange.m6123getStartimpl(j2));
            long jM1518mapFromSourcejx7JFs2 = TextRange.m6117getCollapsedimpl(j2) ? jM1518mapFromSourcejx7JFs : offsetMappingCalculator.m1518mapFromSourcejx7JFs(TextRange.m6118getEndimpl(j2));
            int iMin = Math.min(TextRange.m6121getMinimpl(jM1518mapFromSourcejx7JFs), TextRange.m6121getMinimpl(jM1518mapFromSourcejx7JFs2));
            int iMax = Math.max(TextRange.m6120getMaximpl(jM1518mapFromSourcejx7JFs), TextRange.m6120getMaximpl(jM1518mapFromSourcejx7JFs2));
            if (TextRange.m6122getReversedimpl(j2)) {
                jTextRange = TextRangeKt.TextRange(iMax, iMin);
            } else {
                jTextRange = TextRangeKt.TextRange(iMin, iMax);
            }
            if (TextRange.m6117getCollapsedimpl(j2) && !TextRange.m6117getCollapsedimpl(jTextRange)) {
                WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
                int i2 = startAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i2 == -1) {
                    return jTextRange;
                }
                if (i2 == 1) {
                    return TextRangeKt.TextRange(TextRange.m6123getStartimpl(jTextRange));
                }
                if (i2 == 2) {
                    return TextRangeKt.TextRange(TextRange.m6118getEndimpl(jTextRange));
                }
                throw new NoWhenBranchMatchedException();
            }
            return jTextRange;
        }

        @JvmStatic
        /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0 */
        public final long m1575mapFromTransformedxdX6G0(long j2, OffsetMappingCalculator offsetMappingCalculator) {
            long jM1517mapFromDestjx7JFs = offsetMappingCalculator.m1517mapFromDestjx7JFs(TextRange.m6123getStartimpl(j2));
            long jM1517mapFromDestjx7JFs2 = TextRange.m6117getCollapsedimpl(j2) ? jM1517mapFromDestjx7JFs : offsetMappingCalculator.m1517mapFromDestjx7JFs(TextRange.m6118getEndimpl(j2));
            int iMin = Math.min(TextRange.m6121getMinimpl(jM1517mapFromDestjx7JFs), TextRange.m6121getMinimpl(jM1517mapFromDestjx7JFs2));
            int iMax = Math.max(TextRange.m6120getMaximpl(jM1517mapFromDestjx7JFs), TextRange.m6120getMaximpl(jM1517mapFromDestjx7JFs2));
            return TextRange.m6122getReversedimpl(j2) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }
    }
}
