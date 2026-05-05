package com.biocatch.android.commonsdk.core.masking;

import android.content.res.Resources;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGPLeV8ZS0\u000fs{J$cҕyCIs\"}(\tWNupvJ`\fK\u000f\u0014\"\u0001j2O]xk\u0012\u00172HrG3coEʠhtL\u0005(2(D\u0010ڎ1\u001aXGP\n\u000bGY\f*0nqJV\u001bO\u001d\u001a@\ţ$\u0001,`0RDc\u0005]hKk/w_f'\u000eC-Q\u001bdl';\n\u0012$1@EN-%\u0002\r7Xa?\u0011W\n=3rW-1I\u0002vNX.'[+\u0018#k\u0013>\\3d\u0011\u00105Lgcyr>.}z\n0T\u0004<*oX<R2f6\u001dcz\u0001yXR\u0018]p\u0013Aa~-3'K+g.\u0017Woc1PMz3 N'\u000f\r9[\u0003!)=)}\u0010Q_dpAVt\"Yk\u00014tp,B\u0004^Z05\u0002\u0011<B=7\nHS'q\u0002Vp\u007fv3o1iw\u007f`@P\u0002F=81$\\Zc3~\u0001XfJ)MJgO\u0014\u0016A8\\&CQ+\u001evgj\u007fi{p:)=\u0016OY\u001drVmG\u000fK5\u007fv@g`\u001f,ARa3k\u0017Fa*r\\V5zTx;\u0010{ra<\u0017@p\n\u001cb?\u0002%j\u0015`\u0003LC\u0018Ҕ\u000bރ^h\u0018з%E2\b\u0002*\u0005\u000b\u0011P\u000bw\u001emO̥.ʬd\"5ۋ\"A'.m\"\u0017;SɀIҋw\u007fOх\u001dSZu.u\u0004\u0006vډ\u001c\u07fcU/EП_\u000f7=\u001a1ULxf\u007fYh\u0600\u0007܃}\u000fCÜ~w\u0016w\t0pjPP\u0003#xԱjѓ'\blрJmT\t_c\u0003\u001a2ůU\u03a2\u0007YDѾ\t\t\u0013/6%/yxğ7ԩG'%ȶH =&y]\u0018y\u0005ӣdϪ*tmֽ|o$\u0002zQ\fE\u0012Ͳ\f˕\u0003>*غ=\u000fP\\\u0003w6L_ͬ\u000fάLAlݥ'D[ G}\u0015\u000e\u0003ݻ3Æ_:\u001b̊N@<uBsq\bjٮEѼ\u0015M[܊>yYs#J=\u0014a֍3ߎ\u0016\u001cEղ'cp!H\u0006\"\"\rא=ك\t<\u0011ӗ\u00058J!#C\u0003s\\؎|ķJ_\u0017ğ\u0003N\u0002Un\u000e\u0003\u007f3Ɗ\u000bϖdEhԠz\r\r\u0011K\u001e'8\b܍oܑX/kѢݕWO"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/(\"xL\u0001\u001c\f6G}Jf\u0004U\u0012\u00174wzFUYE\u0004\u001d}K2vE_)wQNE,\u001as\u0010f+2}+", "1n]Ae6Ea\u0001z\u0006i0\u0006\u000b", "", "", "2hV6g\u0014:a\u001fove<|", "2hV6g\u0019>U\u0019\u0012", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "3kT:X5MD\u0015\u0006\u000b^:[\r=a|/{(|%\u001dKx\u0010#z3D", "", "3kT:X5MD\u0015\u0006\u000b^:d\u0005=k\u00041}'\u0005%&", "3mP/_,\u001eZ\u0019\u0007zg;m\u00056u\u007f6c<\u000f\u001d\u001bPq", "", "9dh\"a\u0014:a\u001f~y:5{q9t]2\u0005A\u0005\u0019tJk\u001bJc%7Y\u0011", "9dh\"a\u0014:a\u001f~y</x\u0016=R\u007f*{S", "9dh@F7>Q\u001dz\u0002</x\u0016\u0017a\u000e.l<\b'\u0017", "", ":dcAX9+S\u001b~\u000e", "AoT0\\(E1\u001cz\bF(\u000b\u000f a\u00078{", "AoT0\\(E1\u001cz\bK,~\tB", "AoT0\\(E1#\b{b.Z\f+rl(}@\u0014", "Cm<.f2>Rt\byG6\ff9n\u0001,}\u001e\u0004\u0013$U\\\u000e>v8", "Cm<.f2>Rv\u0002vk:i\t1e\u0013", "CmX0b+>;\u0015\r\u0001O(\u0004\u0019/", "1n]3\\.N`\u0019", "", "2n<.f2B\\\u001b", "BdgA", ":dcAX9&O'\u0005kZ3\r\t", "5dc\u001fX:Hc&|zG(\u0005\t", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@db<h9<S'", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "7r36f(;Z\u0019fvl2\u0001\u00121L\u00046\u000b\u001e\u000b &Cs\u0017JZ$", "@db<h9<S\u0002z\u0003^", ";`b863B^u\tvk+k\tBt", "7c", ";`b8<-\u001e\\\u0015{\u0002^+", "BdgAG6&O'\u0005", "@d\\<i,)`\u001d\u0010vm,[\u0005>a", "7rC2k;/W\u0019\u0011", ";`b8<5Ic(\r", ";`b8>,Ra", "1gP?T*MS&", ";`b8G,Qb|\u007fg^:\u0007\u0019<c\u007f\f\u0005(|%\u001dKx\u0010#z3D", "2`c.", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TextMaskingService {
    private final ConfigurationRepository configurationRepository;
    private final Set<Character> controlsMapping;
    private final char digitMaskValue;
    private final Regex digitRegex;
    private List<?> elementValuesDisableMaskingList;
    private List<?> elementValuesMaskingList;
    private boolean enableElementValuesMasking;
    private final Regex keyUnMaskedAndNotConfigCharsRegex;
    private final Regex keyUnMaskedCharsRegex;
    private final String keysSpecialCharMaskValue;
    private final Regex letterRegex;
    private final char specialCharMaskValue;
    private final Regex specialCharRegex;
    private final Regex specialConfigCharRegex;
    private final Regex unMaskedAndNotConfigCharsRegex;
    private final Regex unMaskedCharsRegex;
    private final char unicodeMaskValue;
    private final Utils utils;

    public TextMaskingService(ConfigurationRepository configurationRepository, Utils utils) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.configurationRepository = configurationRepository;
        this.utils = utils;
        this.digitMaskValue = '1';
        this.unicodeMaskValue = 'B';
        this.specialCharMaskValue = '*';
        this.keysSpecialCharMaskValue = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        this.controlsMapping = SetsKt.setOf((Object[]) new Character[]{'\n', '\b'});
        this.letterRegex = new Regex("\\p{L}");
        this.digitRegex = new Regex("\\p{Nd}");
        this.specialCharRegex = new Regex("[\\\\_!%^&*#()={}\\[\\]’|/?><~\"±§`'׳]");
        this.specialConfigCharRegex = new Regex("[ ,.@;:\\-+$]");
        this.keyUnMaskedCharsRegex = new Regex("[^A1*]");
        this.keyUnMaskedAndNotConfigCharsRegex = new Regex("[^A1*,.@;:+$ -]");
        this.unMaskedCharsRegex = new Regex("[^a1*]");
        this.unMaskedAndNotConfigCharsRegex = new Regex("[^a1*,.@;:+$ -]");
        this.elementValuesMaskingList = utils.toList(configurationRepository.getString(ConfigurationFields.elementValuesMaskingList));
        this.elementValuesDisableMaskingList = utils.toList(configurationRepository.getString(ConfigurationFields.elementValuesDisableMaskingList));
        this.enableElementValuesMasking = configurationRepository.getBoolean(ConfigurationFields.enableElementValuesMasking);
    }

    private final String doMasking(String str, Regex regex, Regex regex2, String str2) {
        if (str.length() == 0) {
            return str;
        }
        String strReplace = this.specialCharRegex.replace(this.digitRegex.replace(this.letterRegex.replace(str, str2), String.valueOf(this.digitMaskValue)), String.valueOf(this.specialCharMaskValue));
        return !this.configurationRepository.getBoolean(ConfigurationFields.keyEventsMaskSpecialChars) ? regex2.replace(strReplace, String.valueOf(this.unicodeMaskValue)) : regex.replace(this.specialConfigCharRegex.replace(strReplace, String.valueOf(this.specialCharMaskValue)), String.valueOf(this.unicodeMaskValue));
    }

    static /* synthetic */ String doMasking$default(TextMaskingService textMaskingService, String str, Regex regex, Regex regex2, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            regex = textMaskingService.unMaskedCharsRegex;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            regex2 = textMaskingService.unMaskedAndNotConfigCharsRegex;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str2 = "a";
        }
        return textMaskingService.doMasking(str, regex, regex2, str2);
    }

    public static /* synthetic */ String getResourceName$default(TextMaskingService textMaskingService, View view, Resources resources, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            resources = view.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        }
        return textMaskingService.getResourceName(view, resources);
    }

    private final boolean isDisableMaskingListContainsId(String str) {
        return CollectionsKt.contains(this.elementValuesDisableMaskingList, str);
    }

    public static /* synthetic */ String maskIfEnabled$default(TextMaskingService textMaskingService, String str, String str2, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 4) - (4 | i2) != 0) {
            z2 = false;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = false;
        }
        return textMaskingService.maskIfEnabled(str, str2, z2, z3);
    }

    public final synchronized void configure() {
        this.elementValuesMaskingList = this.utils.toList(this.configurationRepository.getString(ConfigurationFields.elementValuesMaskingList));
        this.elementValuesDisableMaskingList = this.utils.toList(this.configurationRepository.getString(ConfigurationFields.elementValuesDisableMaskingList));
        this.enableElementValuesMasking = this.configurationRepository.getBoolean(ConfigurationFields.enableElementValuesMasking);
    }

    public final String getResourceName(View view, Resources resources) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resources, "resources");
        try {
            int id = view.getId();
            if (id == -1) {
                return "";
            }
            String resourceEntryName = resources.getResourceEntryName(id);
            Intrinsics.checkNotNullExpressionValue(resourceEntryName, "resources.getResourceEntryName(id)");
            return resourceEntryName;
        } catch (Resources.NotFoundException e2) {
            Log.Companion.getLogger().debug(view.getClass().getSimpleName() + e2);
            return "";
        }
    }

    public final String maskClipBoardText(String str, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return isDisableMaskingListContainsId(str) ? text : doMasking$default(this, text, null, null, null, 14, null);
    }

    public final String maskIfEnabled(String resourceName, String textToMask, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        Intrinsics.checkNotNullParameter(textToMask, "textToMask");
        if (z2) {
            textToMask = removePrivateData(textToMask);
        }
        return z3 ? maskInputs(resourceName, textToMask) : this.enableElementValuesMasking ? maskTextIfResourceInMaskingList(resourceName, textToMask) : textToMask;
    }

    public final String maskInputs(String str, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return isDisableMaskingListContainsId(str) ? text : doMasking$default(this, text, this.unMaskedCharsRegex, this.unMaskedAndNotConfigCharsRegex, null, 8, null);
    }

    public final char maskKeys(String str, char c2) {
        return (this.controlsMapping.contains(Character.valueOf(c2)) || isDisableMaskingListContainsId(str)) ? c2 : StringsKt.first(doMasking(String.valueOf(c2), this.keyUnMaskedCharsRegex, this.keyUnMaskedAndNotConfigCharsRegex, this.keysSpecialCharMaskValue));
    }

    public final String maskTextIfResourceInMaskingList(String str, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return (this.elementValuesMaskingList.isEmpty() || CollectionsKt.contains(this.elementValuesMaskingList, str)) ? doMasking$default(this, text, null, null, null, 14, null) : text;
    }

    public final String removePrivateData(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new Regex(".+\\d{3,}").matches(data) ? new Regex("\\d").replace(data, ProxyConfig.MATCH_ALL_SCHEMES) : data;
    }
}
