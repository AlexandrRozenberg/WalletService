package com.example.walletservice.service;


/**
 * Интерфейс AuditService отвечает за выполнение операций аудита системы кошелька.
 */
public interface AuditService {

    /**
     * Записывает информацию об аутентификации пользователя в журнал аудита.
     * @param username Имя пользователя
     */
    void logAuthentication(String username);


    /**
     * Записывает информацию о выходе пользователя из системы в журнал аудита.
     * @param username Имя пользователя
     */
    void logLogout(String username);


    /**
     * Записывает информацию о транзакции пользователя в журнал аудита.
     * @param username Имя пользователя
     * @param transactionType Тип транзакции
     * @param amount Сумма транзакции
     */
    void logTransaction(String username, String transactionType, double amount);

    /**
     * Выводит на консоль аудитовые записи.
     */
    void printAuditLogs();
}
