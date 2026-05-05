package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.AndroidTextLayout;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007f\u0007lmA0RnP.XT2\u000f\u0002{<$a$yCIs\"}(\u001cWN}gvJ`\rK\u000f\u0014\u0016\u0001j2J]xs\u0012\u00172HrG3coE9vt>\u000562*\u0600\u007f:\u0017ɝHy@v)B\u0004\u000fCbs%o\u0013xS\u0007*\u0016\u0014>8\u0001L]wRDJ\u0005]h03\u0007wEf'\u000e4\rQ\u001bKl';zq\"9FO5C&c\u0007\u0015Ys?1C\u0002E\u000bh5/CK\nVdݙ\u0010\u001a\u001b+]\u0016urTf\u0015Wf\f56gcyZ\u001e.}z\n\u0019T\u0004<\u00107P4-(s \u0010Is!aĖT\u0002lQH\u0011o\\/%.Z[=)\u000fiaiϊ~;\n.%\u001eQЧ5!$`\u001c\u000b-\u001b\u0003\u0002\u00025_hUH|ˣ\"I{/\tb0V44U-G{?8_=E\nQ#O\u00182XR\u0017\u000f\u0011pjci\u0001̲P$~\u0016e47<+dr\u0015\u0004XdZ<\u0011{ȼj\u0006,\u0019i\u0605hʟ@--īfQn{x`}\f+CtL*}y\u0015o9\r7̳Ui\u0018Рjx\u001aUJyUgtHk\f\t]͈&8PК(y\u0002\\\\%cAMv44Z5Ǭ`\u001bPґ6DG\u0017\u0017v+\u0001\u001e\nl3R\r@ˌ\u0001֊\u0005\\dʙ\bi~T:\u0018\u0001$3]_Ri5c.\u00014+-ȷ\u0003y\bø\u007fNMXz1Ff\n(.\u001cOP]ˋт\u0013\u00051Ʌ\u001a/Kj\u0001\u0005\"\\ 0\u0013|(\u0019³l4oō\u0003r2\u0001xe e%/\u000f`\t\"6rѣ}gNک_eZ,i`\u001a\u0002\u0011\\TNf\u0001ġ#$-˚\b$\u0003X;Zw,$w,/Cbԃmu6Ӡz\u0011,\u0019s\u001d|r$qzQ\f3֑<Oa˚V$*\u0012\u0011[טix>yAΒ\u0011l"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "", "F", "", "G", "EhSA[", "", "6dX4[;", "3kTCT;B]\"", "2hbAT5<S", ">`a2a;", "Ag^B_+&O'\u0005", "", "7r8:c6Kb\u0015\b\n?6\nf9n\u000f(\u0005O^\u0013\"V\u007f\u001b<", "7rE6f0;Z\u0019", "Dhb6U3>@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "uE5\u0016<\r\":\u001d\tDl,\u0006\u0018<yI$\u0005?\u000e!\u001bF9\u001b<\u0002,1mG1;m(1QCHgA\u001c\u0018|+*\u000bc>1z'TH[*_f[G\u0013\u00120\u0003C s\u0001b@1xH6h\n9E\r>l~\u001a_z5h\u007f\u0018\u001a\u0001", "1gX9W9>\\", "", "5dc\u0010[0ER&~\u0004", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0010[0ER&~\u0004", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0011\\:MO\"|z", "u(8", "5dc\u0012_,OO(\u0003\u0005g", "u(5", "5dc\u0015X0@V(", "u(I", "Adc\u0016`7H`(z\u0004m\r\u0007\u0016\ro\t7{I\u0010t\u0013R~\u001eIv", "uY\u0018#", "5dc\u001dT9>\\(", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006\b)5k\u0001$7z\u0012;KFO5%\"\u0015zD=\u0007p([t*[5X+\\(", "5dc [6NZ\u0018fvl2", "5dc#\\:BP ~g^*\f", "u(;.a+K]\u001d}D`9x\u00142i}6E-\u0001\u0015&\u001d", "5dc$\\+MV", "5dc%", "5dc&", "4h]1?\n\u001a", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNjC0N*\u0014 j\u0015]\u0001", "<nS2", "=sW2e\u0015HR\u0019", "7r>/f*N`\u0019}", "Adc\u0016`7H`(z\u0004m\r\u0007\u0016\ra\u000b7\fM\u0001\u0006!#x\f<\u00054?f\f", "", "7r8:c6Kb\u0015\b\n", "BqPCX9LS", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u0011n\\=T5B]\"", "\u0015d]2e0<D\u001d~\rA0|\u0016+r}+\u0010)\u000b\u0016\u0017", "\u0017lP4X\u001dBS+a~^9x\u0016-h\u0014\u0011\u0006?\u0001", "\u001aB0\u001fX:NZ(", "\"dgAI0>e{\u0003zk(\n\u00072yh2z@", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNj>R{=!\u0016X~R+\u001fg]A1jQ5\"\u001c\u0015S\u0001;>", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNj@Zn?\u0014\u0003^\u000e`\u000e\u0011\u0005f=1lGK\b\u0012+IW", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNjKR\u0006L\u0005\u0016Z 1/\r\u0012UN\"qX )\u0007,\u001f", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ViewHierarchyNode {
    private static final String SENTRY_MASK_TAG = "sentry-mask";
    private static final String SENTRY_UNMASK_TAG = "sentry-unmask";
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;
    private final Rect visibleRect;
    private final int width;

    /* JADX INFO: renamed from: x */
    private final float f19776x;

    /* JADX INFO: renamed from: y */
    private final float f19777y;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\u0002<řc$\bCC٥\"}0\u0012WN}gvϺb\u000bQ/\u000e\u0016~j4Ikxe\u0012\u00152HĪ@Iݹ =g_5;\u000b ݨ&8\b\u0005I@8L(v)H{\u0010 6XphY=S\u0013\"*\bT\u001f/#\rk\\?`l\fD_'\u0011tZNUkx\u0019[\u001a^TU\u001b\u001fe.+F8c$U]\u0011\u0017jaO\u0005Oqk\u0007\u00178m+\u0012\u0006eHp\u007fB#SO;d#*j\u0010i`:3qO,]^!@w)\n5<2\"6+V9E\u001a\u0015\u0014T3=\u0005aUh\u0002\rP(z\u0010=G)\u000e>C9Ir\u0018a\f%\\8\u0014\u0005; yЪAĲ_T\u0016֫e'bzi1\u007fB\u0014ʳ!̆]=uՎ\u0378f\u0018"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNj:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "!D=!E 8;tl`X\u001bXj", "", "!D=!E 8C\u0002fVL\u0012vw\u000bG", "4q^:I0>e", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ">`a2a;", "2hbAT5<S", "", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "7r0@f0@\\\u0015{\u0002^\r\n\u00137", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Adc", "", "7r<.f2\u001c]\"\u000evb5|\u0016", "7rD;`(LYv\t\u0004m(\u0001\u0012/r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0013wM\u0001 &\u001d", "Ag^B_+&O'\u0005", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean isMaskContainer(View view, SentryOptions sentryOptions) {
            String maskViewContainerClass = sentryOptions.getSessionReplay().getMaskViewContainerClass();
            if (maskViewContainerClass == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), maskViewContainerClass);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, SentryOptions sentryOptions) {
            String unmaskViewContainerClass = sentryOptions.getSessionReplay().getUnmaskViewContainerClass();
            if (unmaskViewContainerClass == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), unmaskViewContainerClass);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean shouldMask(android.view.View r8, io.sentry.SentryOptions r9) {
            /*
                r7 = this;
                java.lang.Object r1 = r8.getTag()
                boolean r0 = r1 instanceof java.lang.String
                r5 = 0
                if (r0 == 0) goto L39
                java.lang.String r1 = (java.lang.String) r1
            Lb:
                r4 = 2
                java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L2a
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r1 = r1.toLowerCase(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                if (r1 == 0) goto L2a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r0 = "sentry-unmask"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = kotlin.text.StringsKt.contains$default(r1, r0, r3, r4, r5)
                if (r0 != r2) goto L2a
            L29:
                return r3
            L2a:
                int r0 = io.sentry.android.replay.R.id.sentry_privacy
                java.lang.Object r1 = r8.getTag(r0)
                java.lang.String r0 = "unmask"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 == 0) goto L3b
                goto L29
            L39:
                r1 = r5
                goto Lb
            L3b:
                java.lang.Object r1 = r8.getTag()
                boolean r0 = r1 instanceof java.lang.String
                if (r0 == 0) goto L6e
                java.lang.String r1 = (java.lang.String) r1
            L45:
                if (r1 == 0) goto L5f
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r1 = r1.toLowerCase(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                if (r1 == 0) goto L5f
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r0 = "sentry-mask"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = kotlin.text.StringsKt.contains$default(r1, r0, r3, r4, r5)
                if (r0 != r2) goto L5f
            L5e:
                return r2
            L5f:
                int r0 = io.sentry.android.replay.R.id.sentry_privacy
                java.lang.Object r1 = r8.getTag(r0)
                java.lang.String r0 = "mask"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 == 0) goto L70
                goto L5e
            L6e:
                r1 = r5
                goto L45
            L70:
                boolean r0 = r7.isMaskContainer(r8, r9)
                if (r0 != 0) goto L8c
                android.view.ViewParent r0 = r8.getParent()
                if (r0 == 0) goto L8c
                android.view.ViewParent r1 = r8.getParent()
                java.lang.String r0 = "this.parent"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                boolean r0 = r7.isUnmaskContainer(r1, r9)
                if (r0 == 0) goto L8c
                return r3
            L8c:
                java.lang.Class r2 = r8.getClass()
                io.sentry.SentryReplayOptions r0 = r9.getSessionReplay()
                java.util.Set r1 = r0.getUnmaskViewClasses()
                java.lang.String r0 = "options.sessionReplay.unmaskViewClasses"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                boolean r0 = r7.isAssignableFrom(r2, r1)
                if (r0 == 0) goto La4
                return r3
            La4:
                java.lang.Class r2 = r8.getClass()
                io.sentry.SentryReplayOptions r0 = r9.getSessionReplay()
                java.util.Set r1 = r0.getMaskViewClasses()
                java.lang.String r0 = "options.sessionReplay.maskViewClasses"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                boolean r0 = r7.isAssignableFrom(r2, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.Companion.shouldMask(android.view.View, io.sentry.SentryOptions):boolean");
        }

        public final ViewHierarchyNode fromView(View view, ViewHierarchyNode viewHierarchyNode, int i2, SentryOptions options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair<Boolean, Rect> pairIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = pairIsVisibleToUser.component1().booleanValue();
            Rect rectComponent2 = pairIsVisibleToUser.component2();
            boolean z2 = zBooleanValue && shouldMask(view, options);
            if (view instanceof TextView) {
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                TextView textView = (TextView) view;
                Layout layout = textView.getLayout();
                return new TextViewHierarchyNode(layout != null ? new AndroidTextLayout(layout) : null, Integer.valueOf(ViewsKt.toOpaque(textView.getCurrentTextColor())), textView.getTotalPaddingLeft(), ViewsKt.getTotalPaddingTopSafe(textView), textView.getX(), textView.getY(), textView.getWidth(), textView.getHeight(), (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f) + textView.getElevation(), i2, viewHierarchyNode, z2, true, zBooleanValue, rectComponent2);
            }
            if (!(view instanceof ImageView)) {
                return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f) + view.getElevation(), i2, viewHierarchyNode, z2, false, zBooleanValue, rectComponent2);
            }
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            ImageView imageView = (ImageView) view;
            return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i2, viewHierarchyNode, z2 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rectComponent2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007f\u0007lmA0RnP.XT2\u000f\u0002{<$a$wHQ٥J}P\b\u00108wk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004ym\u0016\u001d5Zom7]sK>xtd\t060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\u0010\"8FpHZ%O\u001b\u0019@\u0005N&\u0007\u001ejpf6vvm@5#\u0011tZNUi@\u0003S\rT`?\r%k.3F7C\"=U\u0019\u0006\u0001iύ\u0007?\u007fLބl7"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNj>R{=!\u0016X~R+\u001fg]A1jQ5\"\u001c\u0015S\u0001;>", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "F", "", "G", "EhSA[", "", "6dX4[;", "3kTCT;B]\"", "2hbAT5<S", ">`a2a;", "Ag^B_+&O'\u0005", "", "7r8:c6Kb\u0015\b\n?6\nf9n\u000f(\u0005O^\u0013\"V\u007f\u001b<", "7rE6f0;Z\u0019", "Dhb6U3>@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "uE5\u0016<\r\":\u001d\tDl,\u0006\u0018<yI$\u0005?\u000e!\u001bF9\u001b<\u0002,1mG1;m(1QCHgA\u001c\u0018|+*\u000bc>1z'TH[*_f[G\u0013\u00120\u0003C s\u0001b@1xH6h\n9E\r>l~\u001a_z5h\u007f\u0018\u001a\u0001", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 0;

        public GenericViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect) {
            super(f2, f3, i2, i3, f4, i4, viewHierarchyNode, z2, z3, z4, rect, null);
        }

        public /* synthetic */ GenericViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, f3, i2, i3, f4, i4, (i5 & 64) != 0 ? null : viewHierarchyNode, (i5 + 128) - (i5 | 128) != 0 ? false : z2, (-1) - (((-1) - i5) | ((-1) - 256)) != 0 ? false : z3, (i5 & 512) == 0 ? z4 : false, (-1) - (((-1) - i5) | ((-1) - 1024)) == 0 ? rect : null);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007f\u0007lmA0RnP.XT2\u000f\u0002{<$a$wHQ٥J}P\b\u00108wk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004ym\u0016\u001d5Zom7]sK>xtd\t060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\u0010\"8FpHZ%O\u001b\u0019@\u0005N&\u0007\u001ejpf6vvm@5#\u0011tZNUi@\u0003S\rT`?\r%k.3F7C\"=U\u0019\u0006\u0001iύ\u0007?\u007fLބl7"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNj@Zn?\u0014\u0003^\u000e`\u000e\u0011\u0005f=1lGK\b\u0012+IW", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "F", "", "G", "EhSA[", "", "6dX4[;", "3kTCT;B]\"", "2hbAT5<S", ">`a2a;", "Ag^B_+&O'\u0005", "", "7r8:c6Kb\u0015\b\n?6\nf9n\u000f(\u0005O^\u0013\"V\u007f\u001b<", "7rE6f0;Z\u0019", "Dhb6U3>@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "uE5\u0016<\r\":\u001d\tDl,\u0006\u0018<yI$\u0005?\u000e!\u001bF9\u001b<\u0002,1mG1;m(1QCHgA\u001c\u0018|+*\u000bc>1z'TH[*_f[G\u0013\u00120\u0003C s\u0001b@1xH6h\n9E\r>l~\u001a_z5h\u007f\u0018\u001a\u0001", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 0;

        public ImageViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect) {
            super(f2, f3, i2, i3, f4, i4, viewHierarchyNode, z2, z3, z4, rect, null);
        }

        public /* synthetic */ ImageViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, f3, i2, i3, f4, i4, (-1) - (((-1) - i5) | ((-1) - 64)) != 0 ? null : viewHierarchyNode, (-1) - (((-1) - i5) | ((-1) - 128)) != 0 ? false : z2, (i5 + 256) - (i5 | 256) != 0 ? false : z3, (i5 & 512) == 0 ? z4 : false, (i5 + 1024) - (i5 | 1024) == 0 ? rect : null);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ŝa:ڎs;\u0004\u0019>C\u0019U\\g\u007fp`Y9D\u001f\f$z\u0003._T'^\"\u0015@E\bAIL\u001e>˃dtD\th;0D\u0012\u0007\u0017\u0019XIVΓ{\fT\u001a\u001fHB\u00079\u0001\u000e\u0014ů\u001bZ\u000fL.\u0019 rf|7\u000fȔ^\u0003Z1\u0012\u0002B|ϋ\u00108\u0003M\u001bFl)#u\u0010\u001f[H=5#'k\u0005\u001dQ\n@3Gw=\u0013k?)AH\"X|ޠ~\\&9_%]!7\r\u000b_r$)AN\u0012J\u0017̂)@\u0002\n T\u0004<\u001amϵ-u!t\u001d&3#\t\u001aŊORoP\u007f\u0013cL\u0016S\u0001Ĵ/?#ƘicA\u001e\\=L\u001f\u001b ;\u0003\u0005 \nUdֲ!ôX\u0004YĸiBCO\\\u0010y?s\f~kRD\u00123_\u0002Ez?/m\u00adC٦=/)ǽ\u001aJJq\u0005\u000b\u0001jYt`Qـ&\u0006"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNjC0N*\u0014 j\u0015]\u0001", "", ":bP", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "<nS2F<;b&~z", "=sW2e\u0015HR\u0019l\u000b[;\n\t/", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004WMz%G\\\u0002 Di#,PW\u0005\\8\u001e'Ke9\u0014_9Ly;0VM,29vG] Z\u0017]8!NUJ#{N;\u001eQ9I\rBd\u0015U'\u00125|sFV\u001dC\u0007\u0013xUrYJYq\\KAR^7b\u000fs\u0006f9:yzu#dvP7\u0019\tgZn[xtqK\u0018DE$ItWZ\u000f\u0001Y<\u0007*#K\ts\u001f0[\tte1\u0004F\r:d\u0012Gt\u0016Ara\u001f+\\\u0017j\u0017", "5dc\u0019V(", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006\b)5k\u0001$7z\u0012;KFO5%\"\u0015zD=\u0007p([t*[5X+\\(", "5dc\u001bb+>A){\nk,|", "Adc\u001bb+>A){\nk,|", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004WMz%G\\\u0002 Di#,PW\u0005\\8\u001e'Ke9\u0014_9Ly;0VM,2\u0016c", "5dc\u001cg/>`\u0002\ty^\u001a\r\u0006>r\u007f(", "Adc\u001cg/>`\u0002\ty^\u001a\r\u0006>r\u007f(", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class LCAResult {
        private final ViewHierarchyNode lca;
        private ViewHierarchyNode nodeSubtree;
        private ViewHierarchyNode otherNodeSubtree;

        public LCAResult(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i2, Object obj) {
            if ((1 & i2) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i2 & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        public final ViewHierarchyNode component1() {
            return this.lca;
        }

        public final ViewHierarchyNode component2() {
            return this.nodeSubtree;
        }

        public final ViewHierarchyNode component3() {
            return this.otherNodeSubtree;
        }

        public final LCAResult copy(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3) {
            return new LCAResult(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) obj;
            return Intrinsics.areEqual(this.lca, lCAResult.lca) && Intrinsics.areEqual(this.nodeSubtree, lCAResult.nodeSubtree) && Intrinsics.areEqual(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\bnjG5LeN3ZS8\u0018s{:%c$\bCCU \u0006(\u000eeȞ\u0018g\u001dI\u001bŧB\u001f\u000e\u001cxx,aW\u000f\\@\u0010BJu?AO\b?O_#9\u0015&8\"F}\u001d\u0001H-X\u0016|zQP$\u0012^C\u0001>`\u0013e\u0005H\u0019\u0016B.\t6\\\u0016UFLzfR/Q\u0006yF\\1w0+P\u001dJb2%v\u0010%;DEA-%\u0002\u0006\u0017Za?\u0011L\n?\u001bgU&;OyWDf\u0018\u0014C:_\u0013cr4l\u001dQ\u000f\u001b71UcYa&(&\n\f\u0015B\u0004\u001c\u0018?JD,Hyڿ\u00123\u0003\u0007$S^\u0004vD\u0016y\u00109а)\b;+G2~SgP'd\b\r\u0013\r6%\u0017mO\\ڍ\u0012f\u001dÑlyWI_Y\u000eW\\\u000eq=\u001c\u0007Ͳf\b2ʶHI\u0006I\n,~&3<s9Q$Ƞ\u0006NLϙ\u000f\u0007f\u0005a\u0005ʖL]"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKNjKR\u0006L\u0005\u0016Z 1/\r\u0012UN\"qX )\u0007,\u001f", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", ":`h<h;", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~H}3FT\u0012BWSJA", "2n\\6a(Gbv\t\u0002h9", "", ">`S1\\5@:\u0019\u007f\n", ">`S1\\5@B#\n", "F", "", "G", "EhSA[", "6dX4[;", "3kTCT;B]\"", "2hbAT5<S", ">`a2a;", "Ag^B_+&O'\u0005", "", "7r8:c6Kb\u0015\b\n?6\nf9n\u000f(\u0005O^\u0013\"V\u007f\u001b<", "7rE6f0;Z\u0019", "Dhb6U3>@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004WL\u0006)<#l J||*aMKz\n\u0005\u001adr5Pj(Wxp+U],^R\u007f\u0013wu;n2\u000fmh@E.8R7(\u00179]K7q\u007f\u0019 \u001244}Ba\u0017C\u000e^\u0007E)zI]_\u0007CNCe>.|c\u001dn\u001d>$!m&\u0019kd\u0017\u0014zSfgGnNcP\u0018\bB(=7]SAzX@r5h8{u!\b\u001ce", "5dc\u0011b4B\\\u0015\b\n<6\u0004\u0013<", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0019T@Hc(", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006\u000749`G\u000f7\u0001%\u0015IWE{Cs", "5dc\u001dT+=W\"\u0001a^-\f", "u(8", "5dc\u001dT+=W\"\u0001ih7", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;
        private final Integer dominantColor;
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public TextViewHierarchyNode(TextLayout textLayout, Integer num, int i2, int i3, float f2, float f3, int i4, int i5, float f4, int i6, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect) {
            super(f2, f3, i4, i5, f4, i6, viewHierarchyNode, z2, z3, z4, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i2;
            this.paddingTop = i3;
        }

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i2, int i3, float f2, float f3, int i4, int i5, float f4, int i6, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : textLayout, (i7 & 2) != 0 ? null : num, (i7 + 4) - (i7 | 4) != 0 ? 0 : i2, (-1) - (((-1) - i7) | ((-1) - 8)) != 0 ? 0 : i3, f2, f3, i4, i5, f4, i6, (-1) - (((-1) - i7) | ((-1) - 1024)) != 0 ? null : viewHierarchyNode, (i7 & 2048) != 0 ? false : z2, (i7 + 4096) - (i7 | 4096) != 0 ? false : z3, (i7 & 8192) == 0 ? z4 : false, (-1) - (((-1) - i7) | ((-1) - 16384)) == 0 ? rect : null);
        }

        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode$isObscured$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "=sW2e\u0015HR\u0019", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "7me<^,", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004WMz%G\\\u0002 Di#,PW\u0005\\8\u001e'Ke9\u0014_9Ly;0VM,2\u0016YB\u0010#VWU'\u0016\u0007#\u001e.xK7\u001b\u0011\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<ViewHierarchyNode, Boolean> {
        final /* synthetic */ ViewHierarchyNode $node;
        final /* synthetic */ ViewHierarchyNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
            super(1);
            viewHierarchyNode = viewHierarchyNode;
            viewHierarchyNode = viewHierarchyNode2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ViewHierarchyNode otherNode) {
            Intrinsics.checkNotNullParameter(otherNode, "otherNode");
            if (otherNode.getVisibleRect() == null || booleanRef.element || !otherNode.isVisible() || !otherNode.isImportantForContentCapture() || !otherNode.getVisibleRect().contains(viewHierarchyNode.getVisibleRect())) {
                return false;
            }
            if (otherNode.getElevation() > viewHierarchyNode.getElevation()) {
                booleanRef.element = true;
                return false;
            }
            if (otherNode.getElevation() == viewHierarchyNode.getElevation()) {
                LCAResult lCAResultFindLCA = viewHierarchyNode.findLCA(viewHierarchyNode, otherNode);
                ViewHierarchyNode viewHierarchyNodeComponent1 = lCAResultFindLCA.component1();
                ViewHierarchyNode viewHierarchyNodeComponent2 = lCAResultFindLCA.component2();
                ViewHierarchyNode viewHierarchyNodeComponent3 = lCAResultFindLCA.component3();
                if (!Intrinsics.areEqual(viewHierarchyNodeComponent1, otherNode) && viewHierarchyNodeComponent3 != null && viewHierarchyNodeComponent2 != null) {
                    booleanRef.element = viewHierarchyNodeComponent3.getDistance() > viewHierarchyNodeComponent2.getDistance();
                    return Boolean.valueOf(!booleanRef.element);
                }
            }
            return true;
        }
    }

    private ViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect) {
        this.f19776x = f2;
        this.f19777y = f3;
        this.width = i2;
        this.height = i3;
        this.elevation = f4;
        this.distance = i4;
        this.parent = viewHierarchyNode;
        this.shouldMask = z2;
        this.isImportantForContentCapture = z3;
        this.isVisible = z4;
        this.visibleRect = rect;
    }

    public /* synthetic */ ViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, i2, i3, f4, i4, (i5 + 64) - (i5 | 64) != 0 ? null : viewHierarchyNode, (i5 + 128) - (i5 | 128) != 0 ? false : z2, (i5 & 256) != 0 ? false : z3, (i5 & 512) == 0 ? z4 : false, (i5 + 1024) - (i5 | 1024) == 0 ? rect : null, null);
    }

    public /* synthetic */ ViewHierarchyNode(float f2, float f3, int i2, int i3, float f4, int i4, ViewHierarchyNode viewHierarchyNode, boolean z2, boolean z3, boolean z4, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, i2, i3, f4, i4, viewHierarchyNode, z2, z3, z4, rect);
    }

    public final LCAResult findLCA(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
        ViewHierarchyNode viewHierarchyNode3 = null;
        ViewHierarchyNode viewHierarchyNode4 = Intrinsics.areEqual(this, viewHierarchyNode) ? this : null;
        ViewHierarchyNode viewHierarchyNode5 = Intrinsics.areEqual(this, viewHierarchyNode2) ? this : null;
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            for (ViewHierarchyNode viewHierarchyNode6 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode6.findLCA(viewHierarchyNode, viewHierarchyNode2);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode4 = viewHierarchyNode6;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode5 = viewHierarchyNode6;
                }
            }
        }
        if (viewHierarchyNode4 != null && viewHierarchyNode5 != null) {
            viewHierarchyNode3 = this;
        }
        return new LCAResult(viewHierarchyNode3, viewHierarchyNode4, viewHierarchyNode5);
    }

    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f19776x;
    }

    public final float getY() {
        return this.f19777y;
    }

    public final boolean isImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    public final boolean isObscured(ViewHierarchyNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.parent != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.".toString());
        }
        if (node.visibleRect == null) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.isObscured.2
            final /* synthetic */ ViewHierarchyNode $node;
            final /* synthetic */ ViewHierarchyNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ViewHierarchyNode node2, ViewHierarchyNode this) {
                super(1);
                viewHierarchyNode = node2;
                viewHierarchyNode = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ViewHierarchyNode otherNode) {
                Intrinsics.checkNotNullParameter(otherNode, "otherNode");
                if (otherNode.getVisibleRect() == null || booleanRef.element || !otherNode.isVisible() || !otherNode.isImportantForContentCapture() || !otherNode.getVisibleRect().contains(viewHierarchyNode.getVisibleRect())) {
                    return false;
                }
                if (otherNode.getElevation() > viewHierarchyNode.getElevation()) {
                    booleanRef.element = true;
                    return false;
                }
                if (otherNode.getElevation() == viewHierarchyNode.getElevation()) {
                    LCAResult lCAResultFindLCA = viewHierarchyNode.findLCA(viewHierarchyNode, otherNode);
                    ViewHierarchyNode viewHierarchyNodeComponent1 = lCAResultFindLCA.component1();
                    ViewHierarchyNode viewHierarchyNodeComponent2 = lCAResultFindLCA.component2();
                    ViewHierarchyNode viewHierarchyNodeComponent3 = lCAResultFindLCA.component3();
                    if (!Intrinsics.areEqual(viewHierarchyNodeComponent1, otherNode) && viewHierarchyNodeComponent3 != null && viewHierarchyNodeComponent2 != null) {
                        booleanRef.element = viewHierarchyNodeComponent3.getDistance() > viewHierarchyNodeComponent2.getDistance();
                        return Boolean.valueOf(!booleanRef.element);
                    }
                }
                return true;
            }
        });
        return booleanRef.element;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setChildren(List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean z2) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = z2;
        }
    }

    public final void setImportantForContentCapture(boolean z2) {
        this.isImportantForContentCapture = z2;
    }

    public final void traverse(Function1<? super ViewHierarchyNode, Boolean> callback) {
        List<? extends ViewHierarchyNode> list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!callback.invoke(this).booleanValue() || (list = this.children) == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(callback);
        }
    }
}
