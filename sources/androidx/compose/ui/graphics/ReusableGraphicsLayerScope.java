package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00106B\u0005%4\u0012\u000e\u0007nj?7LeV7ZS0\u0012s{J$c$wLCU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u0007p4I[ye\u0012%2JoE6UoS9ht<\u001a(288\u0002\u0005\u0007\u001e2H&v\u0003CQ\u000f\u001a0VpBR\u0013U\r\u001a \u0006F \u0007\u001fbɡdȤxl\f9o&ɨmB\\'(4\u000b7%F\u0003\u0012U\u0002o\nC@e [Ǭ٨\u0007\u0007XH\u0010%MtU\u0005\u0017)W/Wto6\u0007\u0002Ri\u0002̔\u0019ǁv2dӤib\u0012+9T\u0004MV\u00146~K&\u001bE\u001c\u000e4/x2;\u001b~\b<;3G*Ċ\\ڕ]ۍʎy`ي\u001b3\b39G3hWkI$n9\u0002\u0011\u001b+s#|0sT<bE\u001fbxi1\u007fB{\u001d%˺eǀq\u0010xç\u001a,\n@U\u0005O}\u0017?%,\b}G69k0Ztk\u0005\u0006xh\u0002{\u0011\u001d\u0017̥zގ;6\u0011ȱrFj\u0019yetZ2'[3%1\f!+ \u000b\u0010l%3\u0011fO\u0017\u0002)\"4ܚ1ĽeŽףmjް[Gf3Co{\u0012gl\u0005/_>h!f\u0004\u0013e\u001ayt(P4~?fȅ}ΌR\u0010+4E\u0012*9|C'}-H1 x\u0016SȘa˖l\u0014\u0017V9F\u0011nt\r\u0017$h\\\u001f\u0014>կUض\u0001l*ΊYS;>4{Bj:$1/O\f\u000ep\u007fLuvCֶ\u0002ʀ\u007f,\u001e֝QS5h!;\u001f+8/;s\u001d\u000bs\u0001e\u0012U+Sȫ\u001b³l:oō\u0003r2\u0012xeoV\u001dT\u0005{CI\u0016\u001a\u0018{wE){\u0014Z\u0019\u000fVK\t\u0002\bp\rwSÿ+Ǫ)\rwܲ\u001573y5T6y\u001ag#\u001b.\u0010}i\u0012d%%# 42q\u0017\bdg\\`uv\u001e0˱Jѐ(x\u000bܩ`l}DPFT\u000f9\u0007O$AxF\u000e#/,h70\u001bqn[h\u0015.R\u000bʴkͫwO\u0006жvE+R[X\bos\u000ej\u0012\u001b1\u0018N\u00141\u001d\u0014LA.Wob72DHnݔMވf\u0011Dɿ<62\u0001\u0016\u0010cVoK\u001e\u0002PhmU/2pukZ\u001cU\u0011\\\u0005JC5\u001cȎ-Ǆ\u0005\u000b\u0017ɼ6z;x\u0013rfV5,@\b$?\u0017d\u0003O-hU/RUQ\u001bVZ?_\u001cئO͕\u0006B\fڛAoq:\u001a=8~#\u000e&\"\ns\u001f,\u000f0\r\r\u0006h\\e\u000f\u0012\u0015T\rv\u007fͽ\u0007է\u0012H\u0012ۇ#\u001bU@}gMNTFEJj#%\u0014A\u0007:~\u0014J).\u001e5[?\b?jմ\b\u009cWG\u0006И8\"-T\u0003&|Y\u00148\u0018dk\\$E.b0[CT.\u0005FJ#EH\u0003^˝[ױ7\u000e\u001bȅqm}uN|Kn\f\u0019Y@I*qE{n\u0004dY϶=ڵxҧêO\u001cԷ+[6\u0013fhR\u0013Yzf\u001c \u0016\u001b\u0002-CX\r7lgc\u0017x\u001cSi\u000eC/\u001a2 \u0006\u0007ݓ*ߒ\u001eݗɚ\u0003)ķ,#CV[L|\u000bbJPb.`p\u0007r\u0002\\S\"]\u0017H\rpC8Ts6d]\u0017Ws2ǃSؕ\u0006ʗڹH%Ж5`G\u001bE@#q.X\u001f\u000eZdzb8OY\u0015\u000eKD-tVm\u001e5Z<m\u0013\u0005d \u001cцNݭ0\u001d\u0016ıG\\>\u0005La:\u001eA7AHi3\u000f{P\u0006\u001e\tI9xRk%X\u0003;Ucכ\u0006܊oF{ق\u000b%5v} whA\u000eCl͚'\u0015\nhPԏi\u0012U\u0017a2h˨I\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u000e.3j\u001d./P7v7\"\u0013vH5\u001bc9<t1RL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "u(E", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "\u0018", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "", "1kX=", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "u(8", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "uH\u0018#", "\u0017", "2d]@\\;R", "5dc\u0011X5LW(\u0013", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "5qP=[0<aw~\u0004l0\f\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0014e(IV\u001d|\t=,\u0006\u00173t\u0014f\fDz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0014e(IV\u001d|\t=,\u0006\u00173t\u0014f\fDz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\tf\fDz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\tf\fDz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ";tc.g,=4\u001d~\u0002]:", "", "5dc\u001ah;:b\u0019}[b,\u0004\b=$\u0010,uM\u0001\u001e\u0017C}\u000e", "Adc\u001ah;:b\u0019}[b,\u0004\b=$\u0010,uM\u0001\u001e\u0017C}\u000e", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "=tc9\\5>", "5dc\u001ch;EW\"~9n0v\u0016/l\u007f$\n@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#g0Ft\u001a7M\u0019", "Adc\u001ch;EW\"~9n0v\u0016/l\u007f$\n@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~C\u000e/>q\u001f.#\u0007,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "@d]1X9\u001eT\u001a~xm", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "AgP=X", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "Adc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmkq>", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "Adc \\A>\u001b)\u0010\u000fR\n\u0002\u000f", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "BqP;f-H`!h\bb.\u0001\u0012", "5dc!e(Ga\u001a\t\bf\u0016\n\r1i\toiUe\u0017bC[", "Adc!e(Ga\u001a\t\bf\u0016\n\r1i\tou:`*\u000b%[", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "@db2g", "", "CoS.g,(c(\u0006~g,", "CoS.g,(c(\u0006~g,;\u00193_\r(\u0003@|%\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private int mutatedFields;
    private Outline outline;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.Companion.m4267getAutoNrFUSI();
    private long size = Size.Companion.m4014getUnspecifiedNHjbRc();
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    public final int getMutatedFields$ui_release() {
        return this.mutatedFields;
    }

    public final void setMutatedFields$ui_release(int i2) {
        this.mutatedFields = i2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f2) {
        if (this.scaleX != f2) {
            this.mutatedFields |= 1;
            this.scaleX = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f2) {
        if (this.scaleY != f2) {
            int i2 = this.mutatedFields;
            this.mutatedFields = (i2 + 2) - (i2 & 2);
            this.scaleY = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f2) {
        if (this.alpha != f2) {
            this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 4));
            this.alpha = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f2) {
        if (this.translationX != f2) {
            this.mutatedFields |= 8;
            this.translationX = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f2) {
        if (this.translationY != f2) {
            this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 16));
            this.translationY = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f2) {
        if (this.shadowElevation != f2) {
            int i2 = this.mutatedFields;
            this.mutatedFields = (i2 + 32) - (i2 & 32);
            this.shadowElevation = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo4363getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo4368setAmbientShadowColor8_81llA(long j2) {
        if (Color.m4179equalsimpl0(this.ambientShadowColor, j2)) {
            return;
        }
        this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 64));
        this.ambientShadowColor = j2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo4366getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo4370setSpotShadowColor8_81llA(long j2) {
        if (Color.m4179equalsimpl0(this.spotShadowColor, j2)) {
            return;
        }
        int i2 = this.mutatedFields;
        this.mutatedFields = (i2 + 128) - (i2 & 128);
        this.spotShadowColor = j2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f2) {
        if (this.rotationX != f2) {
            this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 256));
            this.rotationX = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f2) {
        if (this.rotationY != f2) {
            this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 512));
            this.rotationY = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f2) {
        if (this.rotationZ != f2) {
            this.mutatedFields |= 1024;
            this.rotationZ = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f2) {
        if (this.cameraDistance != f2) {
            this.mutatedFields |= 2048;
            this.cameraDistance = f2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ */
    public long mo4367getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setTransformOrigin-__ExYCQ */
    public void mo4371setTransformOrigin__ExYCQ(long j2) {
        if (TransformOrigin.m4563equalsimpl0(this.transformOrigin, j2)) {
            return;
        }
        this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 4096));
        this.transformOrigin = j2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        int i2 = this.mutatedFields;
        this.mutatedFields = (i2 + 8192) - (i2 & 8192);
        this.shape = shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z2) {
        if (this.clip != z2) {
            int i2 = this.mutatedFields;
            this.mutatedFields = (i2 + 16384) - (i2 & 16384);
            this.clip = z2;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI */
    public int mo4364getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo4369setCompositingStrategyaDBOjCE(int i2) {
        if (CompositingStrategy.m4263equalsimpl0(this.compositingStrategy, i2)) {
            return;
        }
        int i3 = this.mutatedFields;
        this.mutatedFields = (i3 + 32768) - (i3 & 32768);
        this.compositingStrategy = i2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo4365getSizeNHjbRc() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m4490setSizeuvyYCjk(long j2) {
        this.size = j2;
    }

    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    public final void setGraphicsDensity$ui_release(Density density) {
        this.graphicsDensity = density;
    }

    public final LayoutDirection getLayoutDirection$ui_release() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection$ui_release(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields = (-1) - (((-1) - this.mutatedFields) & ((-1) - 131072));
        this.renderEffect = renderEffect;
    }

    public final Outline getOutline$ui_release() {
        return this.outline;
    }

    public final void setOutline$ui_release(Outline outline) {
        this.outline = outline;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo4368setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo4370setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo4371setTransformOrigin__ExYCQ(TransformOrigin.Companion.m4569getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo4369setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m4267getAutoNrFUSI());
        m4490setSizeuvyYCjk(Size.Companion.m4014getUnspecifiedNHjbRc());
        this.outline = null;
        this.mutatedFields = 0;
    }

    public final void updateOutline$ui_release() {
        this.outline = getShape().mo621createOutlinePq9zytI(mo4365getSizeNHjbRc(), this.layoutDirection, this.graphicsDensity);
    }
}
