package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса: работу с клиентами и их счетами
 */
public class BankService {

    /**
     * Для хранения базы счетов используется словарь {@code HashMap}
     * ключ словаря - клиент {@code User}, значение - список счетов {@code Account}, хранимый в {@code List}}
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента в базу клиентов
     * @param user клиента, которого нужно добавить в базу
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод ищет и возвращает клиента по номеру паспорта
     * @param passport паспортные данные для поиска клиента
     * @return возвращает клиента или {@code null} если клиент не найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод привязывает счет к клиенту, найденному по введенному паспорту
     * @param passport паспортные данные для поиска клиента
     * @param account счет для привязки к клиенту
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод находит счет клиента по паспортным данным и реквизитам счета
     * @param passport паспортные данные для поиска клиента
     * @param requisite реквизиты счет для поиска счета
     * @return возвращает клиента или {@code null} если клиент не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод реализует перевод средств из одного счета на другой счет
     * @param srcPassport паспортные данные отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport паспортные данные получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount сумма перевода
     * @return возвращает клиента {@code true} если перевод успешно совершен
     * (если счета найдены и остатка средств на счету отправителя достаточно)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src == null || dest == null || src.getBalance() < amount) {
            return false;
        }
        src.setBalance(src.getBalance() - amount);
        dest.setBalance(dest.getBalance() + amount);
        return true;
    }
}
