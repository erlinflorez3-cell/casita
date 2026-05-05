package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\r-4\u0012\u000e\u0007nj?0LeV4ZS0\u0010s{B$c$wDCU0}*\teNogtMrŐC\u001dإ.x\u0019+qU']Bq8F}@K*\u007fPIq\u000b53#ݨ&B\u007f\t\u0011 0M x\u0001Iq\u0012\"AP\u007fhYҫQ\u000f \u0016\u0016D&\u0006.^mT\\P|nJ>Q\nݦFX-c@\u0003S\u0012VV-\u0013\u001dj.<PFc\u001cȏW\r\rVkE\tD\u0002?\u000bnM1;K\u0004Wdc.\u0016E\u000eU\u0011k~>9\u0015dp\u001d=*}fׂT\u0018.{\u000b\u0002\u0013A\u0014\u0010\f-n4=+v\u0017<:Ϣv]FT\u0012dH\u0005\u000bc<\u001dK\bC<I*\u0015Xň?#T;\f\u000b\u0013#3\u0003t'\u0002a\u001eq%*\u0003~Φ5[FAXT\u0010^Mo\nv\t\u000b:\u0006@G.:*\u0013^:+;iG;>{\u0015XU}u3pĈWsXLP(t\u001bG,\u000f\u0012\u0001Jt\u0007{P\u0003cZ \u0014ɃZ\u001f0\u0016$8\\&;I%>N\u007f\fol[o\"B?yGj\u0005j<gߍb=;Us\u0016gW\u0007\u0016EB\t\u000bhhRS:e\u000b7hüN\u0003\u0002\u0006\u000f\\N:\u0012Z? \u001cd\u000f7\u001bj'`_.UQ\u000e\u001f^\tkʐ\u0003^9(\u0013o*y\u0019\u0003Vb\u0017uw\nY;+gĘ1KW9),['x6\u0003)-\u0007\u0004\u0011WvzNƥp {Y\f&\u001c\u001fIS5C9\u0018\u000f:B\u0011[LʆvoWQ\"-\u0001\u0002\n\u0011AnTq\u0018l\u0001,\u000fuxQ\u001bϦ(\u000fP\u00017 d.x\nF)G\u00147\u0011]L[\u000b_iO^I\u0013\u0004M!ݵ\u0005y(\u0001E3I,-\u0018}\u001aU\u001bqny~\\\u0001ˏ\u00130zi\u00142i\u001b\u007fdWcXCHZi\u000el)ٝp\rHLz}\u000eG\u00196\u00139nNt\u0002fG{\u0012ɣ\u0002p\r0\u001dv\\`J\u0015u\u0004Z7o,\u0004C,\u001f\rEkݕSϲk\u0003"}, d2 = {"/cS!X?M1\u001cz\u0004`,{o3s\u000f(\u0005@\u000e", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u001awO~\u001a\u0017TE", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "0dU<e,-S,\u000eXa(\u0006\u000b/d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "BdgA", "", "AsP?g", "1nd;g", "/ec2e", "", "=mC2k;\u001cV\u0015\b|^+", "0dU<e,", "/ec2e\u001b>f(\\}Z5~\t.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb\u000ezq;Fh.i\u000f$xG\u0001l", "2n03g,KB\u0019\u0012\n</x\u00121e~", "/bc6b5", "2n12Y6KS\b~\u000em\n\u007f\u00058g\u007f'", "2n>;G,Qbv\u0002vg.|\b", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextViewKt {
    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, Function4 function4, Function4 function42, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            function4 = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.1
                public final void invoke(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((2 & i2) != 0) {
            function42 = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.2
                public final void invoke(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function1 = new Function1<Editable, Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Editable editable) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    invoke2(editable);
                    return Unit.INSTANCE;
                }
            };
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function42);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher addTextChangedListener(TextView textView, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function42, Function1<? super Editable, Unit> function1) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function42);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                function4.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                function4.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final Function1<? super Editable, Unit> function1) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                function1.invoke(editable);
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
