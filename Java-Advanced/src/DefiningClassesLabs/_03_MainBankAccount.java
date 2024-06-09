package DefiningClassesLabs;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _03_MainBankAccount {
    private static final Map<Integer, _03_BankAccount> BANK = new HashMap<>();
    private static final BiFunction<Integer, Map<Integer, _03_BankAccount>, Optional<_03_BankAccount>>
            GET_ACCOUNT = (i, m) -> m.containsKey(i)
            ? Optional.of(m.get(i))
            : Optional.empty();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String output = executeCommand(command).apply(tokens);

            if (output != null) {
                System.out.println(output);
            }

            input = scanner.nextLine();
        }
    }

    public static String executeBankOperation(_03_BankAccount account,
                                              int value,
                                              BiFunction<_03_BankAccount, Integer, String>
                                                      operateAndReturn) {
        if (account == null) {
            return "Account does not exist";
        }

        return operateAndReturn.apply(account, value);
    }

    public static String executeBankOperation() {
        return "Account does not exist";
    }

    public static Function<String[], String> executeCommand(String command) {
        return switch (command) {
            case "Create" -> _03_MainBankAccount::create;
            case "Deposit" -> _03_MainBankAccount::deposit;
            case "SetInterest" -> _03_MainBankAccount::setInterest;
            case "GetInterest" -> _03_MainBankAccount::getInterest;
            default -> throw new IllegalArgumentException("Unknown command " + command);
        };
    }


    public static String create(String[] tokens) {
        _03_BankAccount account = new _03_BankAccount();
        BANK.put(account.getId(), account);
        return "Account ID" + account.getId() + " created";
    }

    public static String deposit(String[] tokens) {
        int id = Integer.parseInt(tokens[1]);
        int amount = Integer.parseInt(tokens[2]);
        Optional<_03_BankAccount> account = GET_ACCOUNT.apply(id, BANK);
        return account.isEmpty()
                ? executeBankOperation()
                : executeBankOperation(account.get(), amount, (b, a) -> {
            b.deposit(a);
            return String.format("Deposited %d to ID%d", a, b.getId());
        });
    }

    public static String setInterest(String[] tokens) {
        double interest = Double.parseDouble(tokens[1]);
        _03_BankAccount.setInterestRate(interest);
        return null;
    }

    private static String getInterest(String[] tokens) {
        int id = Integer.parseInt(tokens[1]);
        int years = Integer.parseInt(tokens[2]);
        Optional<_03_BankAccount> account = GET_ACCOUNT.apply(id, BANK);
        return account.isEmpty()
                ? executeBankOperation()
                : executeBankOperation(account.get(), years,
                (a, y) -> String.format("%.2f", a.getInterest(y)));
    }
}
