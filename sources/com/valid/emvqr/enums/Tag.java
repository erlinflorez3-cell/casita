package com.valid.emvqr.enums;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public interface Tag extends Serializable {
    Pattern getPattern();

    String getTag();

    boolean isMandatory();
}
