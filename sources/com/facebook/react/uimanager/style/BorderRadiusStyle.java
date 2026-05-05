package com.facebook.react.uimanager.style;

import android.content.Context;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.LengthPercentage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0J\u001eP.`\\2\u000fq~<$i*yّCU0}*\tUNog\u0005JbŏK\u000f\u0014\u001b\u0001j2I]xk\u0012\u00172HoG3[{Eʠfҡ<\u001bړb\"fxE  >X&\u0005z[]\u001c @L\u0001<b\r{\b*\u0014\u0016>N\u0005L^\u0016OɇLlk?oݬ\u0002yJT'm6\u0015O#E\u0003+\u001d~g\u001e9GO7+$\u0002\u0007\u0017Za?\u0011G\n?\u001bgU+;QyWDa\u0018\u0016+*}\u0011mz,\\\u0013[x\u000e=*}g[X\u0014(\u0006\u0006\u0014\u000fR\u0003<\n7P4-(r \u0010Is!WPX\b^P\r\u0013cL\u0016S\u0004C3?\u001bt_y=/Me\u007f\u0015\u0015$#\u000f}9]j\r\u000f\u0019+\\}Q?aX?^M8]Mu\npp\u0013B\u0006FF.3\f\u00194\u00173Is;9 \u001a\u0006ҩHg\u0005\u0018)qa\u001ajJV!\u001d\u001a}Ү\nTcR\u0016\u001dmfS\u00070Wܺ\u001d\u001d\u0010\f:+\"rvj%kŲO\u0018qw\u001ee_ $]j}ֱo4\u0017emv5KP\u0012\u0014(سw\\HJ\u0018\u001dZ|A\u0002\u0010!ک)j;V!(y\u0012C|\u0010Yռ@:%BcI\u001br\u0014v\u0007d֚BE\u0012m\u0013\u0001\u0012\u0015Sa(Iȴ%=\u0012\u000f\ntr\u0006f'Mrːaj6O\fM\u001b<TPlzı$O\b\u0002;_ibFzp\\µVD)$VQSE<A\u0013Eɂ3JεDZ0}Q{ȼW\u0003\u0003y\u001dA\u00010}\u0007\u0019t\\hpJ][/$\r]!'8l\u0006yoN\u0013IyS9_nQx\u0003gEf:\u0013\u0004M\"U\tu\"\u000b?EE=\u001cD{D7\u001bakt\b0\u0010a=*%m\n,q\"\bdg\\`?hQ_~L/<n\u0019Avn(\u0010H\tB\u001bKJWc\u001fZhU\u0011/\fu\u001f.#o\u0005_j\u001bu}B>w,\nB,\u0018\u000fK+\u0011[d\u007fo\u0004J\u000b\u000fz\u0017\u0010\u000b\nC\u0007\u00142<NZ\u001eƉ\bx\u0017\u0002VNAi\"5B\u0017dL.R\u00079B\u001bʂ\u0007X\t\u000e\bw\u0011-1pwkZ\u001c\u0017\u0011\\\u0005KMdS$9*/>W:,=M133\r\u0092.,V\u000f\u001a5\tI2\u007f\u0003tmCD\u0003~K,fJ#E\f\u000ey\u0006DO_)\u001c8 \u0010Fe\u0015\u001dpdcO__wv^.;Yr\u0011|v@i\u0003T0y\u0017|\u0013\rj\u000eW\u0012'!\u000bo\u0011\u007f\u0013Ьv\b](\u000f/F?\u0006:\u0001:˱'ұ\nA5֑al\u001a;\nls=\u0004\u001e.7w\u001e\u0003*tY$e8aqŴ\"ޭ\u001an\nƁ+R&\u001c<_\u0015t\u0010G\u0016M \u001cA\f+`oj&%\u0017Ӗ7˭\nNSЕ\u0011\fi\u0007q\u0004u\r\t\u0002?mJ\t;]5\u000b=L\\\u0017/śFñW,`ҹ\u0018\u0016\u001bB-K(d/-]z9\u000byas\u000fA.\u001a.8ɼ<ݟ\"\n'ݗ\u000e\u00060r6*[XS]r -\u0007Ph&`\u0001'\u0013xbÐ μ\u0003TfƷ+6L\u0013,yO9\u001f@i$\u0018z\u0015\u0014]K< _V\u0016הCכ\u000f{0ϓ)\u0005@\u0005\u0003\u0015JD\u000f\u0016\u000e~|GTcU\u001c=XRq;ܥ2ɷIDJ݊D\u0013\u00145=oX\"D\u0002(3\fkAM1\u0013\u0017\u0014f\nFޥ%ǝn][ϷB\u0003\u0003'\u001bT\u001a3qa\u0002NC==\u0016\b\u001dmei)\f֔Xۡ\u0010\u000emڄ\u0017Oi~\u001dvLK;n,\u0011&Z\u000e\u00127&:\u0005$'Vӡ=؝.kdǾnu].4?VpJNU\u0004I\u000e\u00187\u0002\u001a\nc\ne\u000bШ\u0007\u008f\u001dPFϠEn\rq[}\u001a\rJ:S+\b)\u0014/K\u0019\u0013\u000f}u\u0017ԻU\u05ffQ;dѮT\u0015y2HG\u00028\u007fvNpً\n\u0001"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x!\u001a\u0014lqGtr@Uv|", "", ">q^=X9MW\u0019\r", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x!\u001a\u0014lqGqp6YL", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cY\u0007\"Fp\u0001.ZA;tC\u001a\u0017h7", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "CmX3b9F", "Bn_\u0019X-M", "Bn_\u001f\\.Ab", "0ncAb4%S\u001a\u000e", "0ncAb4+W\u001b\u0002\n", "Bn_ g(Kb", "Bn_\u0012a+", "0ncAb4,b\u0015\f\n", "0ncAb4\u001e\\\u0018", "AsP?g\u001aMO&\u000e", "AsP?g\fGR", "3mS g(Kb", "3mS\u0012a+", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~@})9|\u0019\u0019MP9k=-\u0011ja\u000fma6V@(CJN)f\\x\u0007!\u0012V\f]t\u001d\ta=-jF7,Q\u0013I\u000b=w\u0004v\u0016\u001b3jyQR\u0012GO{sK12GU]yDKOhsq\f[\u001bk\u0004J(\u001cm\"\u0017jP;SbS\u001ata|RgT\u0017zA3:o[\u001c,m_D>(\u001bI{t\u001c<^>8t)\u0002CsFh\rGp\u0014@^\u0006^\u0013\\J)59'\u0013LIc~{:\u0010htH\u0006\u0018j~2\u0015ce`R\u0019\r'$[1_nJGV\u000e:Rk\u0017'SH)[\u0003\u0017\u0018\n\u000fmrGC$c|\u001cp\u001a\t]\u001b\u000bLg\u0014\u001a.\u0013Gc\u001527_3K\"Rx<\u0014wb?\u0017pUYTK{]fr\u000f6\u0006\u000fI*BG>v(*m\u001a\u001e}\u0002\u0007|\u001dpsL\u007f\u007f %!;h\u0002rd7\u0007pO$\u0019t\u0002\u0003\u001f63\u0011U+nku'\u001e\r\nj|jD<B\n|BEh\"9mU\u000b\u0006gR\f*\\^?d|\u0012KWu5W8t\u007f\r-\b\u0016\u0007,3sG(v\u00171far\by%x\u001c|VN\u0013W\u001dt\u0012U\u001ayY>N &Nd\u001eH\u0003)P\u00045H\u007f!B\u000bhT\u00130X@\t_<zv\b?\u001c\u000eQQ\u0003\u001dE\u0018e \u007fAyN+_`k\u001cx^;\u001fJ=\u0015Ei\u0001\u0001^G\u0005nmTq\b\u00015%w;nHu:>b?\u001e-t,fQqs@.<\b&bG+9xd-\u0002if\u007f>9\u0004\u0019-H4eFIP\u001eI\\#~t2\u0015(.\f\u0015D\u0015{6o''O;!>p\u00056\u0011s\u000eIo!4UER'\u0011 $\tn\n$];Np*dFJ*,?re\n]M\u001cb%\b\u001d]Ik\u0006J5\u0017\r\u001bL\u0017a.\u0014}\u001a\u0010<\"a@]\u0010lny\u007f@\trMfUyI%\u0003Y", "5dc\u000fb;M]!^\u0004]", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#d @o%18CHi4'$dc9\\", "Adc\u000fb;M]!^\u0004]", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~@})9|\u0019\u0019MP9k=-\u0011ja\u000fJT", "5dc\u000fb;M]!ez_;", "Adc\u000fb;M]!ez_;", "5dc\u000fb;M]!k~`/\f", "Adc\u000fb;M]!k~`/\f", "5dc\u000fb;M]!l\nZ9\f", "Adc\u000fb;M]!l\nZ9\f", "5dc\u0012a+\u001e\\\u0018", "Adc\u0012a+\u001e\\\u0018", "5dc\u0012a+,b\u0015\f\n", "Adc\u0012a+,b\u0015\f\n", "5dc g(Kbx\by", "Adc g(Kbx\by", "5dc g(Kb\u0007\u000evk;", "Adc g(Kb\u0007\u000evk;", "5dc!b7\u001e\\\u0018", "Adc!b7\u001e\\\u0018", "5dc!b7%S\u001a\u000e", "Adc!b7%S\u001a\u000e", "5dc!b7+W\u001b\u0002\n", "Adc!b7+W\u001b\u0002\n", "5dc!b7,b\u0015\f\n", "Adc!b7,b\u0015\f\n", "5dc\"a0?]&\u0007", "Adc\"a0?]&\u0007", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "", "=sW2e", "5dc", ">q^=X9Mg", "6`b\u001fb<GR\u0019}Wh9{\t<s", "6`b566=S", "", "@db<_=>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8UNKz4\u001dqrn8\u0007p\u0019Ju+WZ$", ":`h<h;\u001dW&~xm0\u0007\u0012", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "EhSA[", "", "6dX4[;", "Adc", "", "D`[BX", "BnBAe0GU", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BorderRadiusStyle {
    private LengthPercentage bottomEnd;
    private LengthPercentage bottomLeft;
    private LengthPercentage bottomRight;
    private LengthPercentage bottomStart;
    private LengthPercentage endEnd;
    private LengthPercentage endStart;
    private LengthPercentage startEnd;
    private LengthPercentage startStart;
    private LengthPercentage topEnd;
    private LengthPercentage topLeft;
    private LengthPercentage topRight;
    private LengthPercentage topStart;
    private LengthPercentage uniform;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderRadiusProp.values().length];
            try {
                iArr[BorderRadiusProp.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BorderRadiusStyle() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13) {
        this.uniform = lengthPercentage;
        this.topLeft = lengthPercentage2;
        this.topRight = lengthPercentage3;
        this.bottomLeft = lengthPercentage4;
        this.bottomRight = lengthPercentage5;
        this.topStart = lengthPercentage6;
        this.topEnd = lengthPercentage7;
        this.bottomStart = lengthPercentage8;
        this.bottomEnd = lengthPercentage9;
        this.startStart = lengthPercentage10;
        this.startEnd = lengthPercentage11;
        this.endStart = lengthPercentage12;
        this.endEnd = lengthPercentage13;
    }

    public /* synthetic */ BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : lengthPercentage, (i2 & 2) != 0 ? null : lengthPercentage2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : lengthPercentage3, (i2 & 8) != 0 ? null : lengthPercentage4, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : lengthPercentage5, (i2 + 32) - (i2 | 32) != 0 ? null : lengthPercentage6, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : lengthPercentage7, (i2 & 128) != 0 ? null : lengthPercentage8, (i2 & 256) != 0 ? null : lengthPercentage9, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? null : lengthPercentage10, (i2 + 1024) - (i2 | 1024) != 0 ? null : lengthPercentage11, (i2 + 2048) - (i2 | 2048) != 0 ? null : lengthPercentage12, (-1) - (((-1) - i2) | ((-1) - 4096)) == 0 ? lengthPercentage13 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BorderRadiusStyle(List<? extends Pair<? extends BorderRadiusProp, LengthPercentage>> properties) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        Intrinsics.checkNotNullParameter(properties, "properties");
        Iterator<T> it = properties.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set((BorderRadiusProp) pair.component1(), (LengthPercentage) pair.component2());
        }
    }

    public static /* synthetic */ BorderRadiusStyle copy$default(BorderRadiusStyle borderRadiusStyle, LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lengthPercentage = borderRadiusStyle.uniform;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            lengthPercentage2 = borderRadiusStyle.topLeft;
        }
        if ((i2 & 4) != 0) {
            lengthPercentage3 = borderRadiusStyle.topRight;
        }
        if ((i2 & 8) != 0) {
            lengthPercentage4 = borderRadiusStyle.bottomLeft;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            lengthPercentage5 = borderRadiusStyle.bottomRight;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            lengthPercentage6 = borderRadiusStyle.topStart;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            lengthPercentage7 = borderRadiusStyle.topEnd;
        }
        if ((i2 & 128) != 0) {
            lengthPercentage8 = borderRadiusStyle.bottomStart;
        }
        if ((i2 & 256) != 0) {
            lengthPercentage9 = borderRadiusStyle.bottomEnd;
        }
        if ((i2 & 512) != 0) {
            lengthPercentage10 = borderRadiusStyle.startStart;
        }
        if ((i2 & 1024) != 0) {
            lengthPercentage11 = borderRadiusStyle.startEnd;
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            lengthPercentage12 = borderRadiusStyle.endStart;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            lengthPercentage13 = borderRadiusStyle.endEnd;
        }
        return borderRadiusStyle.copy(lengthPercentage, lengthPercentage2, lengthPercentage3, lengthPercentage4, lengthPercentage5, lengthPercentage6, lengthPercentage7, lengthPercentage8, lengthPercentage9, lengthPercentage10, lengthPercentage11, lengthPercentage12, lengthPercentage13);
    }

    public final LengthPercentage component1() {
        return this.uniform;
    }

    public final LengthPercentage component10() {
        return this.startStart;
    }

    public final LengthPercentage component11() {
        return this.startEnd;
    }

    public final LengthPercentage component12() {
        return this.endStart;
    }

    public final LengthPercentage component13() {
        return this.endEnd;
    }

    public final LengthPercentage component2() {
        return this.topLeft;
    }

    public final LengthPercentage component3() {
        return this.topRight;
    }

    public final LengthPercentage component4() {
        return this.bottomLeft;
    }

    public final LengthPercentage component5() {
        return this.bottomRight;
    }

    public final LengthPercentage component6() {
        return this.topStart;
    }

    public final LengthPercentage component7() {
        return this.topEnd;
    }

    public final LengthPercentage component8() {
        return this.bottomStart;
    }

    public final LengthPercentage component9() {
        return this.bottomEnd;
    }

    public final BorderRadiusStyle copy(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13) {
        return new BorderRadiusStyle(lengthPercentage, lengthPercentage2, lengthPercentage3, lengthPercentage4, lengthPercentage5, lengthPercentage6, lengthPercentage7, lengthPercentage8, lengthPercentage9, lengthPercentage10, lengthPercentage11, lengthPercentage12, lengthPercentage13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderRadiusStyle)) {
            return false;
        }
        BorderRadiusStyle borderRadiusStyle = (BorderRadiusStyle) obj;
        return Intrinsics.areEqual(this.uniform, borderRadiusStyle.uniform) && Intrinsics.areEqual(this.topLeft, borderRadiusStyle.topLeft) && Intrinsics.areEqual(this.topRight, borderRadiusStyle.topRight) && Intrinsics.areEqual(this.bottomLeft, borderRadiusStyle.bottomLeft) && Intrinsics.areEqual(this.bottomRight, borderRadiusStyle.bottomRight) && Intrinsics.areEqual(this.topStart, borderRadiusStyle.topStart) && Intrinsics.areEqual(this.topEnd, borderRadiusStyle.topEnd) && Intrinsics.areEqual(this.bottomStart, borderRadiusStyle.bottomStart) && Intrinsics.areEqual(this.bottomEnd, borderRadiusStyle.bottomEnd) && Intrinsics.areEqual(this.startStart, borderRadiusStyle.startStart) && Intrinsics.areEqual(this.startEnd, borderRadiusStyle.startEnd) && Intrinsics.areEqual(this.endStart, borderRadiusStyle.endStart) && Intrinsics.areEqual(this.endEnd, borderRadiusStyle.endEnd);
    }

    public final LengthPercentage get(BorderRadiusProp property) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                return this.uniform;
            case 2:
                return this.topLeft;
            case 3:
                return this.topRight;
            case 4:
                return this.bottomLeft;
            case 5:
                return this.bottomRight;
            case 6:
                return this.topStart;
            case 7:
                return this.topEnd;
            case 8:
                return this.bottomStart;
            case 9:
                return this.bottomEnd;
            case 10:
                return this.startStart;
            case 11:
                return this.startEnd;
            case 12:
                return this.endStart;
            case 13:
                return this.endEnd;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final LengthPercentage getBottomEnd() {
        return this.bottomEnd;
    }

    public final LengthPercentage getBottomLeft() {
        return this.bottomLeft;
    }

    public final LengthPercentage getBottomRight() {
        return this.bottomRight;
    }

    public final LengthPercentage getBottomStart() {
        return this.bottomStart;
    }

    public final LengthPercentage getEndEnd() {
        return this.endEnd;
    }

    public final LengthPercentage getEndStart() {
        return this.endStart;
    }

    public final LengthPercentage getStartEnd() {
        return this.startEnd;
    }

    public final LengthPercentage getStartStart() {
        return this.startStart;
    }

    public final LengthPercentage getTopEnd() {
        return this.topEnd;
    }

    public final LengthPercentage getTopLeft() {
        return this.topLeft;
    }

    public final LengthPercentage getTopRight() {
        return this.topRight;
    }

    public final LengthPercentage getTopStart() {
        return this.topStart;
    }

    public final LengthPercentage getUniform() {
        return this.uniform;
    }

    public final boolean hasRoundedBorders() {
        return (this.uniform == null && this.topLeft == null && this.topRight == null && this.bottomLeft == null && this.bottomRight == null && this.topStart == null && this.topEnd == null && this.bottomStart == null && this.bottomEnd == null && this.startStart == null && this.startEnd == null && this.endStart == null && this.endEnd == null) ? false : true;
    }

    public int hashCode() {
        LengthPercentage lengthPercentage = this.uniform;
        int iHashCode = (lengthPercentage == null ? 0 : lengthPercentage.hashCode()) * 31;
        LengthPercentage lengthPercentage2 = this.topLeft;
        int iHashCode2 = (iHashCode + (lengthPercentage2 == null ? 0 : lengthPercentage2.hashCode())) * 31;
        LengthPercentage lengthPercentage3 = this.topRight;
        int iHashCode3 = (iHashCode2 + (lengthPercentage3 == null ? 0 : lengthPercentage3.hashCode())) * 31;
        LengthPercentage lengthPercentage4 = this.bottomLeft;
        int iHashCode4 = (iHashCode3 + (lengthPercentage4 == null ? 0 : lengthPercentage4.hashCode())) * 31;
        LengthPercentage lengthPercentage5 = this.bottomRight;
        int iHashCode5 = (iHashCode4 + (lengthPercentage5 == null ? 0 : lengthPercentage5.hashCode())) * 31;
        LengthPercentage lengthPercentage6 = this.topStart;
        int iHashCode6 = (iHashCode5 + (lengthPercentage6 == null ? 0 : lengthPercentage6.hashCode())) * 31;
        LengthPercentage lengthPercentage7 = this.topEnd;
        int iHashCode7 = (iHashCode6 + (lengthPercentage7 == null ? 0 : lengthPercentage7.hashCode())) * 31;
        LengthPercentage lengthPercentage8 = this.bottomStart;
        int iHashCode8 = (iHashCode7 + (lengthPercentage8 == null ? 0 : lengthPercentage8.hashCode())) * 31;
        LengthPercentage lengthPercentage9 = this.bottomEnd;
        int iHashCode9 = (iHashCode8 + (lengthPercentage9 == null ? 0 : lengthPercentage9.hashCode())) * 31;
        LengthPercentage lengthPercentage10 = this.startStart;
        int iHashCode10 = (iHashCode9 + (lengthPercentage10 == null ? 0 : lengthPercentage10.hashCode())) * 31;
        LengthPercentage lengthPercentage11 = this.startEnd;
        int iHashCode11 = (iHashCode10 + (lengthPercentage11 == null ? 0 : lengthPercentage11.hashCode())) * 31;
        LengthPercentage lengthPercentage12 = this.endStart;
        int iHashCode12 = (iHashCode11 + (lengthPercentage12 == null ? 0 : lengthPercentage12.hashCode())) * 31;
        LengthPercentage lengthPercentage13 = this.endEnd;
        return iHashCode12 + (lengthPercentage13 != null ? lengthPercentage13.hashCode() : 0);
    }

    public final ComputedBorderRadius resolve(int i2, Context context, float f2, float f3) {
        ComputedBorderRadius computedBorderRadius;
        CornerRadii cornerRadiiResolve;
        CornerRadii cornerRadiiResolve2;
        CornerRadii cornerRadiiResolve3;
        CornerRadii cornerRadiiResolve4;
        CornerRadii cornerRadiiResolve5;
        CornerRadii cornerRadiiResolve6;
        CornerRadii cornerRadiiResolve7;
        CornerRadii cornerRadiiResolve8;
        CornerRadii cornerRadiiResolve9;
        CornerRadii cornerRadiiResolve10;
        CornerRadii cornerRadiiResolve11;
        CornerRadii cornerRadiiResolve12;
        Intrinsics.checkNotNullParameter(context, "context");
        CornerRadii cornerRadii = new CornerRadii(0.0f, 0.0f);
        if (i2 == 0) {
            LengthPercentage lengthPercentage = this.startStart;
            if (lengthPercentage == null && (lengthPercentage = this.topStart) == null && (lengthPercentage = this.topLeft) == null) {
                lengthPercentage = this.uniform;
            }
            if (lengthPercentage == null || (cornerRadiiResolve = lengthPercentage.resolve(f2, f3)) == null) {
                cornerRadiiResolve = cornerRadii;
            }
            LengthPercentage lengthPercentage2 = this.endStart;
            if (lengthPercentage2 == null && (lengthPercentage2 = this.topEnd) == null && (lengthPercentage2 = this.topRight) == null) {
                lengthPercentage2 = this.uniform;
            }
            if (lengthPercentage2 == null || (cornerRadiiResolve2 = lengthPercentage2.resolve(f2, f3)) == null) {
                cornerRadiiResolve2 = cornerRadii;
            }
            LengthPercentage lengthPercentage3 = this.startEnd;
            if (lengthPercentage3 == null && (lengthPercentage3 = this.bottomStart) == null && (lengthPercentage3 = this.bottomLeft) == null) {
                lengthPercentage3 = this.uniform;
            }
            if (lengthPercentage3 == null || (cornerRadiiResolve3 = lengthPercentage3.resolve(f2, f3)) == null) {
                cornerRadiiResolve3 = cornerRadii;
            }
            LengthPercentage lengthPercentage4 = this.endEnd;
            if (lengthPercentage4 == null && (lengthPercentage4 = this.bottomEnd) == null && (lengthPercentage4 = this.bottomRight) == null) {
                lengthPercentage4 = this.uniform;
            }
            if (lengthPercentage4 != null && (cornerRadiiResolve4 = lengthPercentage4.resolve(f2, f3)) != null) {
                cornerRadii = cornerRadiiResolve4;
            }
            computedBorderRadius = new ComputedBorderRadius(cornerRadiiResolve, cornerRadiiResolve2, cornerRadiiResolve3, cornerRadii);
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException("Expected?.resolved layout direction");
            }
            if (I18nUtil.Companion.getInstance().doLeftAndRightSwapInRTL(context)) {
                LengthPercentage lengthPercentage5 = this.endStart;
                if (lengthPercentage5 == null && (lengthPercentage5 = this.topEnd) == null && (lengthPercentage5 = this.topRight) == null) {
                    lengthPercentage5 = this.uniform;
                }
                if (lengthPercentage5 == null || (cornerRadiiResolve9 = lengthPercentage5.resolve(f2, f3)) == null) {
                    cornerRadiiResolve9 = cornerRadii;
                }
                LengthPercentage lengthPercentage6 = this.startStart;
                if (lengthPercentage6 == null && (lengthPercentage6 = this.topStart) == null && (lengthPercentage6 = this.topLeft) == null) {
                    lengthPercentage6 = this.uniform;
                }
                if (lengthPercentage6 == null || (cornerRadiiResolve10 = lengthPercentage6.resolve(f2, f3)) == null) {
                    cornerRadiiResolve10 = cornerRadii;
                }
                LengthPercentage lengthPercentage7 = this.endEnd;
                if (lengthPercentage7 == null && (lengthPercentage7 = this.bottomStart) == null && (lengthPercentage7 = this.bottomRight) == null) {
                    lengthPercentage7 = this.uniform;
                }
                if (lengthPercentage7 == null || (cornerRadiiResolve11 = lengthPercentage7.resolve(f2, f3)) == null) {
                    cornerRadiiResolve11 = cornerRadii;
                }
                LengthPercentage lengthPercentage8 = this.startEnd;
                if (lengthPercentage8 == null && (lengthPercentage8 = this.bottomEnd) == null && (lengthPercentage8 = this.bottomLeft) == null) {
                    lengthPercentage8 = this.uniform;
                }
                if (lengthPercentage8 != null && (cornerRadiiResolve12 = lengthPercentage8.resolve(f2, f3)) != null) {
                    cornerRadii = cornerRadiiResolve12;
                }
                computedBorderRadius = new ComputedBorderRadius(cornerRadiiResolve9, cornerRadiiResolve10, cornerRadiiResolve11, cornerRadii);
            } else {
                LengthPercentage lengthPercentage9 = this.endStart;
                if (lengthPercentage9 == null && (lengthPercentage9 = this.topEnd) == null && (lengthPercentage9 = this.topLeft) == null) {
                    lengthPercentage9 = this.uniform;
                }
                if (lengthPercentage9 == null || (cornerRadiiResolve5 = lengthPercentage9.resolve(f2, f3)) == null) {
                    cornerRadiiResolve5 = cornerRadii;
                }
                LengthPercentage lengthPercentage10 = this.startStart;
                if (lengthPercentage10 == null && (lengthPercentage10 = this.topStart) == null && (lengthPercentage10 = this.topRight) == null) {
                    lengthPercentage10 = this.uniform;
                }
                if (lengthPercentage10 == null || (cornerRadiiResolve6 = lengthPercentage10.resolve(f2, f3)) == null) {
                    cornerRadiiResolve6 = cornerRadii;
                }
                LengthPercentage lengthPercentage11 = this.endEnd;
                if (lengthPercentage11 == null && (lengthPercentage11 = this.bottomStart) == null && (lengthPercentage11 = this.bottomLeft) == null) {
                    lengthPercentage11 = this.uniform;
                }
                if (lengthPercentage11 == null || (cornerRadiiResolve7 = lengthPercentage11.resolve(f2, f3)) == null) {
                    cornerRadiiResolve7 = cornerRadii;
                }
                LengthPercentage lengthPercentage12 = this.startEnd;
                if (lengthPercentage12 == null && (lengthPercentage12 = this.bottomEnd) == null && (lengthPercentage12 = this.bottomRight) == null) {
                    lengthPercentage12 = this.uniform;
                }
                if (lengthPercentage12 != null && (cornerRadiiResolve8 = lengthPercentage12.resolve(f2, f3)) != null) {
                    cornerRadii = cornerRadiiResolve8;
                }
                computedBorderRadius = new ComputedBorderRadius(cornerRadiiResolve5, cornerRadiiResolve6, cornerRadiiResolve7, cornerRadii);
            }
        }
        return computedBorderRadius;
    }

    public final void set(BorderRadiusProp property, LengthPercentage lengthPercentage) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                this.uniform = lengthPercentage;
                break;
            case 2:
                this.topLeft = lengthPercentage;
                break;
            case 3:
                this.topRight = lengthPercentage;
                break;
            case 4:
                this.bottomLeft = lengthPercentage;
                break;
            case 5:
                this.bottomRight = lengthPercentage;
                break;
            case 6:
                this.topStart = lengthPercentage;
                break;
            case 7:
                this.topEnd = lengthPercentage;
                break;
            case 8:
                this.bottomStart = lengthPercentage;
                break;
            case 9:
                this.bottomEnd = lengthPercentage;
                break;
            case 10:
                this.startStart = lengthPercentage;
                break;
            case 11:
                this.startEnd = lengthPercentage;
                break;
            case 12:
                this.endStart = lengthPercentage;
                break;
            case 13:
                this.endEnd = lengthPercentage;
                break;
        }
    }

    public final void setBottomEnd(LengthPercentage lengthPercentage) {
        this.bottomEnd = lengthPercentage;
    }

    public final void setBottomLeft(LengthPercentage lengthPercentage) {
        this.bottomLeft = lengthPercentage;
    }

    public final void setBottomRight(LengthPercentage lengthPercentage) {
        this.bottomRight = lengthPercentage;
    }

    public final void setBottomStart(LengthPercentage lengthPercentage) {
        this.bottomStart = lengthPercentage;
    }

    public final void setEndEnd(LengthPercentage lengthPercentage) {
        this.endEnd = lengthPercentage;
    }

    public final void setEndStart(LengthPercentage lengthPercentage) {
        this.endStart = lengthPercentage;
    }

    public final void setStartEnd(LengthPercentage lengthPercentage) {
        this.startEnd = lengthPercentage;
    }

    public final void setStartStart(LengthPercentage lengthPercentage) {
        this.startStart = lengthPercentage;
    }

    public final void setTopEnd(LengthPercentage lengthPercentage) {
        this.topEnd = lengthPercentage;
    }

    public final void setTopLeft(LengthPercentage lengthPercentage) {
        this.topLeft = lengthPercentage;
    }

    public final void setTopRight(LengthPercentage lengthPercentage) {
        this.topRight = lengthPercentage;
    }

    public final void setTopStart(LengthPercentage lengthPercentage) {
        this.topStart = lengthPercentage;
    }

    public final void setUniform(LengthPercentage lengthPercentage) {
        this.uniform = lengthPercentage;
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.uniform + ", topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ", topStart=" + this.topStart + ", topEnd=" + this.topEnd + ", bottomStart=" + this.bottomStart + ", bottomEnd=" + this.bottomEnd + ", startStart=" + this.startStart + ", startEnd=" + this.startEnd + ", endStart=" + this.endStart + ", endEnd=" + this.endEnd + ")";
    }
}
