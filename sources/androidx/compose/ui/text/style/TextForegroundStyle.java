package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4C\u0007\"B\u0012\u007f\u0007lkA0ZeP.XV2\u000f\u0002{<$a%w\"Q٥8\u000eR\t}M g~[#\u0019Q\u001b\u001e\u0016'̓\\Mc\u0006u\u0012=˰\t\u0004\bG[}U9\u000fҚf\u000f.?:>\n\u0007\u0011\u001aXϺ>\u0006AW\u001c\u001c 0XphSc̆\u0007ܨ\u0016\nV\"\u0007 jj\u001fHVpu<E\"1n\u0019Ğ)ۢ4\u0001e\u000fLZ5\u0014Gw,3X7c\u001e{٬\u0005\u008fQ¹У\u0002>џA\t\u0001)-5W~ˇ5Xß\u0014$3R\u0013ǀ\u000fT[\rQf+/-U\u0003yO˔,\n߿\u007f\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,$", "", "/k_5T", "", "5dc\u000e_7AO", "u(5", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "5dc\u000fe<LV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", ";da4X", "=sW2e", "B`Z2B9\u001eZ'~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u0011n\\=T5B]\"", "#mb=X*BT\u001d~y", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    float getAlpha();

    Brush getBrush();

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    long mo6425getColor0d7_KjU();

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.TextForegroundStyle$merge$1 */
    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,n\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Float> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(TextForegroundStyle.this.getAlpha());
        }
    }

    default TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        if (!z2 || !(this instanceof BrushStyle)) {
            if (!z2 || (this instanceof BrushStyle)) {
                return (z2 || !(this instanceof BrushStyle)) ? textForegroundStyle.takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle.merge.2
                    AnonymousClass2() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final TextForegroundStyle invoke() {
                        return TextForegroundStyle.this;
                    }
                }) : this;
            }
            return textForegroundStyle;
        }
        return new BrushStyle(((BrushStyle) textForegroundStyle).getValue(), TextDrawStyleKt.takeOrElse(textForegroundStyle.getAlpha(), new Function0<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle.merge.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(TextForegroundStyle.this.getAlpha());
            }
        }));
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.TextForegroundStyle$merge$2 */
    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<TextForegroundStyle> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextForegroundStyle invoke() {
            return TextForegroundStyle.this;
        }
    }

    default TextForegroundStyle takeOrElse(Function0<? extends TextForegroundStyle> function0) {
        return !Intrinsics.areEqual(this, Unspecified.INSTANCE) ? this : function0.invoke();
    }

    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00106B\u0005#4\u0012\u000e\u0007nj?1Le^.ZS0\u0010qۜ4:ӋTqq:\u0016\u001f\u0004\"\u07beSNug?\\h\f[\u000f4\u0018/?\u0003ֆWޯa\u0016'4HrM7\u001e\u0004K>xvL\u0004N8X\rPڥ\u0003ʀ.L(x\u0001JY\u0014bHNyRR;W;nhö@ơ\u007fȦתfMɇLpu<5.\u0011uĬN0g3\u0003֓)tS/\r|\u0001ԅ/M"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,\rf0UWN*`Sv=\u0013g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,$", "u(E", "/k_5T", "", "5dc\u000e_7AO", "u(5", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "5dc\u000fe<LV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: getColor-0d7_KjU */
        public long mo6425getColor0d7_KjU() {
            return Color.Companion.m4214getUnspecified0d7_KjU();
        }
    }

    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG5L͜P.hS2\u000fq|:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#!Q\u0010\u001e\u0016'l\\Oc{u\u0014%1pso7[tU9\u000fz~\u001b.3:8(\u00071\u001e8O(v)Kǰ\u000b۵ضDr@[\u001bWī\u001a\u0017\u000eA&ӗ:\u000bfߗ:S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,\rT1OWJ5`\\{\u0013", "", "u(E", "4q^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,$", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "4q^: ~8&d\u0006\u0002:", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@3Dm\u0005 \u0001\\\u0016A\\$Ex4 \"rqB\u0006Q;b}'\u001d", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: from-8_81llA */
        public final TextForegroundStyle m6548from8_81llA(long j2) {
            return j2 != 16 ? new ColorStyle(j2, null) : Unspecified.INSTANCE;
        }

        public final TextForegroundStyle from(Brush brush, float f2) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m6548from8_81llA(TextDrawStyleKt.m6547modulateDxMtmZc(((SolidColor) brush).m4513getValue0d7_KjU(), f2));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f2);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
