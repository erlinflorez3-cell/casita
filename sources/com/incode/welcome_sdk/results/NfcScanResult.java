package com.incode.welcome_sdk.results;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.core.view.ViewCompat;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class NfcScanResult extends BaseResult {
    public static final int $stable = 8;
    private final char compositeCheckDigit;
    private final String dateOfBirth;
    private final char dateOfBirthCheckDigit;
    private final String dateOfExpiry;
    private final char dateOfExpiryCheckDigit;
    private final String dg1EncodedData;
    private final String dg2EncodedData;
    private final String documentCode;
    private final String documentNumber;
    private final char documentNumberCheckDigit;
    private final Bitmap faceBitmap;
    private final String gender;
    private final String issuingStateOrOrganization;
    private final String nationality;
    private final String optionalData1;
    private final String optionalData2;
    private final String personalNumber;
    private final Character personalNumberCheckDigit;
    private final String primaryIdentifier;
    private final String secondaryIdentifier;
    private final String[] secondaryIdentifierComponents;
    private final String sodEncodedData;

    public NfcScanResult() {
        this(null, null, (char) 0, null, (char) 0, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode) {
        this(resultCode, null, (char) 0, null, (char) 0, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, (char) 0, null, (char) 0, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777212, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2) {
        this(resultCode, th, c2, null, (char) 0, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777208, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth) {
        this(resultCode, th, c2, dateOfBirth, (char) 0, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777200, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3) {
        this(resultCode, th, c2, dateOfBirth, c3, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777184, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777152, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777088, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776960, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776704, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776192, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, null, null, null, null, null, null, null, null, null, null, null, null, null, 16775168, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, null, null, null, null, null, null, null, null, null, null, null, null, 16773120, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, null, null, null, null, null, null, null, null, null, null, null, 16769024, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, null, null, null, null, null, null, null, null, null, null, 16760832, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, null, null, null, null, null, null, null, null, null, 16744448, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, null, null, null, null, null, null, null, null, 16711680, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, null, null, null, null, null, null, null, 16646144, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, primaryIdentifier, null, null, null, null, null, null, 16515072, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier, String secondaryIdentifier) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, primaryIdentifier, secondaryIdentifier, null, null, null, null, null, 16252928, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier, String secondaryIdentifier, String[] secondaryIdentifierComponents) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, primaryIdentifier, secondaryIdentifier, secondaryIdentifierComponents, null, null, null, null, 15728640, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifierComponents, "secondaryIdentifierComponents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier, String secondaryIdentifier, String[] secondaryIdentifierComponents, String dg1EncodedData) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, primaryIdentifier, secondaryIdentifier, secondaryIdentifierComponents, dg1EncodedData, null, null, null, 14680064, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifierComponents, "secondaryIdentifierComponents");
        Intrinsics.checkNotNullParameter(dg1EncodedData, "dg1EncodedData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier, String secondaryIdentifier, String[] secondaryIdentifierComponents, String dg1EncodedData, Bitmap bitmap) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, primaryIdentifier, secondaryIdentifier, secondaryIdentifierComponents, dg1EncodedData, bitmap, null, null, 12582912, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifierComponents, "secondaryIdentifierComponents");
        Intrinsics.checkNotNullParameter(dg1EncodedData, "dg1EncodedData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier, String secondaryIdentifier, String[] secondaryIdentifierComponents, String dg1EncodedData, Bitmap bitmap, String str2) {
        this(resultCode, th, c2, dateOfBirth, c3, dateOfExpiry, c4, documentCode, documentNumber, c5, gender, issuingStateOrOrganization, nationality, optionalData1, str, personalNumber, ch, primaryIdentifier, secondaryIdentifier, secondaryIdentifierComponents, dg1EncodedData, bitmap, str2, null, 8388608, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifierComponents, "secondaryIdentifierComponents");
        Intrinsics.checkNotNullParameter(dg1EncodedData, "dg1EncodedData");
    }

    public /* synthetic */ NfcScanResult(ResultCode resultCode, Throwable th, char c2, String str, char c3, String str2, char c4, String str3, String str4, char c5, String str5, String str6, String str7, String str8, String str9, String str10, Character ch, String str11, String str12, String[] strArr, String str13, Bitmap bitmap, String str14, String str15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ResultCode.SUCCESS : resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? Typography.less : c2, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? Typography.less : c3, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? Typography.less : c4, (i2 & 128) != 0 ? "TD3" : str3, (i2 & 256) != 0 ? "xxxxxxxxx" : str4, (i2 & 512) != 0 ? Typography.less : c5, (i2 & 1024) != 0 ? "UNSPECIFIED" : str5, (i2 & 2048) != 0 ? "XXX" : str6, (i2 & 4096) == 0 ? str7 : "XXX", (i2 & 8192) != 0 ? "" : str8, (i2 & 16384) != 0 ? "" : str9, (32768 & i2) != 0 ? "" : str10, (65536 & i2) != 0 ? Character.valueOf(Typography.less) : ch, (131072 & i2) != 0 ? "" : str11, (262144 & i2) != 0 ? "" : str12, (524288 & i2) != 0 ? new String[0] : strArr, (1048576 & i2) == 0 ? str13 : "", (2097152 & i2) != 0 ? null : bitmap, (4194304 & i2) != 0 ? null : str14, (i2 & 8388608) != 0 ? null : str15);
    }

    public final char getCompositeCheckDigit() {
        return this.compositeCheckDigit;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final char getDateOfBirthCheckDigit() {
        return this.dateOfBirthCheckDigit;
    }

    public final String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public final char getDateOfExpiryCheckDigit() {
        return this.dateOfExpiryCheckDigit;
    }

    public final String getDocumentCode() {
        return this.documentCode;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final char getDocumentNumberCheckDigit() {
        return this.documentNumberCheckDigit;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIssuingStateOrOrganization() {
        return this.issuingStateOrOrganization;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getOptionalData1() {
        return this.optionalData1;
    }

    public final String getOptionalData2() {
        return this.optionalData2;
    }

    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    public final Character getPersonalNumberCheckDigit() {
        return this.personalNumberCheckDigit;
    }

    public final String getPrimaryIdentifier() {
        return this.primaryIdentifier;
    }

    public final String getSecondaryIdentifier() {
        return this.secondaryIdentifier;
    }

    public final String[] getSecondaryIdentifierComponents() {
        return this.secondaryIdentifierComponents;
    }

    public final String getDg1EncodedData() {
        return this.dg1EncodedData;
    }

    public final Bitmap getFaceBitmap() {
        return this.faceBitmap;
    }

    public final String getDg2EncodedData() {
        return this.dg2EncodedData;
    }

    public final String getSodEncodedData() {
        return this.sodEncodedData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcScanResult(ResultCode resultCode, Throwable th, char c2, String dateOfBirth, char c3, String dateOfExpiry, char c4, String documentCode, String documentNumber, char c5, String gender, String issuingStateOrOrganization, String nationality, String optionalData1, String str, String personalNumber, Character ch, String primaryIdentifier, String secondaryIdentifier, String[] secondaryIdentifierComponents, String dg1EncodedData, Bitmap bitmap, String str2, String str3) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(issuingStateOrOrganization, "issuingStateOrOrganization");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(optionalData1, "optionalData1");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifierComponents, "secondaryIdentifierComponents");
        Intrinsics.checkNotNullParameter(dg1EncodedData, "dg1EncodedData");
        this.compositeCheckDigit = c2;
        this.dateOfBirth = dateOfBirth;
        this.dateOfBirthCheckDigit = c3;
        this.dateOfExpiry = dateOfExpiry;
        this.dateOfExpiryCheckDigit = c4;
        this.documentCode = documentCode;
        this.documentNumber = documentNumber;
        this.documentNumberCheckDigit = c5;
        this.gender = gender;
        this.issuingStateOrOrganization = issuingStateOrOrganization;
        this.nationality = nationality;
        this.optionalData1 = optionalData1;
        this.optionalData2 = str;
        this.personalNumber = personalNumber;
        this.personalNumberCheckDigit = ch;
        this.primaryIdentifier = primaryIdentifier;
        this.secondaryIdentifier = secondaryIdentifier;
        this.secondaryIdentifierComponents = secondaryIdentifierComponents;
        this.dg1EncodedData = dg1EncodedData;
        this.faceBitmap = bitmap;
        this.dg2EncodedData = str2;
        this.sodEncodedData = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.incode.welcome_sdk.results.NfcScanResult");
        NfcScanResult nfcScanResult = (NfcScanResult) obj;
        return this.resultCode == nfcScanResult.resultCode && Intrinsics.areEqual(this.error, nfcScanResult.error) && this.compositeCheckDigit == nfcScanResult.compositeCheckDigit && Intrinsics.areEqual(this.dateOfBirth, nfcScanResult.dateOfBirth) && this.dateOfBirthCheckDigit == nfcScanResult.dateOfBirthCheckDigit && Intrinsics.areEqual(this.dateOfExpiry, nfcScanResult.dateOfExpiry) && this.dateOfExpiryCheckDigit == nfcScanResult.dateOfExpiryCheckDigit && Intrinsics.areEqual(this.documentCode, nfcScanResult.documentCode) && Intrinsics.areEqual(this.documentNumber, nfcScanResult.documentNumber) && this.documentNumberCheckDigit == nfcScanResult.documentNumberCheckDigit && Intrinsics.areEqual(this.gender, nfcScanResult.gender) && Intrinsics.areEqual(this.issuingStateOrOrganization, nfcScanResult.issuingStateOrOrganization) && Intrinsics.areEqual(this.nationality, nfcScanResult.nationality) && Intrinsics.areEqual(this.optionalData1, nfcScanResult.optionalData1) && Intrinsics.areEqual(this.optionalData2, nfcScanResult.optionalData2) && Intrinsics.areEqual(this.personalNumber, nfcScanResult.personalNumber) && Intrinsics.areEqual(this.personalNumberCheckDigit, nfcScanResult.personalNumberCheckDigit) && Intrinsics.areEqual(this.primaryIdentifier, nfcScanResult.primaryIdentifier) && Intrinsics.areEqual(this.secondaryIdentifier, nfcScanResult.secondaryIdentifier) && Arrays.equals(this.secondaryIdentifierComponents, nfcScanResult.secondaryIdentifierComponents) && !this.dg1EncodedData.contentEquals(nfcScanResult.dg1EncodedData) && !StringsKt.contentEquals((CharSequence) this.dg2EncodedData, (CharSequence) nfcScanResult.dg2EncodedData) && Intrinsics.areEqual(this.faceBitmap, nfcScanResult.faceBitmap) && !StringsKt.contentEquals((CharSequence) this.sodEncodedData, (CharSequence) nfcScanResult.sodEncodedData);
    }

    public final int hashCode() {
        int iHashCode = this.resultCode.hashCode() * 31;
        Throwable th = this.error;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + Character.hashCode(this.compositeCheckDigit)) * 31) + this.dateOfBirth.hashCode()) * 31) + Character.hashCode(this.dateOfBirthCheckDigit)) * 31) + this.dateOfExpiry.hashCode()) * 31) + Character.hashCode(this.dateOfExpiryCheckDigit)) * 31) + this.documentCode.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + Character.hashCode(this.documentNumberCheckDigit)) * 31) + this.gender.hashCode()) * 31) + this.issuingStateOrOrganization.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.optionalData1.hashCode()) * 31;
        String str = this.optionalData2;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.personalNumber.hashCode()) * 31;
        Character ch = this.personalNumberCheckDigit;
        int iHashCode4 = (((((((((iHashCode3 + (ch != null ? ch.hashCode() : 0)) * 31) + this.primaryIdentifier.hashCode()) * 31) + this.secondaryIdentifier.hashCode()) * 31) + Arrays.hashCode(this.secondaryIdentifierComponents)) * 31) + this.dg1EncodedData.hashCode()) * 31;
        Bitmap bitmap = this.faceBitmap;
        int iHashCode5 = (iHashCode4 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        String str2 = this.dg2EncodedData;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sodEncodedData;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final JSONObject getDg1Json() throws JSONException {
        Object objValueOf;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        JSONObject jSONObject = new JSONObject();
        Object objValueOf2 = null;
        if (TextUtils.isEmpty(this.dateOfBirth)) {
            objValueOf = "";
        } else {
            Date date = simpleDateFormat.parse(this.dateOfBirth);
            objValueOf = date != null ? Long.valueOf(date.getTime()) : null;
        }
        jSONObject.put("birthDate", objValueOf);
        jSONObject.put("compositeCheckDigit", Character.valueOf(this.compositeCheckDigit));
        jSONObject.put("dateOfBirthCheckDigit", Character.valueOf(this.dateOfBirthCheckDigit));
        jSONObject.put("documentCode", this.documentCode);
        jSONObject.put("documentNumber", this.documentNumber);
        jSONObject.put("documentNumberCheckDigit", Character.valueOf(this.documentNumberCheckDigit));
        jSONObject.put("expirationDateCheckDigit", Character.valueOf(this.dateOfExpiryCheckDigit));
        if (TextUtils.isEmpty(this.dateOfExpiry)) {
            objValueOf2 = "";
        } else {
            Date date2 = simpleDateFormat.parse(this.dateOfExpiry);
            if (date2 != null) {
                objValueOf2 = Long.valueOf(date2.getTime());
            }
        }
        jSONObject.put("expireAt", objValueOf2);
        jSONObject.put(HintConstants.AUTOFILL_HINT_GENDER, this.gender);
        jSONObject.put("issuingStateOrOrganization", this.issuingStateOrOrganization);
        jSONObject.put("nationality", this.nationality);
        jSONObject.put("optionalData1", this.optionalData1);
        jSONObject.put("optionalData2", this.optionalData2);
        jSONObject.put("personalNumber", this.personalNumber);
        jSONObject.put("personalNumberCheckDigit", this.personalNumberCheckDigit);
        jSONObject.put("primaryIdentifier", this.primaryIdentifier);
        jSONObject.put("secondaryIdentifier", this.secondaryIdentifier);
        return jSONObject;
    }

    public final JSONObject getDg2Json() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Bitmap bitmap = this.faceBitmap;
        if (bitmap != null) {
            jSONObject.put("faceFromNFC", BitmapUtils.getBase64FromBitmap(bitmap));
        }
        return jSONObject;
    }
}
