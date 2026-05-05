package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\":\u0012\u007f\u0007|jA0JqP.`\\2\u000fq{<$i*yCAU \u00038ޛme\u0018g\u001dI\u0013\nZOٙ\u0015\t\u00042Icxu%\u001f4Rom5]qM9\u000fwL\u0004N3ŕ<y\u000b\u0005*CN\u0010\u0005\u007f[^\u001c\u0014@@\u001f<b\u000f]\u0005H\u0015\u001c=N\u0002ɉ`gT:X\u0006c:=)\u001b|RP7_^~]\u000fVTU\u0010\r`L,Ë;5\u001b)c\u001c\rRiF\u001bR\u0002?\u0015hU);K\u0004Wd[\u0016\u0013C,̠\u0011]x*l\u001eW`\u001a/CbsM`\u000eVy\u000b}\u001d<2\u0011\u001c&v/ǉ\u001ef\u000e\u0012C\u000exSNY\u001aqR\u0002\u000bad\u00195\u0002C+g\u001e|P\u0010<ϭR7\u0002\tڟ\"#\u000fxilb x\u0015Ig(W?eX?^M8X\u0004о\u00049h\u0010?\u001c0u\u0016u\u0010aP%%OnI%1k0JTi\u0007\u0005\u000fkih\u0001Iغ&n\u001c;Ҋ\r\u0012bե|\u0007q[bd|3[!l\u001a\u000e\n# \u000byL#5\u0010|R~h\u0019Nύ\u000e%5jƠ]tsލo;d@C]42oX\u000f'O>r\u0005\u0007hRU\u001cZ\u000b+81vkݻ{{JRܟ\u00178Gڤ462?'hej\u0011%ZT\r\u000boZ\u0017\u0012\u000fVC$1l:s7\u0002˩`puk֑M2\u0005ʠ:/G`C%vw0pL\u00103\t\u000fs.IwNWL\u001b\u0019\fT*!ک\u001e9W3ˮ\u0017\u0015\u0007ǻJ\u00043UZ~6s[\u001b?\u000e\r{\u001f;\u00170w\nzpZc\u0001I}UЂ&vdvן\fj\bטyH\u0001Xq`ߕ_V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "", "=m3<a,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkBta6Yv|", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=m6<", "=m=2k;", "=m??X=B])\r", "=mB2T9<V", "=mB2a+", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\\\H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6O\n\u0011<n\u0014Rk!\bc\n\u001du]Q0$E@\u001dHY-V|G\fw#k\u0011Y8x\"", "5dc\u001ca\u000bH\\\u0019", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc\u001ca\u000eH", "5dc\u001ca\u0015>f(", "5dc\u001ca\u0017KS*\u0003\u0005n:", "5dc\u001ca\u001a>O&|}", "5dc\u001ca\u001a>\\\u0018", "3pd._:", "", "=sW2e", "6`b566=S", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final Function1<KeyboardActionScope, Unit> onDone;
    private final Function1<KeyboardActionScope, Unit> onGo;
    private final Function1<KeyboardActionScope, Unit> onNext;
    private final Function1<KeyboardActionScope, Unit> onPrevious;
    private final Function1<KeyboardActionScope, Unit> onSearch;
    private final Function1<KeyboardActionScope, Unit> onSend;

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(Function1<? super KeyboardActionScope, Unit> function1, Function1<? super KeyboardActionScope, Unit> function12, Function1<? super KeyboardActionScope, Unit> function13, Function1<? super KeyboardActionScope, Unit> function14, Function1<? super KeyboardActionScope, Unit> function15, Function1<? super KeyboardActionScope, Unit> function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    public /* synthetic */ KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : function1, (2 & i2) != 0 ? null : function12, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : function13, (8 & i2) != 0 ? null : function14, (16 & i2) != 0 ? null : function15, (i2 + 32) - (i2 | 32) == 0 ? function16 : null);
    }

    public final Function1<KeyboardActionScope, Unit> getOnDone() {
        return this.onDone;
    }

    public final Function1<KeyboardActionScope, Unit> getOnGo() {
        return this.onGo;
    }

    public final Function1<KeyboardActionScope, Unit> getOnNext() {
        return this.onNext;
    }

    public final Function1<KeyboardActionScope, Unit> getOnPrevious() {
        return this.onPrevious;
    }

    public final Function1<KeyboardActionScope, Unit> getOnSearch() {
        return this.onSearch;
    }

    public final Function1<KeyboardActionScope, Unit> getOnSend() {
        return this.onSend;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.onDone == keyboardActions.onDone && this.onGo == keyboardActions.onGo && this.onNext == keyboardActions.onNext && this.onPrevious == keyboardActions.onPrevious && this.onSearch == keyboardActions.onSearch && this.onSend == keyboardActions.onSend;
    }

    public int hashCode() {
        Function1<KeyboardActionScope, Unit> function1 = this.onDone;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<KeyboardActionScope, Unit> function12 = this.onGo;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function13 = this.onNext;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function14 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function15 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function16 = this.onSend;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    /* JADX INFO: compiled from: KeyboardActions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}ٛ\u0016\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u0015\"\nX~2CUR6e(", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "5dc\u0011X-:c \u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7{.a@EgA\u001dpfp=\u0011l:$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        private Companion() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }
    }
}
