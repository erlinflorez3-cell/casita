package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class IdValidationResult {
    private String backIdBase64;
    private String backIdPath;
    private int backIdResult;
    private String frontIdBase64;
    private String frontIdCroppedFacePath;
    private String frontIdPath;
    private int frontIdResult;
    private IdCategory idCategory;
    private IncodeWelcome.OCRData ocrData;

    public String getFrontIdPath() {
        return this.frontIdPath;
    }

    public void setFrontIdPath(String str) {
        this.frontIdPath = str;
    }

    public String getFrontIdCroppedFacePath() {
        return this.frontIdCroppedFacePath;
    }

    public void setFrontIdCroppedFacePath(String str) {
        this.frontIdCroppedFacePath = str;
    }

    public void setIdCategory(IdCategory idCategory) {
        this.idCategory = idCategory;
    }

    public int getFrontIdResult() {
        return this.frontIdResult;
    }

    public void setFrontIdResult(int i2) {
        this.frontIdResult = i2;
    }

    public String getBackIdPath() {
        return this.backIdPath;
    }

    public void setBackIdPath(String str) {
        this.backIdPath = str;
    }

    public int getBackIdResult() {
        return this.backIdResult;
    }

    public void setBackIdResult(int i2) {
        this.backIdResult = i2;
    }

    public IncodeWelcome.OCRData getOcrData() {
        return this.ocrData;
    }

    public IdCategory getIdCategory() {
        return this.idCategory;
    }

    public void setOcrData(IncodeWelcome.OCRData oCRData) {
        this.ocrData = oCRData;
    }

    public String getFrontIdBase64() {
        return this.frontIdBase64;
    }

    public void setFrontIdBase64(String str) {
        this.frontIdBase64 = str;
    }

    public String getBackIdBase64() {
        return this.backIdBase64;
    }

    public void setBackIdBase64(String str) {
        this.backIdBase64 = str;
    }

    public String toString() {
        return "IdValidationResult{frontIdPath='" + this.frontIdPath + "', frontIdCroppedFacePath='" + this.frontIdCroppedFacePath + "', frontIdResult=" + this.frontIdResult + ", backIdPath='" + this.backIdPath + "', backIdResult=" + this.backIdResult + ", ocrData=" + this.ocrData + ", idCategory=" + this.idCategory + ", frontIdBase64=" + this.frontIdBase64 + ", backIdBase64=" + this.backIdBase64 + AbstractJsonLexerKt.END_OBJ;
    }

    public IdValidationResult(String str, String str2, int i2, String str3, int i3, IncodeWelcome.OCRData oCRData, IdCategory idCategory, String str4, String str5) {
        this.frontIdPath = str;
        this.frontIdCroppedFacePath = str2;
        this.frontIdResult = i2;
        this.backIdPath = str3;
        this.backIdResult = i3;
        this.ocrData = oCRData;
        this.idCategory = idCategory;
        this.frontIdBase64 = str4;
        this.backIdBase64 = str5;
    }

    public IdValidationResult() {
    }
}
