package androidx.activity;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\"B\u0012\u007f\u0007|jA0RnP.X^@ş\n\u000fd$\n#*BN\u0016K\u0004\"\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fOAQ\bIIb\u000563&B$Hy3\bH/Н\u0014v\tK\u0014\u001f >XphS=Q\u0013)*\u0006l'GȦ֔kN<X5pH@;\u0003\u0018C~+m?\u0015M;M\u001b܋˼za$=\u0011IC\u0017=S1\b)ºAƄCwEݛ\u0001)-4W}(Tf\u0004,!;Q\u001d]!,l\u0007a`:.YT:֠Rˎ,}\u0003Ԉ%>\n\u0019\u00143\u0019:;\u001a~\b<4KɄUĖT\u0002fۍP\ro9/%.4\u0002ݎ\u001dƻUgCϊf9\u0002\u0012\u001b(ũ\u0005\u0003"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qiT\u000f&\u0017OL\nId4I`}u", "", ":hV5g\u001a<`\u001d\u0007", "", "2`a8F*KW!", "<hV5g\u0014HR\u0019", "2dc2V;\u001dO&\u0005bh+|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "", "uH8\u0016?2Hb \u0003\u0004(1\u000e\u0011xf\u00101yO\u0005! U9nL\u007f#D]\b)\u0003CY\u001f", "5dc\u0011T9DA\u0017\f~fjx\u0007>i\u0011,\u000bTz$\u0017No\nJv", "u(8", "5dc\u0011X;>Q(]vk2d\u0013.e>$yO\u0005(\u001bV\u0004\bIv,5U\f ", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc\u001b\\.Ab\u0001\ty^jx\u0007>i\u0011,\u000bTz$\u0017No\nJv", "5dc V9B[", "7r3.e2", "5dc V9B[Wzxm0\u000e\r>yy5{G\u0001\u0013%G", "5dc V9B[\u000b\u0003\na\f\u0006\n9r}(z\u001e\u000b &Tk\u001cK", "5dc V9B[\u000b\u0003\na\f\u0006\n9r}(z\u001e\u000b &Tk\u001cK5!3h\u00021;|*(ZCBk0,\u0015", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final Function1<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public /* synthetic */ SystemBarStyle(int i2, int i3, int i4, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, function1);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i2, int i3) {
        return Companion.auto(i2, i3);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i2, int i3, Function1<? super Resources, Boolean> function1) {
        return Companion.auto(i2, i3, function1);
    }

    @JvmStatic
    public static final SystemBarStyle dark(int i2) {
        return Companion.dark(i2);
    }

    @JvmStatic
    public static final SystemBarStyle light(int i2, int i3) {
        return Companion.light(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i2, int i3, int i4, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i2;
        this.darkScrim = i3;
        this.nightMode = i4;
        this.detectDarkMode = function1;
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final Function1<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    /* JADX INFO: compiled from: EdgeToEdge.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljA0ZeP.hS2\u000fy\u0005<$a&w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fNF\u0007kDI\u0004z\u000e\u0018\u00151PrW3{sm?fsD\n82P<*\u0017\u0007\u001a8N(\u0003\u000bE[\f@8PrJR;V3!X\u000b\u00070\u000f(tg|8xrc9=.\u001bipRmdx\u0017[\u0019^TU\u000f'g$*NBM\u0015SW3\rXZM\bWqk\t/,ݹ/V"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qiT\u000f&\u0017OL\nId4I`}^\u0015w\u001e9IL?u=s", "", "u(E", "/tc<", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qiT\u000f&\u0017OL\nId4I`}u", ":hV5g\u001a<`\u001d\u0007", "", "2`a8F*KW!", "2dc2V;\u001dO&\u0005bh+|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "", "2`a8", "Aba6`", ":hV5g", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SystemBarStyle auto(int i2, int i3) {
            return auto$default(this, i2, i3, null, 4, null);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i2, int i3, Function1 function1, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                function1 = new Function1<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Resources resources) {
                        Intrinsics.checkNotNullParameter(resources, "resources");
                        int i5 = resources.getConfiguration().uiMode;
                        return Boolean.valueOf((i5 + 48) - (i5 | 48) == 32);
                    }
                };
            }
            return companion.auto(i2, i3, function1);
        }

        @JvmStatic
        public final SystemBarStyle auto(int i2, int i3, Function1<? super Resources, Boolean> detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i2, i3, 0, detectDarkMode, null);
        }

        @JvmStatic
        public final SystemBarStyle dark(int i2) {
            return new SystemBarStyle(i2, i2, 2, new Function1<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Resources resources) {
                    Intrinsics.checkNotNullParameter(resources, "<anonymous parameter 0>");
                    return true;
                }
            }, null);
        }

        @JvmStatic
        public final SystemBarStyle light(int i2, int i3) {
            return new SystemBarStyle(i2, i3, 1, new Function1<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Resources resources) {
                    Intrinsics.checkNotNullParameter(resources, "<anonymous parameter 0>");
                    return false;
                }
            }, null);
        }
    }

    public final int getScrim$activity_release(boolean z2) {
        return z2 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z2) {
        if (this.nightMode == 0) {
            return 0;
        }
        if (z2) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }
}
