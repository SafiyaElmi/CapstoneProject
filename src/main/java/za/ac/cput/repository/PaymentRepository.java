package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

/*
PaymentRepository.java
Payment repository
Author: Safiya Elmi
(240500598)
Date: 22/03/2026
*/

public class PaymentRepository implements IPaymentRepository {

    private static IPaymentRepository repository = null;
    private List<Payment> paymentList;

    private PaymentRepository() {
        paymentList = new ArrayList<>();
    }

    public static IPaymentRepository getRepository() {
        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }

    @Override
    public Payment create(Payment payment) {
        boolean success = paymentList.add(payment);
        if (success) {
            return payment;
        }
        return null;
    }

    @Override
    public Payment read(String paymentRef) {
        for (Payment payment : paymentList) {
            if (payment.getPaymentRef().equals(paymentRef)) {
                return payment;
            }
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        String paymentRef = payment.getPaymentRef();
        Payment oldPayment = read(paymentRef);

        if (oldPayment == null) {
            return null;
        }

        boolean success = paymentList.remove(oldPayment);
        if (success) {
            if (paymentList.add(payment)) {
                return payment;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String paymentRef) {
        Payment paymentToDelete = read(paymentRef);

        if (paymentToDelete == null) {
            return false;
        }

        return paymentList.remove(paymentToDelete);
    }

    @Override
    public List<Payment> getAll() {
        return paymentList;
    }
}