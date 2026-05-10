package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

/*
PaymentFactory.java
Payment factory class
Author: Safiya Elmi
(240500598)
Date: 11 May 2026
*/

public class PaymentFactory {

    public static Payment createPayment(String paymentRef, double amount, String paymentDate, String paymentMethod,
                                        String status, String transactionId, String bookingId) {

        if (Helper.isNullOrEmpty(paymentRef)) {
            throw new IllegalArgumentException("Payment reference cannot be empty");
        }

        if (Helper.isNullOrEmpty(paymentMethod)) {
            throw new IllegalArgumentException("Payment method cannot be empty");
        }

        if (Helper.isNullOrEmpty(transactionId)) {
            throw new IllegalArgumentException("Transaction ID cannot be empty");
        }

        if (Helper.isNullOrEmpty(bookingId)) {
            throw new IllegalArgumentException("Booking ID cannot be empty");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }

        return new Payment.Builder()
                .setPaymentRef(paymentRef)
                .setAmount(amount)
                .setPaymentDate(paymentDate)
                .setPaymentMethod(paymentMethod)
                .setStatus(status)
                .setTransactionId(transactionId)
                .setBookingId(bookingId)

                .build();
    }
}
