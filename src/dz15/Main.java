package dz15;

public class Main
{
    // Поле BankApplication
    private BankApplication bankApplication = new BankApplication();

    static public void main(String[] args) {
        /*
            Викликати метод processWrapper з наступними параметрами:
            id = accountId000, amount 50, currency USD
            id = accountId003, amount 250, currency HRV
            id = accountId001, amount 50, currency EUR
            id = accountId001, amount 50, currency USD
            id = accountId001, amount 200, currency USD
         */
        // Some changes

        Main main = new Main();

        main.processWrapper("accountId000", 50, "USD");
        main.processWrapper("accountId003", 250, "HRV");
        main.processWrapper("accountId001", 50, "EUR");
        main.processWrapper("accountId001", 50, "USD");
        main.processWrapper("accountId001", 2000, "USD");
    }

    // Метод processWrapper(String, int, String)

    public void processWrapper(String accountId, int amount, String currency) {
        try {
            bankApplication.process(accountId, amount, currency);
        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
}