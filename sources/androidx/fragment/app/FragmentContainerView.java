package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: compiled from: FragmentContainerView.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG6LeN.ZS@\u000fs{:$c$\bCC٥\"}0(WN}gvϺb\u000bQ\u0018\u000e\u0016~j4Icxe\u0012\u00155JoU3UڎE9vt>\u0005&3*8\u0010\u0005\t\u001a0H\u0018v\tJS\f\u00182HpPR\u0015M\u000b%\u001a\u0006T \t\u001ebjdȤxl\f9g\"=*OT;o4\u000bM%F\u0003(˼za,-\u0001X;*5W\u0011\u0007j[m\u0004OwK\b\u0001)=*wwg<^\u007f\"\u001aCO;cę*\\\u0013X!)-9_gYP&(&{\f\u0011J\u0007&\u0006UL>1(n \u000ea}ɤW@^\f'P\u000e\u000ey6E9079N3f\u007fp\u0002\u0019\u0017W\n\u001b%\u001eQ\u0015\u001f%ik&`C*\u0005{_Ii@kN~\u0010gV\u0006\u0006\u0007a0DJD\u0010\u000e=\u0017).EAg_G@9k0d\u000b|?\u0013n\u0007ki\u0001\\p&|5O*7,!V-#yqlXZ\"} b&\u0016\bA@\r{J8=\u0010|^\u0019mxou\nSR-I\"|y2o9\rGeUq5yR%#\u0006P+\u001af\rZSR\u0002|0(õV\u00128y\u0012C|4Ʊ6?\u007fE|:?Ct\u0015v\u001fNFO\u001a!_\t\u0005V\u0014\u001d92.\u0002$#\u001dGd%~}\u0014\u0011IZ\u0011\u0011&;fi5G5\u001c61B\u000bP\u001f~\"\u0014wkZ_dlD{\u001c\u0010h$(gi/k'?\u00037W\u001a-s[9y\u001ac V\u0013|(#kl<\u0018 j\u001f2\u0011nX\u0001l\u0017P|%\u0007k\u001er2\u0012at\u000fwgb;s>wx3]J\u007fP|3%d9I}00M-q;M\u001a\u0006$G\u0015\u0010n0nv\npC>t\u0014\u0018\\i$%zSs1in\u0010mGL0[\u0005\u0003p\\\u001b{\u0016z!4;?\u000fU-~dqe\u000b]\u0012\u0017\u000b:2\tV\nIY\u0004NB<jBuY|Bj\u001aќ\u001dߠWguޮ\u001cn\u0019W'\u0010\u001b}An@+k.-̳dס4\u0006{̸\u0007MIr\u001d<75\u000bɹHޭ\u000fC\\ȫV\"\t\u0012^e\u001f\u0019BB\"J\u0005\u001c+܂^ƪL\u0005hѤȠ%e"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D7\b)Fi\u001a7MP,o40j", "\u001a`]1e6BRb\u0011~].|\u0018xF\r$\u0004@g\u0013+Q\u007f\u001d\u0012", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "2dU g@ESt\u000e\nk", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]L\u000b\u000b=", "4l", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;#", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]L\u000eCUM9fVqP]\u0013g\nP3\r\u000eh\u000b yO\u0001\u007f\u0015(K\n;q\u0010s\u0012\u00171lpO,S8", "/o_9l\u001eB\\\u0018\t\rB5\u000b\t>sf,\nO\u0001 \u0017T", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\\"\"N\u0004\u007f@\u007f$?ka)Em%<4GIz4'\u0015u7", "2hb.c7>O&\u0003\u0004`\r\n\u00051m\u007f1\u000b\u001e\u0004\u001b\u001eF|\u000eE", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2qPD70LO$\nzZ9\u0001\u00121V\u0004(\u000eNa\u001b$U~", "", "BqP;f0MW#\b~g.]\u0016+g\b(\u0005Oq\u001b\u0017Y}", "/cS\u0011\\::^$~vk0\u0006\u000b\u0010r{*\u0004@\n&\bKo ", "", "D", "/cS#\\,P", "1gX9W", "7mS2k", ">`a.`:", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U.k\"F\u00074 U\u000b\u001c?{k", "2hb=T;<Vt\n\u0006e@n\r8d\n:_I\u000f\u0017&U", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e$\n%\u0017V}c", "7mb2g:", "2hb=T;<Vw\fvp", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2qPD6/BZ\u0018", "2qPD\\5@B\u001d\u0007z", "", "3mS#\\,PB&z\u0004l0\f\r9n", "DhTD", "5dc\u0013e(@[\u0019\b\n", "\u0014", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\ru", "=m0=c3RE\u001d\byh>`\u0012=e\u000f6", "@d\\<i,\u001aZ o~^>\u000bl8L{<\u0006P\u0010", "@d\\<i,/W\u0019\u0011", "@d\\<i,/W\u0019\u0011Vm", "@d\\<i,/W\u0019\u0011^g\u0013x\u001d9u\u000f", "@d\\<i,/W\u0019\u0011\t", "AsP?g", "1nd;g", "@d\\<i,/W\u0019\u0011\tB5c\u0005Co\u00107", "Adc\u0011e(P2\u001d\rvi7|\u0005<i\t*lD\u0001)%.k\u001cK", "Adc\u0019T@Hc(m\bZ5\u000b\r>i\n1", "BqP;f0MW#\b", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqb<\u0015!'V^\u001b8\u007f39h\u0002*@C", "Adc\u001ca\bI^ \u0013lb5{\u0013AI\t6{O\u000f}\u001bU~\u000eEv2", ":hbAX5>`", "AsP?g\u001dBS+m\bZ5\u000b\r>i\n1", "\u000foX~#\u0010F^ ", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FragmentContainerView extends FrameLayout {
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final List<View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final List<View> transitioningFragmentViews;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? 0 : i2);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        String strKd;
        short sXd = (short) (Od.Xd() ^ (-26101));
        short sXd2 = (short) (Od.Xd() ^ (-32477));
        int[] iArr = new int["m&\u0014!\u001a\u001a`".length()];
        QB qb = new QB("m&\u0014!\u001a\u001a`");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i3));
        super(context, attributeSet, i2);
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr2 = R.styleable.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(iArr2, Ig.wd("\rl\b;_3\u000ei\u0002C:Hfz\u001ap5)a\u0014_", (short) (ZN.Xd() ^ 1701)));
            Class<?> cls = Class.forName(EO.Od("\u0016R* }-<E\u001e\u001e\u0013~\u001f*0O\u001aPfT\tgy", (short) (C1580rY.Xd() ^ (-23258))));
            Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u001e*\u001f,(!\u001bc*(\u001c\u001e^p#\"\u001f\u0015\r\u001f\u001d\ry\u000b\u0019", (short) (OY.Xd() ^ 25850))), int[].class, Integer.TYPE, Integer.TYPE};
            Object[] objArr = {attributeSet, iArr2, 0, 0};
            short sXd3 = (short) (C1633zX.Xd() ^ (-7691));
            short sXd4 = (short) (C1633zX.Xd() ^ (-27934));
            int[] iArr3 = new int["_SfT]cIkqe__=qrqicwwix".length()];
            QB qb2 = new QB("_SfT]cIkqe__=qrqicwwix");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr3[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) - sXd4);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                if (classAttribute == null) {
                    classAttribute = typedArray.getString(R.styleable.FragmentContainerView_android_name);
                    strKd = C1561oA.od("VbWd`YS([MXO", (short) (OY.Xd() ^ 2729));
                } else {
                    strKd = C1561oA.Kd("?I?RS", (short) (C1633zX.Xd() ^ (-4002)));
                }
                typedArray.recycle();
                if (classAttribute == null || isInEditMode()) {
                    return;
                }
                short sXd5 = (short) (C1633zX.Xd() ^ (-19439));
                short sXd6 = (short) (C1633zX.Xd() ^ (-13665));
                int[] iArr4 = new int["\feR\u0006\tm5)sMK~g\u001e`CN`p\u0019)?J?:)QABj~]g\t\u00068hUQf\u0010+/cXN\u0012Lli\\\u0017\u0007~BV'O~\u0002{\u001c\u0014".length()];
                QB qb3 = new QB("\feR\u0006\tm5)sMK~g\u001e`CN`p\u0019)?J?:)QABj~]g\t\u00068hUQf\u0010+/cXN\u0012Lli\\\u0017\u0007~BV'O~\u0002{\u001c\u0014");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr4[i5] = xuXd3.fK(((i5 * sXd6) ^ sXd5) + xuXd3.CK(iKK3));
                    i5++;
                }
                throw new UnsupportedOperationException(new String(iArr4, 0, i5) + strKd + C1561oA.Xd("\u0013x", (short) (OY.Xd() ^ 2854)) + classAttribute + '\"');
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) throws Throwable {
        String str;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, Wg.vd("-::A+?<", (short) (OY.Xd() ^ 24035)));
        Intrinsics.checkNotNullParameter(attributeSet, Qg.kd("N`_\\\\", (short) (ZN.Xd() ^ 9900), (short) (ZN.Xd() ^ 26937)));
        Intrinsics.checkNotNullParameter(fragmentManager, hg.Vd("\u0012\u0018", (short) (FB.Xd() ^ 4310), (short) (FB.Xd() ^ 22218)));
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R.styleable.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(iArr, C1561oA.ud(",WEJOFNS!LJO;BF<H+=8I", (short) (C1633zX.Xd() ^ (-22955))));
        short sXd = (short) (FB.Xd() ^ 10718);
        int[] iArr2 = new int["]ibog`^'WbdiU]f\u001fOz|\u0002m\u007f~".length()];
        QB qb = new QB("]ibog`^'WbdiU]f\u001fOz|\u0002m\u007f~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = {attributeSet, iArr, 0, 0};
        Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(Xg.qd("\u0011\u0005\u0018\u0006\u000f\u0015z\u001d#\u0017\u0011\u0011n#$#\u001b\u0015))\u001b*", (short) (C1499aX.Xd() ^ (-15713)), (short) (C1499aX.Xd() ^ (-28876))), Class.forName(C1561oA.Yd("|\u000b\u0002\u0011\u000f\n\u0006P\u0019\u0019\u000f\u0013Ui\u001e\u001f\u001e\u0016\u0010$$\u0016\u0005\u0018(", (short) (FB.Xd() ^ 12793))), int[].class, Integer.TYPE, Integer.TYPE);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            classAttribute = classAttribute == null ? typedArray.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
            String string = typedArray.getString(R.styleable.FragmentContainerView_android_tag);
            typedArray.recycle();
            int id = getId();
            Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(id);
            if (classAttribute != null && fragmentFindFragmentById == null) {
                if (id == -1) {
                    if (string != null) {
                        short sXd2 = (short) (OY.Xd() ^ 21433);
                        short sXd3 = (short) (OY.Xd() ^ 19332);
                        int[] iArr3 = new int[")e1.|\u0006t&\"P".length()];
                        QB qb2 = new QB(")e1.|\u0006t&\"P");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr3[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                            i3++;
                        }
                        str = new String(iArr3, 0, i3) + string;
                    } else {
                        str = "";
                    }
                    throw new IllegalStateException(ZO.xd("--g<@r.ptuTczw<:i<eXK4LtE\rt\fa!TO\u0003\u001a)\u000eF\u0006\u000b_=KJ]S`2\n7\u0005^q$f\b[;m|jf\\", (short) (ZN.Xd() ^ 7535), (short) (ZN.Xd() ^ 28559)) + classAttribute + str);
                }
                FragmentFactory fragmentFactory = fragmentManager.getFragmentFactory();
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1626yg.Ud("i_~K-V%)}AsZv]B*\u0013X&\bT^s", (short) (ZN.Xd() ^ 24266), (short) (ZN.Xd() ^ 32174))).getMethod(Ig.wd("\"GH{l\r~n\u0001SCh\u001f&", (short) (ZN.Xd() ^ 76)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    Fragment fragmentInstantiate = fragmentFactory.instantiate((ClassLoader) method2.invoke(context, objArr2), classAttribute);
                    Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, EO.Od("]\u0017E]9u -daa\u0015[[xU\u0006\u001bv:~+\u0016~\ue073`|TS\u00144\u0011f\rK\u000f63W?Fn'n8\u0013*\u0011\u000bm", (short) (ZN.Xd() ^ 308)));
                    fragmentInstantiate.mFragmentId = id;
                    fragmentInstantiate.mContainerId = id;
                    fragmentInstantiate.mTag = string;
                    fragmentInstantiate.mFragmentManager = fragmentManager;
                    fragmentInstantiate.mHost = fragmentManager.getHost();
                    fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
                    fragmentManager.beginTransaction().setReorderingAllowed(true).add(this, fragmentInstantiate, string).commitNowAllowingStateLoss();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            fragmentManager.onContainerAvailable(this);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.applyWindowInsetsListener = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets;
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(insets)");
        if (this.applyWindowInsetsListener != null) {
            Api20Impl api20Impl = Api20Impl.INSTANCE;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            windowInsetsCompatOnApplyWindowInsets = WindowInsetsCompat.toWindowInsetsCompat(api20Impl.onApplyWindowInsets(onApplyWindowInsetsListener, this, insets));
        } else {
            windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnApplyWindowInsets, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i2), windowInsetsCompatOnApplyWindowInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.drawDisappearingViewsFirst && !this.disappearingFragmentChildren.isEmpty() && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j2);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.drawDisappearingViewsFirst = z2;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i2, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (FragmentManager.getViewFragment(child) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
        }
        super.addView(child, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        View view = getChildAt(i2);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        addDisappearingFragmentView(view);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View view = getChildAt(i5);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            addDisappearingFragmentView(view);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View view = getChildAt(i5);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            addDisappearingFragmentView(view);
        }
        super.removeViewsInLayout(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View view = getChildAt(childCount);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            addDisappearingFragmentView(view);
        }
        super.removeAllViewsInLayout();
    }

    private final void addDisappearingFragmentView(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    /* JADX INFO: compiled from: FragmentContainerView.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.X\u07b9*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018juh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006|k\u0017'2puo7[vU9\u000fvȫ\t("}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D7\b)Fi\u001a7MP,o40SDl=S.\u0010V\u0002.\u001d", "", "u(E", "=m0=c3RE\u001d\byh>`\u0012=e\u000f6", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e$\n%\u0017V}c", "=m0=c3RE\u001d\byh>`\u0012=e\u000f6bD\u000f&\u0017Po\u001b", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\\"\"N\u0004\u007f@\u007f$?ka)Em%<4GIz4'\u0015u7", "D", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mb2g:", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api20Impl {
        public static final Api20Impl INSTANCE = new Api20Impl();

        private Api20Impl() {
        }

        public final WindowInsets onApplyWindowInsets(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v2, WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(v2, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v2, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }
}
