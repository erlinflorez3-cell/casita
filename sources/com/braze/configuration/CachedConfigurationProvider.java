package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import bo.app.al;
import bo.app.bl;
import bo.app.cl;
import bo.app.dl;
import bo.app.wk;
import bo.app.xk;
import bo.app.yk;
import bo.app.zk;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.npmdavi.davinotification.Constant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLc\u0003\u0010Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?3LeV7ZS0\u0016s{BDc$wMCU(}*\tUOog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4I[|e\u0012\u001dUJoE<S\u0005Sʠ~/f\u0005N1Z85\u0007A=0M z\tic\f@UPv@R\u001bu\u001d\u001a@\u0010N&\u0007\u001ej\u0013f6v\u0017Һ>1);w{\u0017Fm5\u0015M;J\u0005-\u001bwy A?e5E)a\u0006\u001fR\nAI?џA\u0007n,51\u0012\u000be=p\u0002*\u0014YO=a\u0001't\u0005\u007f`R'˦SeQW\u001c0@\u0016\n\u0019T\u0004<\u0010WL<62f6\u000ecx\u0001^XP0h۰\u0004|gB%2HR9G3hg`i\u0019~;\n\u000e%\u001eQ\u0001\u001f'i_&b+\u001a\u0003wΦ5SFKV]RtK}\u001cp\u0011\u0006Z\b>P\u0018/*\u0011^\u001b3Bs9Q%Ƞ\u0006JJw\u0005\u0016)\u007fa{jJV!\u001d\u001ag.\u0017\u0015rD\u0013\u00052UԜ\\.\u0017_*gO)\u0016(8d\b>1%>Neg\u0018~}a\u0018.GfeY\u001fw\u001cbQfC7ac>ahuBSםf\u0007^{PiTwj?:2vn@{\nMf\fA2ou*?D1G`[JҴ\"DG\u0014\u0017p#\u0012\u001e\u0018l5:\u0002\u0018#%\r\u000fhtp\u001ei)M:}x\"[A\u0002;'1m$~3+\"M\u0001\u0381\u0004ImeUf5?\u0004p\u0014\",\u0019gP_A!'\u0017)`\u0004]IZs}Q{\u0012W\u0001\u000b\u0005'=~-\u0016\u00071rݽdlPjb1j l\u000f;\nz~(`v~U{l\u000b\n@yv\u0011ZTNf|5%,0\u0019q8{c,\n,ޗ\u001ay\u001aK#{&\u0013}K\u0012d%%#d40q.\bb\u007f_b?FJq~l\"Tr\u0011M`l\u000e\u0007p\bz\u0012άLCj\u000edR\u0016(=\u001d~\u0007Z\f!ZiR+o,6^c8\u0012[}Bb\n*ݱQUm\r{k%\u0018X3\"\u000b*R5ܞεA\"\\yp,\u0001\u001a\u0002>NAi\b;<G$\u000bɹHޭ\u000fG\\k\f6\t'\u0017s\u001d?JB\"E\r\u000e\u0013x3ƊTϖdIh#0)\r8\u0004>\u0007`I\u0005\u001cp\u000b3\"6WҼ)͢\u001fzW\u0001lP9pl;!Uf/+GcrW2\u0007'U[\u0006y\u007f\u000eH\u0018+\u001dR\u001c+;g\u0010\u000eu^\u0010AY͇Rn~\u0014l\u0005\\UA\u0001\u00011\u001cqZ!\u0019Ogr\u001ebcL%ߚ9ƴ\u001e\u0005\u001fF/=\u001a4ޖJW"}, d2 = {"\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011M\n:y%47\b)8q\u0018>Z?Jo>'\u007fukJ\u000bb,[L", "", "", "9dh", "\u001aa^{T7I\u001d,\u0005P", "@db<h9<S\b\u0013\u0006^", "", "5dc\u001fX:Hc&|zB+|\u0012>i\u0001,{M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b=\u000b`\u0013RzWO|zx=", "5dc\u0013T3EP\u0015|\u0001<6\u0006\n3ge(\u0010", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", ">qX:T9R9\u0019\u0013", "", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u000fb6ES\u0015\bkZ3\r\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004u", "5dc g9B\\\u001bove<|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq4H7|0g\u001cdj;PQ;[z0I\"", "5dc\u0016a;/O \u000fz", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004d", "5dc\u0010b3H`\nz\u0002n,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#", "", "5dc g9B\\\u001blzm\u001dx\u0010?e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n#Y\ruzT\u001b*^?\u0005{C\"\u001c2O9\u00169", "5dc\u0011e(PO\u0016\u0006zO(\u0004\u0019/", "Bx_2", "5dc\u001fh5MW!~Xh5}\r1u\r$\u000bD\u000b \bCv\u001e<", "uKQ<\"(I^b\u0012\u00014\u0013\u0002\u0005@aI/wI\u0003`\u0005V|\u0012Exz\u001c^y137\u001d*VE\u0005U1#\u0015fp\u000fJJ1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$", "5dc\u001fX:Hc&|z<6\u0006\n3g\u00105wO\u0005! 8k\u0015Lv", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138V{/\f@", "@dP1E,L])\fx^\u001dx\u0010?e", "@db<h9<S|}", "5dc#T3NSy\f\u0005f\u0019|\u00179u\r&{N", "uKQ<\"(I^b\u0012\u00014\u0010@o4a\u0011$EG| \u0019\u0011Y\u000bAv#D/", "", "@db2g\n:Q\u001c~9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "u(E", "@db2g\n:Q\u001c~", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ag^B_+.a\u0019\\\u0005g-\u0001\u000b?r{7\u007fJ\nt\u0013Er\u000e", "(", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011\\\u001eE\u0006)=YY+BK 7NG={A\u001a$lkBqp6_z&GY$", "@t]A\\4>/$\nXh5}\r1u\r$\u000bD\u000b \u0002Ty\u001f@u%B", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011\\\u001eE\u0006)=YY+BK 7NG={A\u001a$lkBqp6_z&GY$", "5dc\u001fh5MW!~Vi7Z\u00138f\u0004*\fM|&\u001bQxxI\u000169X}-", "u(;0b4\bP&z\u0010^uz\u00138f\u0004*\fM|&\u001bQxW)\u0007.D]\u0006 \u0013x!\fWL<o6.\"dp=\u0011l\u0017[\u00018KKN92", "Adc\u001fh5MW!~Vi7Z\u00138f\u0004*\fM|&\u001bQxxI\u000169X}-", "uKR<`u;`\u0015\u0014z(*\u0007\u00120i\u00028\t<\u0010\u001b!P9zL\u007f49a}{Bxs8VD?mD+\u0011weC\u0010N9X\b+FL[\u0002 C", "", "1n]3\\.N`\u0015\u000e~h5Z\u0005-h\u007f", "\u001aiPCTuNb\u001d\u0006DF(\b^", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138C{&~@", "u(;7T=:\u001d)\u000e~eud\u0005:;", "@db<h9<S\u0004zxd(~\t\u0018a\b(", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0003#t/=#z-3\u0003\u0016wKMDl8 %u]H\u000bm5\u0018c7P[R4\\.}Hq\u001cc\u000fR-\u001d\u0012UP(xM\",\u0012=M\u0001;uVO\u0007", "\u0011n\\=T5B]\"", "0n\u001e.c7\be\u001f", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public class CachedConfigurationProvider {
    public static final wk Companion = new wk();
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context) {
        this(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context, boolean z2) {
        this(context, z2, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public CachedConfigurationProvider(Context context, boolean z2, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runtimeAppConfigurationProvider, "runtimeAppConfigurationProvider");
        this.context = context;
        this.shouldUseConfigurationCache = z2;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = mapSynchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z2, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? true : z2, (i2 + 4) - (i2 | 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }

    private final String getFallbackConfigKey(String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) Constant.BRAZE, false, 2, (Object) null)) {
            return StringsKt.replace$default(str, Constant.BRAZE, "appboy", false, 4, (Object) null);
        }
        return null;
    }

    private final int getResourceIdentifier(String str, xk xkVar) throws Throwable {
        if (str == null) {
            return 0;
        }
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("%1&370*r\u001f*(-%-2jv\" %\u001d/*", (short) (FB.Xd() ^ 9367))).getMethod(Qg.kd("QN\\9KXSXTDER", (short) (C1499aX.Xd() ^ (-1798)), (short) (C1499aX.Xd() ^ (-5062))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getIdentifier(str, xkVar.f2229a, this.resourcePackageName);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean getBooleanValue(String primaryKey, boolean z2) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(xk.BOOLEAN, primaryKey, Boolean.valueOf(z2));
        Intrinsics.checkNotNull(configurationValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String primaryKey) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (Integer) getConfigurationValue(xk.COLOR, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(xk type, String key, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        return (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) ? this.configurationCache.get(key) : this.runtimeAppConfigurationProvider.containsKey(key) ? getRuntimeConfigurationValue(type, key, obj) : getResourceConfigurationValue(type, key, obj);
    }

    public final int getDrawableValue(String primaryKey, int i2) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(xk.DRAWABLE_IDENTIFIER, primaryKey, Integer.valueOf(i2));
        Intrinsics.checkNotNull(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String primaryKey, int i2) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(xk.INTEGER, primaryKey, Integer.valueOf(i2));
        Intrinsics.checkNotNull(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(xk type, String key, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Object resourceValue = readResourceValue(type, key, obj);
        this.configurationCache.put(key, resourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yk(key, resourceValue), 7, (Object) null);
        return resourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(xk type, String key, Object obj) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            objValueOf = Integer.valueOf(obj == null ? this.runtimeAppConfigurationProvider.getIntValue(key, 0) : this.runtimeAppConfigurationProvider.getIntValue(key, ((Integer) obj).intValue()));
        } else if (iOrdinal == 2) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            objValueOf = Boolean.valueOf(runtimeAppConfigurationProvider.getBooleanValue(key, ((Boolean) obj).booleanValue()));
        } else if (iOrdinal == 3) {
            objValueOf = this.runtimeAppConfigurationProvider.getStringValue(key, (String) obj);
        } else if (iOrdinal == 4) {
            objValueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(key, ""), xk.DRAWABLE_IDENTIFIER));
        } else {
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
            objValueOf = runtimeAppConfigurationProvider2.getStringSetValue(key, (Set) obj);
        }
        this.configurationCache.put(key, objValueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zk(key, objValueOf), 7, (Object) null);
        return objValueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> set) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(xk.STRING_ARRAY, primaryKey, set);
        return configurationValue == null ? set : (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String str) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (String) getConfigurationValue(xk.STRING, primaryKey, str);
    }

    public final Object getValueFromResources(xk xkVar, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(xkVar, hg.Vd("\u000f\u0013\t|", (short) (C1607wl.Xd() ^ 25957), (short) (C1607wl.Xd() ^ 5363)));
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("^j_lha[$XcafV^c\u001c0[Y^N`[", (short) (C1633zX.Xd() ^ (-28124)))).getMethod(C1561oA.yd("yv\u0005as\u0001{\u0001|lmz", (short) (C1580rY.Xd() ^ (-25778))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int iOrdinal = xkVar.ordinal();
            if (iOrdinal == 0) {
                return Integer.valueOf(resources.getInteger(i2));
            }
            if (iOrdinal == 1) {
                return Integer.valueOf(resources.getColor(i2));
            }
            if (iOrdinal == 2) {
                return Boolean.valueOf(resources.getBoolean(i2));
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return Integer.valueOf(i2);
                }
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                String[] stringArray = resources.getStringArray(i2);
                Intrinsics.checkNotNullExpressionValue(stringArray, C1561oA.Yd("'\u001b*'.,\u001e!0k&%5\u001576.4.\t;<,Et@4C@GE7:\u001f;\u0001", (short) (C1633zX.Xd() ^ (-169))));
                return new HashSet(CollectionsKt.listOf(Arrays.copyOf(stringArray, stringArray.length)));
            }
            String string = resources.getString(i2);
            short sXd = (short) (ZN.Xd() ^ 13286);
            short sXd2 = (short) (ZN.Xd() ^ 28611);
            int[] iArr = new int["L@OLSQCFU\u0011KJZ:\\[SYS\u0015`Tc`geWZ?[!".length()];
            QB qb = new QB("L@OLSQCFU\u0011KJZ:\\[SYS\u0015`Tc`geWZ?[!");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Intrinsics.checkNotNullExpressionValue(string, new String(iArr, 0, i3));
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Object readResourceValue(xk type, String key, Object obj) throws Throwable {
        int resourceIdentifier;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            resourceIdentifier = getResourceIdentifier(key, type);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) bl.f292a, 4, (Object) null);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(type, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(key);
        if (fallbackConfigKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new al(key, obj), 7, (Object) null);
            return obj;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(type, resourceIdentifier2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new cl(type, key, obj), 7, (Object) null);
        return obj;
    }

    public final void resetCache$android_sdk_base_release() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) dl.f499a, 7, (Object) null);
        this.configurationCache.clear();
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        Intrinsics.checkNotNullParameter(runtimeAppConfigurationProvider, "<set-?>");
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
    }
}
