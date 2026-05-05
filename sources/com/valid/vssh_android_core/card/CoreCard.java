package com.valid.vssh_android_core.card;

import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.CardInformationModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.PayModel;
import com.valid.vssh_android_core.model.TransactionsModel;
import com.valid.vssh_android_core.model.response.CardAccountInfoResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.PayResponse;
import com.valid.vssh_android_core.model.response.TransactionsResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreCard {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    void cardAccountInfo(CardInformationModel cardInformationModel, CoreCardCallback coreCardCallback) throws CommunicationException;

    void cardAccountInfo(CardInformationModel cardInformationModel, LambdaSuccess<CardAccountInfoResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void getTransactions(TransactionsModel transactionsModel, CoreCardCallback coreCardCallback) throws CommunicationException;

    void getTransactions(TransactionsModel transactionsModel, LambdaSuccess<TransactionsResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void pay(PayModel payModel, CoreCardCallback coreCardCallback) throws CommunicationException;

    void pay(PayModel payModel, LambdaSuccess<PayResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;
}
