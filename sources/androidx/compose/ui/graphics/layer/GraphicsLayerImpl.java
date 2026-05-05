package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fR܀kŞ\fA\u00145\u0013.H\u0002*,(w\u000ffp<8D{H6RY0\u0017k\n=,[*tK;k\u001a\u0006\"\u000fRVg}nRZ\u0011H\u0017\u0006$\u007fr,OW\u0001](\u000f:Bu@;M\u0006=A`zT\r H\"@ц\r\u0001(*P\u0010|zKK\"\u00128@v:Z\rc\u0005\"Ň\u000e>6\u0001&ձoNLHtҗB/9\u0003qBd'g0\u0013M\u0015FZ'\u0015vw\u001e3¨?5+%[\u0003\rTc?\u0011Ey=\u000bl-\u0006Aɞ\u0012KfX.\u0013M*CUc\u0001yt\u0005\u007f5RKsUq!h\u000eVNA UJ\u0012e\u001e'v\u0005]\u001et`&3#L\u001ad\u00199l\u001d\u0018z\u0010\rG)\u000e\u000fC9IC\u0002eIvf7*c=\"1`\u0007!\n5>u#|l\ta3a@k,^\fi=\u001cZ\u001fE͆.\u00046,FSD3<|=7\n\u0010S'yh`F}u3H\u0019Ww;`@PX\\[Ӡ\bȱʑHf\u000bV^@!T\u001f:4T5T8\u0017.J\u0010<O\u0014@R]X\u0002j{L:)=WOY\u001dUT{¢]ڨ̳Ue\u0016S`idUJb\u001dX\u0015C*۵fڅ,,JJp\u0012\u0006~dP\u0012\u0017@DB8B2I\u0019\u000b\u001c\u001fҸ*\u05cc@ґɺ^Yӳ\u0014\tl5*\u000bw-\u0015\u000b\u0007Zj{@\u0004\u0007UD|\u000f/\u0004۲]ۺ\u0018ğǗ!gط\u0001-\u001f\u0001y\u000eUvlIR|$\u0007&\u0012.(29\u007f0\u0014ц\u001bɒ-<\u001a/K_\u0001hqO\u0018;\t\u0002J%I}Fg6\u0001GށlʧNYl\u0019(\u000el\u000bC\nj\u0019\b{\u0017\u0013U~l\rq=w\u000fY˂Hҡ<\u0007\u001d!$B\u000f\u000eB~;LQGm2\u00065G\u0015\u0010\u007f@ܗ:ՙaχקsdנ0m.qhtkA[:O}\rOr6z(ZH\u0019\u000e>\u0017_\u0380\u000fάLE|r\\^[#\u007f\u0014t.D\r\u001fl2ǌ\u001f̭\u0002>Fa0\u001bQ\u00164`IM\u001fg$w{\u0017c\\9teϿ\r֭5r*\u001eCKd`3\u0019>2\f\u0018dk\u0012ه\u0007Ø\r(L.B5\u0019L%\u0006\u0014>\u0013\u007ft\u000feņ>÷rĩے\rSܢ```\u0007fun*J\u0003\u0005@A)IM?7\u0006Hj.\u0012eWӜ)͢\u001ftg\u0001lY9yt;!^f8[[k{a\u0002d\u0005\u001eԊyÃs\u0016P\u001a\u0003VP\u001b;;WKm{\u0001t\u0019\u0011|N\u0013wh؍^Ƭ&3\u0017|\u0003JJ\r/\r\u001f\r\u0001t3CZ\r\u00107q\u001bWӦPͫ\u000b\u0016\u0015eLZ;\tU/C\nx\u0019w\u0012e\u0015S}6!vڛ\u0010ȯ%fo\u0010lLk\u001eZ\u0018wYp\u0007Y)^d\u001c.xuI˽:ĝ:Y\u001a5\bXl\\\fy'\u000750=\u001cP\u0013\u0001x8dC̀zό\u000f\r~3\\B|0p\u001f\u000fp[3cth\u0005)SN_g\u05ce ߴ%˿Æ\u0007aЍ\u0014Y{jv7]d--588l\u0002F`k\u0016\u001f(vZօ`Ӳ\u0019EnOD3\u0017_\rD]]loxz\u0003\\A\u0014+\u007f\u001fք\u001dӥ8P\u000b j\u0001E\u001c?]\u0013\u001an\f̐DI\u0091!@ZB!ςN9n0v\u0017\"Bdz\u001fXA֥vt؝0,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014G4Y}|", "", "/k_5T", "", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "/lQ6X5MA\u001czyh>Z\u00136o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "1kX=", "", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s8UNEy8-\u0019qc'\u0016p(]v)[\"", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u001dG<sPF7", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\tR\u0002a:\u007f'", "6`b\u0011\\:IZ\u0015\u0013ab:\f", "5dc\u0015T:\u001dW'\n\u0002Z@c\r=t", "7r8;i(EW\u0018z\n^+", "Adc\u0016a=:Z\u001d}vm,{", ":`h2e\u0010=", "", "5dc\u0019T@>`|}", "=v]2e\u0010=", "5dc\u001cj5>`|}", ">he<g\u0016?T'~\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001d\\=Hb\u0003\u007f{l,\fP\u00101]wX2K", "Adc\u001d\\=Hb\u0003\u007f{l,\fP5-N/g\u000bh", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "1`[0h3:b\u0019fvm9\u0001\u001c", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "", "2qPD", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "@dR<e+", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "=tc9\\5>A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "Adc\u001ch;EW\"~BHv\u0003p<_}", "uKP;W9HW\u0018H|k(\b\f3c\u000eqeP\u0010\u001e\u001bPoc!:\u0016", "Adc\u001db:Bb\u001d\t\u0004", "F", "", "G", "Ahi2", "Adc\u001db:Bb\u001d\t\u0004&\u000fG\u0014\u001cu\n\u001c", "uH8\u0017\u001c\u001d", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface GraphicsLayerImpl {
    public static final Companion Companion = Companion.$$INSTANCE;

    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(Canvas canvas);

    float getAlpha();

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    long mo4837getAmbientShadowColor0d7_KjU();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    int mo4838getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    int mo4839getCompositingStrategyke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    long mo4840getPivotOffsetF1C5BW0();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    long mo4841getSpotShadowColor0d7_KjU();

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1);

    void setAlpha(float f2);

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    void mo4842setAmbientShadowColor8_81llA(long j2);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    void mo4843setBlendModes9anfk8(int i2);

    void setCameraDistance(float f2);

    void setClip(boolean z2);

    void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    void mo4844setCompositingStrategyWpw9cng(int i2);

    void setInvalidated(boolean z2);

    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    void mo4845setOutlineO0kMr_c(Outline outline, long j2);

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    void mo4846setPivotOffsetk4lQ0M(long j2);

    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    void mo4847setPositionH0pRuoY(int i2, int i3, long j2);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setShadowElevation(float f2);

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    void mo4848setSpotShadowColor8_81llA(long j2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);

    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0007njO0LeN/Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t nuh\u0007[j\rS\u000f4\u0019\tl<I\u0004|\f\u0014Ƥ6BuDݯQuEʠxv<\u000b.9ś<\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014G4Y}e%VV7X[vG\u001dg", "", "u(E", "\u0012dU.h3M2&z\r;3\u0007\u00075", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u0011X-:c \u000eYk(\u000fe6o}.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Function1<DrawScope, Unit> DefaultDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                DrawScope.m4728drawRectnJ9OG0$default(drawScope, Color.Companion.m4213getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        };

        private Companion() {
        }

        public final Function1<DrawScope, Unit> getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }
}
