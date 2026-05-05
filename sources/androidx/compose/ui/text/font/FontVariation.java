package androidx.compose.ui.text.font;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: FontVariation.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG5L͜P.hS2şs{J$cҕyCQU\"Ԃ*\t]]ogtKb\u000bQ\u0015\u000e\u0016~k4Ikxe\u0012\u00158Hū?Iݹ =g_-9\u0006;N??:\n\u0007\u001aݵL\u0010\u0005z\f_\u001a\u0013H@\u001f<\u0003\u0011[\b2\u00124BP\u0005,a\u007fNdN5\u0010H6;\u0003\u0018J~+m9\u0015M;P\u0005+\u001b\u0002y\u001eYLgE#2k\u000b\u0017Va>\u0013? ?3vG'YK؎V̬ݼ\u0004\u0016\u001b:]\u001d&~4m\u001dQ\u000f\u000eW/]hcP<:@\u0007\n T\u0004<\bWL<22f6\u0014{\u000b\u0001gXP0`r\u0004\tvN\u0017S\u0016Ɗ*ݍӸjSgR'f\u007f\b\u0013&6#/pQ_b\u0013x\u0015IZ@]?ZX=vP:]Kr\u001cp\u0011\u0014r\u0010>a\u0018/*\u0013^\u001b3<s9Q'Ȁ\u0002MLj|ݵ|\u0017R\u05c8Vf"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'j", "", "u(E", "!dcA\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PL", "<`\\2", "", "D`[BX", "", "!dcA\\5@a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "EdX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "AdcA\\5@a", "", "!dcA\\5@a`OZP\b\tw\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>z\n\u0002\u000bO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125Xr7u\u0005\b%\u0012?s/0V\u001fV}\u001ew\u0017lOBb^\u0007QEDusb\u0016g(fH:m$ub*hc=S|]\u001a\u0002\u001cZqpV\nvE(:|_PN.C<\u00046#T}\u0006g", "5qP1X", "", "7sP9\\*", "=oc6V(EA\u001d\u0014~g.", "BdgAF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "=oc6V(EA\u001d\u0014~g.DP\u001c2r\"LJ", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=>?Ho0-\u0019rjwtc;]z0I\"", "AkP;g", "EhSA[", "!dcA\\5@4 \tvm", "!dcA\\5@7\"\u000e", "!dcA\\5@B\u0019\u0012\nN5\u0001\u0018", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    /* JADX INFO: compiled from: FontVariation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\":\u001b\u007f\u0007lkA0RjP\u008cZS@\u000fs{J$c$\bCCU0}*ޛUD}˧\u001fJ\t\n\f\u001f\u0014\u001e\u0011jZR\u0006~k\u001c'4Xnm>\u0014\u0014\u000eIntN\u0005N3xا{ڱ\u0005\u001eBJ\u0016x\tF\u001c\u001c 4XphWc̆\u0007ܨ\u0016\nV\"\u0007$jnޱ5IxjHȻ\"Ʌ݆BR/a6\u001c{\fШX6̚z`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PL", "", "/wX@A(FS", "", "5dc\u000ek0L<\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dT1f\u000b>\\'\u0003\nr", "", "5dc\u001bX,=aw~\u0004l0\f\u001d", "u(I", "BnE.e0:b\u001d\t\u0004O(\u0004\u0019/", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PW.QH]\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PZ0V\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5Pe'Z[>5`aH", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    private FontVariation() {
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u00158\u000bDB\u0007\"2\u0012\u007f\u0007tsA0JeP.`q2\u000fq~<$i*yّAZ0ԂR\t}M(~~Zh\u000b[\u0017\u0016\u001a~i<I\u0004z\f\u0013/2pqУ7M}@\u0002q\u0003A\u001d `'h\u007f\u0013\r2,^\u000f%y\nƎ\fZ6N}RR;[K.b\u0018L$\u0019\u001e\u000bl%ȥJǰa@7݊\u001bkHT5f\u0001\u0012[\r^Z7\u000f\u0007aL-n?߱\u0019+[Έ\u001fTaH\u0011IѥA\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "", "AdcA\\5@a", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PL", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001fIP?gC\"\u001fq '\u0007r;R\u007f)\u001d\u0010?", "<dT1f\u000b>\\'\u0003\nr", "", "5dc\u001bX,=aw~\u0004l0\f\u001dmu\u0004\"\u000b@\u0014&\u0011To\u0015<r35", "u(I", "", "5dc X;MW\"\u0001\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "3pd._:", "=sW2e", "6`b566=S", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z2 = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = (List) new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(("'" + str + "' must be unique. Actual [ [" + CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST).toString());
                }
                CollectionsKt.addAll(arrayList, list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (((Setting) arrayList2.get(i2)).getNeedsDensity()) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            this.needsDensity = z2;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && Intrinsics.areEqual(this.settings, ((Settings) obj).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r'4\u0012}\tnjG9LeN2ZS8şsڔ<$i*yCAV\"}8\tWȞmh\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:M1@/Py3\tJ0V\u001e\u000f|YJ:!vϢp\u0003X\u001b]\u001d\u001a@\u0017\u00054I$jyf6vm$Nw3\u0011|ZNUb`\u0003[!^V=\f%vd?\u0011IC\u0015=S1\b)ÐAƄCwEݛ\u0001)-0Wy(Hf\u0007,\u0015YWcƵ5͉`\u000bYӠ$)1XqU!\u001d6y\u0013{;?Ǭ\u0012\f/ΞF/ q\u0016\u001a߀x\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PW.QH]\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PL", "/wX@A(FS", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\\u0004q", "5dc\u000ek0L<\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dT1f\u000b>\\'\u0003\nr", "", "5dc\u001bX,=aw~\u0004l0\f\u001d", "u(I", "5dc#T3NS", "u(5", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "BnE.e0:b\u001d\t\u0004O(\u0004\u0019/", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f2) {
            this.axisName = str;
            this.value = f2;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        public final float getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return Intrinsics.areEqual(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4\u0012}\tnjG9LeN3ZS8şsڔ<$i*yCAU\"}0\u000eWȞog\u0005JbŏI\u0010\u001cǝ)jZH\u0016\fm\u0016\u001d2Zom4]sK;xtd\bڶ6\"F}M\u0012(8`\u0010%\u0003sQ\u001a!HB\u00079\u0001\u001d\u0014Ŀ\u001aZ\fL1\u0019\u001e\u000by\u0015J\u0011rkMG#1j\tboo>\u0011e\rtiW\u0013\u0005w6-V6c,kgS\u0019`[W\u0003mr\u0014ݲjҊ+1Q֕o8^\u0005\"\u001b{a\u001bd\u000b&\u000b\r(ӷNˏ/Uk֟h\u0010.\u0001\t\u0006]S\u0012\u0010\u001e'v1ȟ\u0019Ǒܕ\r2Ϣv[HP\u0010kZ\u0002\u0001lD#Ӟ\u007f<3<!ƺm\u0010:!N=\u001b̅\u00116"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5Pe'Z[>5`aH", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PL", "/wX@A(FS", "", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u0007!&Ns\u0017\u0006{6=#\u0002)Fm#7IJ\u0005J4\u001f\u0011xhHdm5\\\u00064WJ]6i:nJ\u001a\u0012gc\u0012\u001c", "5dc\u000ek0L<\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dT1f\u000b>\\'\u0003\nr", "", "5dc\u001bX,=aw~\u0004l0\f\u001d", "u(I", "5dc#T3NS`qh:\u0010`}\u000f", "u(9", "\u0018", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "BnE.e0:b\u001d\t\u0004O(\u0004\u0019/", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        public /* synthetic */ SettingTextUnit(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2);
        }

        private SettingTextUnit(String str, long j2) {
            this.axisName = str;
            this.value = j2;
            this.needsDensity = true;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        /* JADX INFO: renamed from: getValue-XSAIIZE */
        public final long m6257getValueXSAIIZE() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density == null) {
                throw new IllegalArgumentException("density must not be null".toString());
            }
            return TextUnit.m6831getValueimpl(this.value) * density.getFontScale();
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return Intrinsics.areEqual(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m6828equalsimpl0(this.value, settingTextUnit.value);
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m6832hashCodeimpl(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m6838toStringimpl(this.value)) + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r(4\u0012}\tnjG9LeN2ZS8şs{:%c$\u007fHC٥\"}8\tWȞmh\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:M1@/Py3\tJ0V\u001e\u000f|YJ:!vϢp\u0003X\u001b]\u001d\u001a@\t\u00054I$jxf6vm$Nw3\u0011{ZNUr`\u0003[!^V=\f%vd?\u0011IC\u0015=S1\b)ÐAƄCwEݛ\u0001)-0Wy(Hf\u0007,\u0015YWcƵ5͉`\u000bYӠ$)1XqU!\u001d6y\u0013{;?Ǭ\u0012\f/ΞF/ q\u0016\u001a߀x\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PZ0V\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5PL", "/wX@A(FS", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "5dc\u000ek0L<\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dT1f\u000b>\\'\u0003\nr", "", "5dc\u001bX,=aw~\u0004l0\f\u001d", "u(I", "5dc#T3NS", "u(8", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "BnE.e0:b\u001d\t\u0004O(\u0004\u0019/", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i2) {
            this.axisName = str;
            this.value = i2;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return Intrinsics.areEqual(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    public final Setting Setting(String str, float f2) {
        if (str.length() != 4) {
            throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
        }
        return new SettingFloat(str, f2);
    }

    public final Setting italic(float f2) {
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f2).toString());
        }
        return new SettingFloat("ital", f2);
    }

    /* JADX INFO: renamed from: opticalSizing--R2X_6o */
    public final Setting m6256opticalSizingR2X_6o(long j2) {
        if (!TextUnit.m6834isSpimpl(j2)) {
            throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
        }
        return new SettingTextUnit("opsz", j2, null);
    }

    public final Setting slant(float f2) {
        if (-90.0f > f2 || f2 > 90.0f) {
            throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f2).toString());
        }
        return new SettingFloat("slnt", f2);
    }

    public final Setting width(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f2).toString());
        }
        return new SettingFloat("wdth", f2);
    }

    public final Setting weight(int i2) {
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i2).toString());
        }
        return new SettingInt("wght", i2);
    }

    public final Setting grade(int i2) {
        if (-1000 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
        }
        return new SettingInt("GRAD", i2);
    }

    /* JADX INFO: renamed from: Settings-6EWAqTQ */
    public final Settings m6255Settings6EWAqTQ(FontWeight fontWeight, int i2, Setting... settingArr) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(weight(fontWeight.getWeight()));
        spreadBuilder.add(italic(i2));
        spreadBuilder.addSpread(settingArr);
        return new Settings((Setting[]) spreadBuilder.toArray(new Setting[spreadBuilder.size()]));
    }
}
