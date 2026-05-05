package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4G\u0007\"B\u0012\u007f\u0007|jA0ZeP\u008cX\t@ş\n\u0003d$\n#*CB]Z\u000b(\u000b_Rug\u0007J\t\fß\u0013\u0006$z;CWU\u0011]@\u0010h\bņC?UڎM;fwD\t84(=\b\u000bВ\u0019+Q\u001a\u0002ڂGW"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "", "1`]\u0019b(=A-\bxa9\u0007\u00129u\u000e/\u0010", "", "uY\u0018#", "5dc\u0010T5%]\u0015}hr5z\f<o\t2\fN\b+UCx\u0017F\u0006!D]\b)E", "u(E", "5dc\u0010T5%]\u0015}hr5z\f<o\t2\fN\b+", "u(I", "\u0011n\\=T5B]\"", " db<_=>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\u0002'7J\u0012<MB\u001cu=-udi=\u000ew\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~@\b\u001c6m\u0015\u000fWLJL0&\u0019ou\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~G\u0012.Fm\u001e\u000fWLJL0&\u0019ou\u000f", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;
    public static final Companion Companion = new Companion(null);
    private static final SystemFontFamily Default = new DefaultFontFamily();
    private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    public /* synthetic */ FontFamily(boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    private FontFamily(boolean z2) {
        this.canLoadSynchronously = z2;
    }

    /* JADX INFO: compiled from: FontFamily.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{J$cҕyCQU\"}(\tWN}gvϺ`\u007fYƤ6\u0016'it]cxu\u0012=3rsM5eok<'Ӂtӯ$20<BE\u000f\u001fBN x\u000bCy\u000b@6px@R\u001bO\u001d\u001c(\u0005l#1$bg\\=`l\fB_)\tiPW?_^\u0007}\u0013LT5\u0018\u000faL7\u0007[Æ\u0014Ǭ٨\u0007\tXhM\u0011Ӎp<\u0014ڋ&&ǥI~_9^þ0C*W\u000fc\u0012T[ԍUpа+*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "", ">qT9b(=", "", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u001brp@\u000bluL\u00014Q\\]0eR\u0001\u0007q\u001cc\u001dR4\u001d\u0001hE.w\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "@db<_=>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "@db<_=>\u001bwixj\u0016\\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0006cJ38%A(\u0017\u001eI\u0006=k\u0010ayqxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bRr3s\u0010g\u001d&(I #qn", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOX4,\u001for9\u0014G4Y}|", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Resolver {
        Object preload(FontFamily fontFamily, Continuation<? super Unit> continuation);

        /* JADX INFO: renamed from: resolve-DPcqOEQ */
        State<Object> mo6208resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3);

        /* JADX INFO: renamed from: resolve-DPcqOEQ$default */
        static /* synthetic */ State m6207resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
                fontFamily = null;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i4 + 4) - (4 | i4) != 0) {
                i2 = FontStyle.Companion.m6240getNormal_LCdwA();
            }
            if ((i4 & 8) != 0) {
                i3 = FontSynthesis.Companion.m6250getAllGVVA2EU();
            }
            return resolver.mo6208resolveDPcqOEQ(fontFamily, fontWeight, i2, i3);
        }
    }

    /* JADX INFO: compiled from: FontFamily.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?7JͣIDɟ\u0004*=j<9*[ҸuCIUj\r0\ngN\u0016iĔN`\u0013¼'\b\u001c{x0\u001ad\u0007b*\u000f`HņC9UڎU;f{D\rpA0A\u0012\u0005/\u001cݵL\u0016~ٙ[M\u0012\u001c>DAI`\u0018e\u0005H\u0014ĂB&\tȦtiTBVp.I=0\u001bipPϮc6\u0005ձ%HZ5\u001bzҖ\":"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0011ta@\\=>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~;})7z\u001a,.MDz\u0015\u001a\u001dlhM\\", "5dc\u0010h9LW*~", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u00027v\u0016;QA\u001cu=-udi=\u000ew\u0002", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~G\u0012.Fm\u001e\u000fWLJL0&\u0019ou\u000f", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u000eK{%.U$EtC~\u0011pe@\u001b9", "\u001bn]<f7:Q\u0019", "5dc\u001ab5Ha$zx^", "!`]@F,KW\u001a", "5dc T5LA\u0019\f~_", "!da6Y", "5dc X9BT", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018T\u0011HvxTgjV8\u007fb)E\u000epT\n;Dp\re6T}*[y%tqZk\u0010\r@wxT-Gy'iQG")
    @InterfaceC1492Gx
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }
}
