package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:&c$\bCCU \u0001*\teNogtNb\u000bQ\u000f\u000e\u0016~n4Ic\u0005e܈\u00172PxG3SrSʠ\u0011td\u0004`=2<\b\u0005\u0019\u001aXIǘzzQMT%>Z\t:\u0001(}\u000b(.\u001e@6\u007fL`ʄR6V\n&M=A\u001bipiWe>\u001ce\u000f\\SU\u0011țe\u001e9]\u007fI#Ek\u00035m\fC\u0011`\n=3\u000bW+9l\fWd|H'#Pg\r\f\u000eVb\u0013wx\u000e=*}gׂT\u000e6\u0015C\u000f\u001bc\u001c\u000e4Bx4;B~\n$2#vՂDP\u0010{\u0013\u0010\tdN\u0019;~a/\u0010ӘrЂe=!NE\u0001U\u001b,)\u0019p7Z\u0003\u00157ڀ'ƻ{Q9҅\u0011WVV\"a[w,rx\u0001X\r^P6oR\u00800ϲ);s;),y\u000e\u0019Xu\u0004\u001db~R\u0018`~\u0001xÅ\u0018֖.\r$\\Js\u0013{!nf=)U:^/\u007f\u001e\u0012Ne&EWefʝQŹmne_\u00107=r\bs|~&_Wh[7gb>u\u0001\u000bJ\u007f\u0013ϸ\u0007ֽjFk\u000e`q68\u0003`x\u0010\u0010{rObƕ>Ɛu(<ιI\u001bb,V\u001b>DG\u0016\u0017a˜l9"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#8J\u0002 IN ;U?Jz4+j", "", "AdP?V//W\u0019\u0011", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W*v!BW\u0001\u0011;m(\u0004", "uKP;W9HW\u0018\u0012DZ7\b\u00079m\u000b$\u000b\n\u0013\u001b\u0016Io\u001d\u0006d%1f{#(q\u0016@#\u0007,", "2dU.h3MB\u0019\u0012\n<6\u0004\u0013<", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "2dU.h3MB\u001d\b\n;(z\u000f1r\n8\u0005?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "AdP?V/\u001cZ#\rzB*\u0007\u0012", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc X(KQ\u001c\\\u0002h:|l-o\t", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo \u0012", "AdP?V/\u001eR\u001d\u000ei^?\f", "\u001a`]1e6BRb\u0011~].|\u0018xE~,\u000b/\u0001*&\u001d", "5dc X(KQ\u001c^yb;k\tBt", "u(;.a+K]\u001d}Dp0{\u000b/tI\bzD\u0010\u0006\u0017Z~c", "AdP?V/\"Q#\b", "5dc X(KQ\u001cbxh5", "AdP?V/-S,\u000eee(\f\t", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc X(KQ\u001cmzq;g\u0010+t\u007f", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "5dc X(KQ\u001co~^>", "u(;.a+K]\u001d}\u000e((\b\u0014-o\b3wOJ)\u001bFq\u000eK@\u00135U\u000b\u001e:^\u001a._\u0019", "Adc X(KQ\u001co~^>", "Adc\u0015X(=S&bxh5Z\u00136o\r", "", "6dP1X9\"Q#\bXh3\u0007\u0016", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "Adc\u0015\\5MB\u0019\u0012\n<6\u0004\u0013<", "6h]AG,Qbv\t\u0002h9", "Adc\u001d_(<S\u001c\t\u0002],\n", ">kP0X/HZ\u0018~\b", "", "Ag^B_+,V#\u0011]b5\fv/a\r&~$~! ", "", "Adc!X?M1#\u0006\u0005k", "BdgA66E]&", "Adc!\\5M1#\u0006\u0005k", "Bh]A66E]&", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SearchViewFormatter {
    private Integer defaultTextColor;
    private Drawable defaultTintBackground;
    private SearchView searchView;

    public SearchViewFormatter(SearchView searchView) {
        Intrinsics.checkNotNullParameter(searchView, "searchView");
        this.searchView = searchView;
    }

    private final ImageView getSearchCloseIcon() {
        return (ImageView) this.searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
    }

    private final EditText getSearchEditText() {
        View viewFindViewById = this.searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView getSearchIcon() {
        return (ImageView) this.searchView.findViewById(androidx.appcompat.R.id.search_button);
    }

    private final View getSearchTextPlate() {
        return this.searchView.findViewById(androidx.appcompat.R.id.search_plate);
    }

    public final SearchView getSearchView() {
        return this.searchView;
    }

    public final void setHeaderIconColor(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            getSearchIcon().setColorFilter(iIntValue);
            getSearchCloseIcon().setColorFilter(iIntValue);
        }
    }

    public final void setHintTextColor(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            EditText searchEditText = getSearchEditText();
            if (searchEditText != null) {
                searchEditText.setHintTextColor(iIntValue);
            }
        }
    }

    public final void setPlaceholder(String placeholder, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        if (z2) {
            this.searchView.setQueryHint(placeholder);
            return;
        }
        EditText searchEditText = getSearchEditText();
        if (searchEditText == null) {
            return;
        }
        searchEditText.setHint(placeholder);
    }

    public final void setSearchView(SearchView searchView) {
        Intrinsics.checkNotNullParameter(searchView, "<set-?>");
        this.searchView = searchView;
    }

    public final void setTextColor(Integer num) {
        EditText searchEditText;
        ColorStateList textColors;
        Integer num2 = this.defaultTextColor;
        if (num == null) {
            if (num2 == null || (searchEditText = getSearchEditText()) == null) {
                return;
            }
            searchEditText.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText searchEditText2 = getSearchEditText();
            this.defaultTextColor = (searchEditText2 == null || (textColors = searchEditText2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText searchEditText3 = getSearchEditText();
        if (searchEditText3 != null) {
            searchEditText3.setTextColor(num.intValue());
        }
    }

    public final void setTintColor(Integer num) {
        Drawable drawable = this.defaultTintBackground;
        if (num != null) {
            if (drawable == null) {
                this.defaultTintBackground = getSearchTextPlate().getBackground();
            }
            getSearchTextPlate().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            getSearchTextPlate().setBackground(drawable);
        }
    }
}
