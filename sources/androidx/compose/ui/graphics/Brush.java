package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u0006\u0007nj?0Le^.Zݷ2\u000fy\u0001<$a%yCQU\"}8\tWȞm\u001d\u0005Ϻx\u001as\u000f4\u00151i;\nZ~_ܫ\u00132Po\b[[uU9\u000f{f\t.::8(\u00071\u001e8Q(v)M{\u0010 ;Xph^Sqơ\u0019ŇĂB\"\u0007+ju\u001fPVmu:]%YݚDŰ&ڿޗ{LϘJ\\/\r\u0005f6-F:C\u0019ǯR\u0003\u0017c¼?\fGtCݽ\u0005U&3Iyv͕\\\u0012"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "", "u(E", "7mc?\\5LW\u0017l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0016a;KW\"\r~\\\u001a\u0001\u001e/-h\u000bCE}\u0004\u0015", "u(9", "\u0018", "/o_9l\u001bH", "", "Ahi2", ">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "/k_5T", "", "/o_9l\u001bH\u001b\u0004\u000bNs@\fl", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001c;v%\u0004.\u0007,", "\u0011n\\=T5B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zr;]Q>A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#c\u0005$6K 5WP\u0011", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Brush {
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public abstract void mo4125applyToPq9zytI(long j2, Paint paint, float f2);

    private Brush() {
        this.intrinsicSize = Size.Companion.m4014getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4126getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    /* JADX INFO: compiled from: Brush.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":!\u007f\u0007|jA0RjP.hS2\u000fq|<$q$yCAV\"}0'WNmhvJp\u000bK\u000f\f'~̚-_ǁ)]@\u000erGu?ݯQoK9)OD\u000682P:*-\u000f\u001dB\\ \u0007\u0001B[\u0018\"2PphX\u001dO\u0015\u001a@\rl%/\"|s^8Xl\f@?%\u0013ipUUd`\u0003S\rT\\?\r%gN1F7C\u001e=S1\r\u0003aE\u0003M{U\u0005\u00172m0˗rɎ͏\\\u0002\u001a!9\\U\u001a\u0001't\u0005\u007fb<19]{Q`\u00108w)\u0003;K4\u0014\f'V6E\u001a\u0015\u000e>9zraIh\u0002\rH0\u0001g6%/\u00183YDakј`ݢϭR9\u0002\u0011\u001b.k[|2sT<bECbziEaPCG^\u0016i?}\u0004\u001fh\u0012,\u00140u\u0007]\u0001?271G]I#Oq\u0012JTg%\f\u000fm\u0004oXHN4\u0007\u0016e=9\u0012`Dr\u0019\u0004P\u0003k\\\u0017S\u001cb\u0011\u0016\bA+#|͌ طŎRQn~xc&F3@~7\bp\u001c\u0018eGv9ESs\u0010\u0010Y%#oBh\u0005fxZS:m\r.(2V~(w*W~\u0012\u00192M{44Z<_aŢGґٿFC\u0003\u001emq1j\rlK$1kT\u001d\u0017\u0004hp\u0001\u007fmwY8\rb2-oWE\u001b6UPob\u0002Q\u000b\u001f\u007f\u0010IwLuR|\u0018\u0006U*'D\u001fiW5=!(\u0017)`\u0015]KRrske\u0012U\u0001-\u007f\u0015;v8\u007f\b\u0019{re˽I֢ݚ\u001b$|y\u0001?P!\u000e\u0012yF)I\u0014^\u0019iVO\u0003\u0005i<|?+\u0014O$+\u0001};\u00155[VW#\u001cw\"I-a\fo 4\u007fb\u001d0\re27*\u001bͪaГЄ6=>dg\u001c\u0007h2\u000b\u001bBvl(0P\fL!CXGc\u0001bHO\u001b/,l\u0017.\u001dp\u0005bh\u0018\u001e\u0002T:o,\u0004C,\u001anE5\u0011{Z\u0016r\u001eQb\u000bX(\"\u000b*D5\u0017Ћ<ղݫ[d\u000fO\u0014\u0014`^OYz\u0005j\u000bT>:J \u0011SVy\u0006>\u0002.U\u0010\u0015\u001d2P\rSV<g?aȀGγޝIb'I\u000f W\u000e,\u001bM13ov|=fJ\u0015c-\u000f\u001az[\u000fh5+rZI\u001d8X/\u0012sbqM\"B\u0014I9m\u001au\u001c:(|KIF iW\u0017_\u0005Sv\u000b\u0004j~j|\u0012tvf\"W\u0005+\u0003\u0014<\u0018\u0019#\u0019}}6gЛKϕߺ;E &%QqC\u001a\u001f{FI/6?;Kap$)\fW\u0002B,\u0017P&-\u0004\u0003DtW<l:c!:$\u0016.b0\u000fCV&\u0004<T\rr89N;җ\u0001֯ě\u0017`_\u0011\u00061̻'0t\tHƐ\u0005'\tʑp\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:,s8UN7t8(\u001e>", "", "u(E", "6na6m6Gb\u0015\u0006\\k({\r/n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "1n[<e\u001aM]$\r", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "AsP?g\u001f", "3mS%", "Bh[2@6=S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$]\u0005 \u001fw\u0015.#", "6na6m6Gb\u0015\u0006\\k({\r/n\u000foN\u001cHd\u0019$>", "uZ;8b;EW\"HeZ0\n^\u0010Fckb<\n\u0016$Qs\rO@#?a\t*Em_>Q\r=x0)\u0018l_GP@9^\u0005*\u001d", "1n[<e:", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;`\t_\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu+\u00047UO$", ":h]2T9 `\u0015}~^5\f", "AsP?g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "3mS", ":h]2T9 `\u0015}~^5\fP7H\u00047\u0011\"\u0007", "uZ;8b;EW\"HeZ0\n^\u0014Jckb<\n\u0016$Qs\rO@#?a\t*Em_>Q\r=x0)\u0018l_GP@9^\u0005*\u001d", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;d\r_\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu+\u00047UO$", "@`S6T3 `\u0015}~^5\f", "1d]AX9", "@`S6h:", "@`S6T3 `\u0015}~^5\fP\u001a_p;C&\u000f", "uZ;8b;EW\"HeZ0\n^\u0014Fckb<\n\u0016$Qs\rO@#?a\t*Em_>Q\r=x0)\u0018l_GP@9^\u0005*\u001d", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;d\t_\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu+\u00047UO$", "AvT2c\u000eKO\u0018\u0003zg;", "AvT2c\u000eKO\u0018\u0003zg;Dx@8\u000brd\u001c", "uZ;8b;EW\"HeZ0\n^\u0014)f$\u0005?\u000e!\u001bF\u0003W:\u0001-@c\f \u0001}\u001awOP7v7\"\u0013v+\u0016\u0014s:QL", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;dkb<\n\u0016$Qs\rO@#?a\t*Em_>Q\r=x0)\u0018l_GP@9^\u0005*\u001d", "DdaA\\*:Zz\fv]0|\u0012>", "AsP?g ", "3mS&", "DdaA\\*:Zz\fv]0|\u0012>-R\u0004C\u000e\u0003se", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default */
        public static /* synthetic */ Brush m4130linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j2, long j3, int i2, int i3, Object obj) {
            if ((i3 + 2) - (2 | i3) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((4 & i3) != 0) {
                j3 = Offset.Companion.m3951getInfiniteF1C5BW0();
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4140linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j2, j3, i2);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk */
        public final Brush m4140linearGradientmHitzGk(Pair<Float, Color>[] pairArr, long j2, long j3, int i2) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m4168boximpl(pair.getSecond().m4188unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList3.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList2, arrayList3, j2, j3, i2, null);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default */
        public static /* synthetic */ Brush m4129linearGradientmHitzGk$default(Companion companion, List list, long j2, long j3, int i2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                j3 = Offset.Companion.m3951getInfiniteF1C5BW0();
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4139linearGradientmHitzGk((List<Color>) list, j2, j3, i2);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk */
        public final Brush m4139linearGradientmHitzGk(List<Color> list, long j2, long j3, int i2) {
            return new LinearGradient(list, null, j2, j3, i2, null);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default */
        public static /* synthetic */ Brush m4127horizontalGradient8A3gB4$default(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 + 2) - (2 | i3) != 0) {
                f2 = 0.0f;
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4137horizontalGradient8A3gB4((List<Color>) list, f2, f3, i2);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4 */
        public final Brush m4137horizontalGradient8A3gB4(List<Color> list, float f2, float f3, int i2) {
            return m4139linearGradientmHitzGk(list, OffsetKt.Offset(f2, 0.0f), OffsetKt.Offset(f3, 0.0f), i2);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default */
        public static /* synthetic */ Brush m4128horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                f2 = 0.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4138horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f2, f3, i2);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4 */
        public final Brush m4138horizontalGradient8A3gB4(Pair<Float, Color>[] pairArr, float f2, float f3, int i2) {
            return m4140linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), OffsetKt.Offset(f2, 0.0f), OffsetKt.Offset(f3, 0.0f), i2);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default */
        public static /* synthetic */ Brush m4135verticalGradient8A3gB4$default(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 + 2) - (2 | i3) != 0) {
                f2 = 0.0f;
            }
            if ((4 & i3) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4145verticalGradient8A3gB4((List<Color>) list, f2, f3, i2);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4 */
        public final Brush m4145verticalGradient8A3gB4(List<Color> list, float f2, float f3, int i2) {
            return m4139linearGradientmHitzGk(list, OffsetKt.Offset(0.0f, f2), OffsetKt.Offset(0.0f, f3), i2);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default */
        public static /* synthetic */ Brush m4136verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((2 & i3) != 0) {
                f2 = 0.0f;
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4146verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f2, f3, i2);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4 */
        public final Brush m4146verticalGradient8A3gB4(Pair<Float, Color>[] pairArr, float f2, float f3, int i2) {
            return m4140linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), OffsetKt.Offset(0.0f, f2), OffsetKt.Offset(0.0f, f3), i2);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default */
        public static /* synthetic */ Brush m4132radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j2, float f2, int i2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                j2 = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            if ((4 & i3) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4142radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j2, f2, i2);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks */
        public final Brush m4142radialGradientP_VxKs(Pair<Float, Color>[] pairArr, long j2, float f2, int i2) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m4168boximpl(pair.getSecond().m4188unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList3.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList2, arrayList3, j2, f2, i2, null);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default */
        public static /* synthetic */ Brush m4131radialGradientP_VxKs$default(Companion companion, List list, long j2, float f2, int i2, int i3, Object obj) {
            if ((i3 + 2) - (2 | i3) != 0) {
                j2 = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            if ((4 & i3) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                i2 = TileMode.Companion.m4551getClamp3opZhB0();
            }
            return companion.m4141radialGradientP_VxKs((List<Color>) list, j2, f2, i2);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks */
        public final Brush m4141radialGradientP_VxKs(List<Color> list, long j2, float f2, int i2) {
            return new RadialGradient(list, null, j2, f2, i2, null);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default */
        public static /* synthetic */ Brush m4134sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j2, int i2, Object obj) {
            if ((i2 + 2) - (i2 | 2) != 0) {
                j2 = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            return companion.m4144sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j2);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA */
        public final Brush m4144sweepGradientUv8p0NA(Pair<Float, Color>[] pairArr, long j2) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m4168boximpl(pair.getSecond().m4188unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList3.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(j2, arrayList2, arrayList3, null);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default */
        public static /* synthetic */ Brush m4133sweepGradientUv8p0NA$default(Companion companion, List list, long j2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            return companion.m4143sweepGradientUv8p0NA((List<Color>) list, j2);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA */
        public final Brush m4143sweepGradientUv8p0NA(List<Color> list, long j2) {
            return new SweepGradient(j2, list, null, null);
        }
    }
}
