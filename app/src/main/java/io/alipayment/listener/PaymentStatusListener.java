package io.alipayment.listener;


import io.alipayment.entity.TransactionResponse;

public interface PaymentStatusListener {
    void onTransactionCompleted(TransactionResponse transactionDetails);
    void onTransactionSuccess(TransactionResponse transactionDetails);
    void onTransactionSubmitted();
    void onTransactionFailed();
    void onTransactionCancelled();
}
