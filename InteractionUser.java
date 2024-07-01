import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * class InteractionUser для взаимодействия с пользователем
 * предоставление данных пользователю
 * получение валидных данных от пользователя в виде цифры
 */
public class InteractionUser {
    private Scanner scanner;

    /**
     * Конструктор для инициализации Scanner
     */
    public InteractionUser() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Первый запрос
     * Выбор критерия поиска
     */
    public int getCategorySearch() {
        this.scanner = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println(
                "Добро пожаловать в наш магазин ноутбуков, введите цифру для выбора из нашего каталога, где: ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем памяти");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        this.defaultPrintEndRequest();

        return this.validInputUser(1, 4);
    }

    /**
     * Предоставление списка RAM (Оперативная память)
     * Получение цифры выбора RAM
     * отправка ввода на валидацию (диапазон, число)
     * 
     * @return цифра выбора RAM
     */
    public int getRamSearch() {
        this.scanner = new Scanner(System.in);

        Map<String, List<Integer>> getRamList = Katalog.getCatalogRam();
        List<Integer> ramValues = getRamList.get("RAM");

        System.out.println("Доступные значения RAM, введите цифру для выбора минимального значения: ");

        for (int i = 1; i < ramValues.size() + 1; i++) {
            System.out.printf("%d - RAM %d ГБ" + System.lineSeparator(), i, ramValues.get(i - 1));
        }

        this.defaultPrintEndRequest();

        return this.validInputUser(1, ramValues.size());
    }

    /**
     * Предоставление списка Storage (Объём накопителя)
     * Получение цифры выбора Storage
     * отправка ввода на валидацию (диапазон, число)
     * 
     * @return цифра выбора Storage
     */
    public int getStorageSearch() {
        this.scanner = new Scanner(System.in);
        Map<String, List<Integer>> getStorageList = Katalog.getCatalogStorage();
        List<Integer> storageValues = getStorageList.get("Storage");

        System.out.println("Поиск по объёму памяти, введите цифру для выбора минимального значения: ");

        for (int i = 1; i < storageValues.size() + 1; i++) {
            System.out.printf("%d - %s Гб" + System.lineSeparator(), i, storageValues.get(i
                    - 1));
        }

        this.defaultPrintEndRequest();

        return this.validInputUser(1, storageValues.size());
    }

    /**
     * Предоставление списка Os (Операционная система)
     * Получение цифры выбора Os
     * отправка ввода на валидацию (диапазон, число)
     * 
     * @return цифра выбора Os
     */
    public int getOsSearch() {
        this.scanner = new Scanner(System.in);
        Map<String, List<String>> getOsList = Katalog.getCatalogOs();
        List<String> osValues = getOsList.get("Os");

        System.out.println("Поиск по Операционной системе, введите цифру для выбора значения: ");

        for (int i = 1; i < osValues.size() + 1; i++) {
            System.out.printf("%d - %s" + System.lineSeparator(), i, osValues.get(i
                    - 1));
        }

        this.defaultPrintEndRequest();

        return this.validInputUser(1, osValues.size());
    }

    /**
     * Предоставление списка Color (Цвет ноутбука)
     * Получение цифры выбора Color
     * отправка ввода на валидацию (диапазон, число)
     * 
     * @return цифра выбора Color
     */
    public int getColorSearch() {
        this.scanner = new Scanner(System.in);
        Map<String, List<String>> getColorList = Katalog.getCatalogColor();
        List<String> colorValues = getColorList.get("Color");

        System.out.println("Поиск по цвету, введите цифру для выбора значения: ");

        for (int i = 1; i < colorValues.size() + 1; i++) {
            System.out.printf("%d - %s" + System.lineSeparator(), i, colorValues.get(i
                    - 1));
        }

        this.defaultPrintEndRequest();

        return this.validInputUser(1, colorValues.size());
    }

    /**
     * Валидация введённого значения пользователем на число и
     * в диапзоне:
     * 
     * @param rangeStart нижний диапазон
     * @param rangeEnd   верхний диапазон
     * @return валидная цифра в диапазоне
     */
    private int validInputUser(int rangeStart, int rangeEnd) {
        int inputNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            if (this.scanner.hasNextInt()) {
                inputNumber = this.scanner.nextInt();

                System.out.println("---------");

                if (inputNumber >= rangeStart && inputNumber <= rangeEnd) {
                    validInput = true;
                } else {
                    System.out.println("Ошибка: введите число в диапазоне от " + rangeStart + " до " + rangeEnd + ".");
                }
            } else {
                String input = this.scanner.next();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("До свидания!");
                    System.exit(0); // Завершает выполнение программы
                } else {
                    System.out.println("Ошибка: введено не число. Пожалуйста, введите число от " + rangeStart + " до "
                            + rangeEnd + ".");
                }
            }
        }

        return inputNumber;
    }

    private void defaultPrintEndRequest() {
        System.out.println("---");
        System.out.println("q - выйти");
        System.out.println("---");
        System.out.print("Ваш ввод: ");
    }

    /**
     * Закрытие Scanner
     */
    public void closeScanner() {
        this.scanner.close();
    }
}
