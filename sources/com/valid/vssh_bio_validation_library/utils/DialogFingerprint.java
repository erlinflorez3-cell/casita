package com.valid.vssh_bio_validation_library.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.valid.vssh_bio_validation_library.model.DialogBuilderModel;
import com.valid.vssh_bio_validation_library_embed.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯT\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`S2\u000fq{<$i-yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0014\u00172P{G\u074cUoK?hҚ<\u00196݅R8(\u0004A\u001dݵL\u0010\u0005z\fO\u001a\u0019H@\u001fB\u001b\u001b[\u000e2\u00124FP\u0005,f\u007fNdS3]\u0003W1\u000f\u0002Dd&\u000e=-Q\u001bTl';\u0006\u0012&1?EE-'i\u00025c\fG\t>\u007fO\u001dj=&Y\\:k~d\u000e(-+}\u0015\u000ev4q\u001dQ\u000f\u000eoA]ycP<0(~\n$T\u0004<\u001eWL<F2f6(yyC_NQ\u001a^p\u0002Qʫbа)\u007f;ٿ\n'tTy;GR\u000eީ1ڟ\"#\t͙qgb\u0013x\u0015IZNΆ]ҨD=Pݐ̌]X"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^Ge5\u000em./z0IL[7iV{Li", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]U+CSX.=_n?\u001c\u0012c\u001d$", "u(E", "2hP9b.&]\u0018~\u0002B5}\u0013", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017KEj4%^Ge5\u000em.+\u0007+NKN9D\\q=\u001bg", "7u80b5", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "Bu76a;", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "1k^@X\rB\\\u001b~\bI9\u0001\u0012>P\n3kK", "", "2hb=_(R2\u0015\u000ev", "7r19b*DS\u0018n\t^9", "", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Adc\u0011\\(E]\u001b[\u000bb3{\t<M\n'{G", "2hP9b.\u001bc\u001d\u0006y^9d\u0013.e\u0007", "CoS.g,,b\u0015\u000ezI6\bx:", "6h]A", "", "AsPAh:\u001c]\u0018~", "", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public class DialogFingerprint extends BottomSheetDialogFragment {
    private DialogBuilderModel dialogModelInfo;
    private ImageView ivIcon;
    private TextView tvHint;

    public static final /* synthetic */ ImageView access$getIvIcon$p(DialogFingerprint dialogFingerprint) {
        ImageView imageView = dialogFingerprint.ivIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ZO.xd("\\\u0013\f4mU", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831072925)), (short) (C1580rY.Xd() ^ ((1914084183 ^ 1578745861) ^ (-739192832)))));
        }
        return imageView;
    }

    public static final /* synthetic */ TextView access$getTvHint$p(DialogFingerprint dialogFingerprint) {
        TextView textView = dialogFingerprint.tvHint;
        if (textView == null) {
            short sXd = (short) (OY.Xd() ^ (FB.Xd() ^ (985764677 ^ 1697547621)));
            short sXd2 = (short) (OY.Xd() ^ ((719499675 ^ 1559296697) ^ 1980916404));
            int[] iArr = new int["3@dZgy".length()];
            QB qb = new QB("3@dZgy");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Intrinsics.throwUninitializedPropertyAccessException(new String(iArr, 0, i2));
        }
        return textView;
    }

    private final void displayData(final boolean z2) throws Throwable {
        int iXd = OY.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("\u001c_\b2vC\u00160\u0012v7/\u0007\t\u000ea!", (short) (iXd ^ ((1393467581 ^ 1060611360) ^ 1815698925)))).getDeclaredMethod(EO.Od("\u0013j;o|*W\\3\u0013i\te", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864712080)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.valid.vssh_bio_validation_library.utils.DialogFingerprint.displayData.1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (z2) {
                        DialogFingerprint.this.closeFingerPrintPopUp();
                        return;
                    }
                    TextView textViewAccess$getTvHint$p = DialogFingerprint.access$getTvHint$p(DialogFingerprint.this);
                    textViewAccess$getTvHint$p.setText(C1561oA.yd("\u0017125,e*0Z-\u001e&2-/[\u0017\u0017P\u0018,\u001b! \f\u001dH\f\u0018\u0015\u0016 \u0004\u000e\u0006\u0013", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (205798648 ^ (-1036870831))))));
                    textViewAccess$getTvHint$p.getTextColors();
                    Context context = textViewAccess$getTvHint$p.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, C1561oA.Yd("GTT[Ma^", (short) (C1499aX.Xd() ^ (25409342 ^ (-25417273)))));
                    short sXd = (short) (Od.Xd() ^ (596066788 ^ (-596056962)));
                    int iXd2 = Od.Xd();
                    Object[] objArr2 = new Object[0];
                    int iXd3 = Od.Xd() ^ 1207823077;
                    Method method = Class.forName(Xg.qd("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rh\u0016\u0016\u001d\u000f# ", sXd, (short) (iXd2 ^ (1400010184 ^ (-1399995313))))).getMethod(Jg.Wd("{9\f){I\tN\u0013C\tV", (short) (ZN.Xd() ^ ((1902632654 ^ 644330952) ^ 1459629270)), (short) (ZN.Xd() ^ iXd3)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        textViewAccess$getTvHint$p.setTextColor(((Resources) method.invoke(context, objArr2)).getColor(R.color.design_dark_default_color_on_error));
                        DialogFingerprint.access$getIvIcon$p(DialogFingerprint.this).setImageResource(R.drawable.ic_fingerprint);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            };
            Class<?> cls = Class.forName(C1561oA.Qd("v\u0003w\u0005\u0001ys<|\u007f9Rjvkrjv", (short) (C1607wl.Xd() ^ (1276209235 ^ 1276188050))));
            Class<?>[] clsArr = new Class[45268056 ^ 45268058];
            clsArr[0] = Class.forName(C1593ug.zd("kcye3rhvp8]\u0002{|pr}w", (short) (FB.Xd() ^ (1246409030 ^ 1246418727)), (short) (FB.Xd() ^ ((489172310 ^ 163950204) ^ 351138168))));
            clsArr[1] = Long.TYPE;
            Object[] objArr2 = new Object[1023796133 ^ 1023796135];
            objArr2[0] = runnable;
            objArr2[1] = Long.valueOf((9139231226466723976L ^ 8574988054636462960L) ^ 708587230132166720L);
            Method method = cls.getMethod(C1561oA.od("\u0003\u0001\u0004\u0004Rrxl\u0004nl", (short) (C1607wl.Xd() ^ (2016404743 ^ 2016401861))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void closeFingerPrintPopUp() {
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, C1561oA.Kd("z\u0001y\u0001v\u000b|\u000b", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69932558)))));
        View viewInflate = layoutInflater.inflate(R.layout.content_dialog_custom, viewGroup, false);
        int iXd = ZN.Xd() ^ 864690286;
        Intrinsics.checkExpressionValueIsNotNull(viewInflate, Wg.Zd("|\u0014\u001ev}[^>\fY9C\u001c#\u0001\u0004\u0019\r5o\u0002Tf9\uf075%v\u000fVpHQ1tz\u0014!~\u007fDz#m\u007fRd7Q$?", (short) (ZN.Xd() ^ ((682518222 ^ 1073429310) ^ 391472865)), (short) (ZN.Xd() ^ iXd)));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvSubtitle);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tvDescription);
        View viewFindViewById = viewInflate.findViewById(R.id.tvHint);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, C1561oA.Xd("'_\u0019\u001d#\u001a\r!\u001e1|5\u0006\"f\u0012n+'q9<\u000f17>s", (short) (C1607wl.Xd() ^ ((1644932725 ^ 2092551125) ^ 514989219))));
        this.tvHint = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.ivIcon);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, Wg.vd("|5jnxo^rs\u0007N\u0007[w8cD\u0001xC\u0004\u0012a|\u000e\u000eE", (short) (C1499aX.Xd() ^ (1915061083 ^ (-1915091574)))));
        this.ivIcon = (ImageView) viewFindViewById2;
        Intrinsics.checkExpressionValueIsNotNull(textView, Qg.kd("\u0015\u0016r\u0007\u0011\b\u007f", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69947114))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831075197))));
        DialogBuilderModel dialogBuilderModel = this.dialogModelInfo;
        int iXd2 = C1607wl.Xd() ^ (333621243 ^ 2108064066);
        String strVd = hg.Vd("\u0013\u0017\u000e\u0018\u001a\u0011u\u0017\u000b\u000b\u0011l\u0011\b\u0010", (short) (C1607wl.Xd() ^ (1453540269 ^ 1453532715)), (short) (C1607wl.Xd() ^ iXd2));
        if (dialogBuilderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(strVd);
        }
        textView.setText(dialogBuilderModel.getTitle());
        Intrinsics.checkExpressionValueIsNotNull(textView2, C1561oA.ud("deAbN_S]TL", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207810079))));
        DialogBuilderModel dialogBuilderModel2 = this.dialogModelInfo;
        if (dialogBuilderModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(strVd);
        }
        textView2.setText(dialogBuilderModel2.getSubTitle());
        Intrinsics.checkExpressionValueIsNotNull(textView3, C1561oA.yd("?@\r-:)7-CF:?=", (short) (Od.Xd() ^ (1880710355 ^ (-1880690223)))));
        DialogBuilderModel dialogBuilderModel3 = this.dialogModelInfo;
        if (dialogBuilderModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(strVd);
        }
        textView3.setText(dialogBuilderModel3.getDescription());
        View viewFindViewById3 = viewInflate.findViewById(R.id.tvCancel);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, C1561oA.Yd("\u0003;tx~uh|y\rX\u0011a}BmJ\u0007\u0003M\u0015\u0018e\u0005\u0013\t\f\u0014Q", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (829569148 ^ (-16465107))))));
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.valid.vssh_bio_validation_library.utils.DialogFingerprint.onCreateView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    DialogFingerprint.this.closeFingerPrintPopUp();
                    InstanceBioValidationManager.INSTANCE.getCancellationSignalInstance().cancel();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        return viewInflate;
    }

    public final void setDialogBuilderModel(DialogBuilderModel dialogBuilderModel) {
        Intrinsics.checkParameterIsNotNull(dialogBuilderModel, Xg.qd(")/(481\rA6:35C\u001fB8:B", (short) (C1607wl.Xd() ^ ((626078306 ^ 331070817) ^ 921365065)), (short) (C1607wl.Xd() ^ (140069417 ^ 140078371))));
        this.dialogModelInfo = dialogBuilderModel;
    }

    public final void updateStatePopUp(String str, int i2) throws Throwable {
        Intrinsics.checkParameterIsNotNull(str, Jg.Wd("oI7&", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207805991)), (short) (ZN.Xd() ^ ((1260125145 ^ 1570830106) ^ 381360445))));
        TextView textView = this.tvHint;
        if (textView == null) {
            int iXd = Od.Xd() ^ (1536402823 ^ 476977687);
            int iXd2 = C1580rY.Xd() ^ (147181282 ^ (-961327108));
            short sXd = (short) (FB.Xd() ^ iXd);
            short sXd2 = (short) (FB.Xd() ^ iXd2);
            int[] iArr = new int["u\u001fWvRH".length()];
            QB qb = new QB("u\u001fWvRH");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            Intrinsics.throwUninitializedPropertyAccessException(new String(iArr, 0, i3));
        }
        textView.setText(str);
        Context context = textView.getContext();
        int iXd3 = OY.Xd() ^ 69939638;
        Intrinsics.checkExpressionValueIsNotNull(context, C1626yg.Ud("6\u0016,:3F&", (short) (C1607wl.Xd() ^ (152948973 ^ 152931315)), (short) (C1607wl.Xd() ^ iXd3)));
        int iXd4 = FB.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd(",c\f:f3\u0002,&B?k)\u0004&F\u0012<c\u0012G\u0007\\", (short) (iXd4 ^ (1624223181 ^ 1624234349)))).getMethod(EO.Od("S\u001a;<7r>\\$eeU", (short) (FB.Xd() ^ (1238982727 ^ 1238964521))), new Class[0]);
        try {
            method.setAccessible(true);
            textView.setTextColor(((Resources) method.invoke(context, objArr)).getColor(R.color.design_default_color_error));
            ImageView imageView = this.ivIcon;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1561oA.Qd("lxJcnl", (short) (FB.Xd() ^ (603027909 ^ 603012699))));
            }
            imageView.setImageResource(R.drawable.ic_fingerprint_error);
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                    displayData(false);
                    return;
                case 6:
                default:
                    return;
                case 7:
                    displayData(true);
                    return;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
