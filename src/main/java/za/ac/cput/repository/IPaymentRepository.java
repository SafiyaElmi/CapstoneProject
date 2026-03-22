package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import java.util.List;

/*
IPaymentRepository.java
Payment repository
Author: Safiya Elmi
(240500598)
Date: 22/03/2026
*/

public interface IPaymentRepository extends IRepository<Payment, String> {
    List<Payment> getAll();
}