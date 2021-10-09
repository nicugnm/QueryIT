package ro.nicolaemariusghergu.backend.service.impl;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.CashRegister;
import ro.nicolaemariusghergu.backend.model.data.TypePay;
import ro.nicolaemariusghergu.backend.model.data.TypeStatus;
import ro.nicolaemariusghergu.backend.repository.CashRegisterRepository;
import ro.nicolaemariusghergu.backend.service.CashRegisterService;

import java.util.Optional;

@Service
public record CashRegisterServiceImpl(CashRegisterRepository cashRegisterRepository) implements CashRegisterService {

    @Override
    public Optional<CashRegister> findById(Long id) {
        return cashRegisterRepository.findById(id);
    }

    @Override
    public Optional<CashRegister> findByNumber(Integer number) {
        return cashRegisterRepository.findByNumber(number);
    }

    @Override
    public Optional<CashRegister> findCasaMarcatByTypeStatus(TypeStatus typeStatus) {
        return cashRegisterRepository.findCasaMarcatByTypeStatus(typeStatus);
    }

    @Override
    public Optional<CashRegister> findCasaMarcatByTypePay(TypePay typePay) {
        return cashRegisterRepository.findCasaMarcatByTypePay(typePay);
    }

    @Override
    public Optional<CashRegister> findCasaMarcatByTypeStatusAndTypePay(TypeStatus typeStatus, TypePay typePay) {
        return cashRegisterRepository.findCasaMarcatByTypeStatusAndTypePay(typeStatus, typePay);
    }
}
