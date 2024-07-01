import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
 * class Katalog
 * Создание Каталога
 * Инициализация и создание поисковых данных
 * поиск по каталогу
*/
public class Katalog {
    private static Set<Notebook> katalog = new HashSet<>();
    private static Map<String, List<Integer>> catalogRam = new HashMap<>();
    private static Map<String, List<Integer>> catalogStorage = new HashMap<>();
    private static Map<String, List<String>> catalogOs = new HashMap<>();
    private static Map<String, List<String>> catalogColor = new HashMap<>();

    /**
     * Статическая инициализация
     */
    static {
        initializeCatalog();
        initializeCatalogRam();
        initializeCatalogStorage();
        initializeCatalogOs();
        initializeCatalogColor();
    }

    /**
     * Инициализация всего каталога
     */
    private static void initializeCatalog() {
        katalog.add(new Notebook("Ноутбук DEXP Aquilon", 8, "SSD", 256, "Windows 11", "серебристый"));
        katalog.add(new Notebook("Ноутбук Chuwi GemiBook PLUS", 8, "SSD", 256, "Windows 11", "серый"));
        katalog.add(new Notebook("Ноутбук Lenovo IdeaPad 1 15IGL7", 8, "SSD", 256, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук DEXP Aquilon", 8, "SSD", 256, "Windows 11", "синий"));
        katalog.add(new Notebook("Ноутбук Lenovo IdeaPad 1 15IGL7", 4, "SSD", 128, "Windows 11", "серый"));
        katalog.add(new Notebook("Ноутбук Lenovo V15 G4 AMN", 8, "HDD", 256, "без ОС", "черный"));
        katalog.add(new Notebook("Ноутбук ASUS ExpertBook B1 B1502CGA-BQ0081", 4, "SSD", 128, "без ОС", "черный"));
        katalog.add(new Notebook("Ноутбук ASUS Laptop 14 E410KA-EK125W", 4, "SSD", 128, "Windows 11", "розовый"));
        katalog.add(new Notebook("Ноутбук ASUS Laptop 14 X415EA-EK608T", 4, "SSD", 256, "Windows 10", "серый"));
        katalog.add(new Notebook("Ноутбук ASUS Laptop 14 X415EA-EK608T", 4, "HDD", 1000, "Linux", "серый"));
        katalog.add(
                new Notebook("Ноутбук ASUS ExpertBook B1 B1400CEAE-EK2241R", 4, "HDD", 512, "Windows 10 Pro", "синий"));
        katalog.add(new Notebook("Ноутбук ASUS Laptop 15 X515EA-EJ905W", 4, "SSD", 256, "Windows 11", "серый"));
        katalog.add(new Notebook("Ноутбук Lenovo V15 G2 ITL", 4, "SSD", 256, "без ОС", "черный"));
        katalog.add(new Notebook("Ноутбук Lenovo V15 G2 ITL", 4, "HDD", 1000, "без ОС", "черный"));
        katalog.add(new Notebook("Ноутбук Lenovo V14 IML", 4, "HDD", 1000, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук Acer Aspire 3 A315-34-P7P9", 4, "SSD", 128, "Windows 11", "черный"));
        katalog.add(new Notebook("Ноутбук Lenovo IdeaPad 3 15ITL6", 4, "HDD", 1000, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук DEXP Aquilon", 8, "SSD", 256, "Windows 11 Home", "серебристый"));
        katalog.add(new Notebook("Ноутбук DEXP Aquilon C14-ICP301", 8, "SSD", 256, "Windows 11 Pro", "серебристый"));
        katalog.add(
                new Notebook("Ноутбук Chuwi GemiBook PLUS", 8, "SSD", 256, "Windows 11 Home Single Language", "серый"));
        katalog.add(new Notebook("Ноутбук Lenovo IdeaPad 1 15IGL7", 8, "SSD", 256, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук ASUS Vivobook Go 15 E1504GA-BQ521", 8, "SSD", 512, "без ОС", "серебристый"));

        katalog.add(new Notebook("Ноутбук ASUS Vivobook Go 15 E1504GA-BQ521", 8, "SSD", 512, "без ОС", "черный"));
        katalog.add(new Notebook("Ноутбук Infinix InBook Y2 PLUS XL29", 8, "SSD", 512, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук MAIBENBEN M543", 8, "SSD", 512, "без ОС", "серебристый"));
        katalog.add(new Notebook("Ноутбук Infinix InBook Y2 PLUS XL29", 8, "SSD", 256, "Windows 11 Home", "серый"));
        katalog.add(new Notebook("Ноутбук DEXP Atlas M15-A5W304", 8, "SSD", 256, "Windows 11 Home", "серый"));
        katalog.add(new Notebook("Ноутбук ASUS Vivobook Go 15 E1504GA-BQ241", 8, "SSD", 512, "без ОС", "серебристый"));
        katalog.add(new Notebook("Ноутбук MAIBENBEN M545", 8, "SSD", 256, "Windows 11 Home", "серебристый"));
        katalog.add(new Notebook("Ноутбук MAIBENBEN M545", 8, "SSD", 512, "Linux", "серебристый"));
        katalog.add(new Notebook("Ноутбук MAIBENBEN M553", 8, "SSD", 512, "Linux", "серебристый"));
        katalog.add(new Notebook("Ноутбук MAIBENBEN P415", 8, "SSD", 512, "Windows 11 Home", "серый"));
        katalog.add(new Notebook("Ноутбук Digma Pro Sprint M", 8, "SSD", 512, "Windows 11 Pro", "серый"));
        katalog.add(new Notebook("Ноутбук Lenovo IdeaPad Slim 3 15IAH8", 8, "SSD", 1000, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Pro", 8, "SSD", 1000, "macOS", "серый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Air", 8, "SSD", 512, "macOS", "серебристый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Pro", 18, "SSD", 512, "macOS", "черный"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Pro", 18, "SSD", 1000, "без ОС", "серебристый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Pro", 18, "SSD", 512, "macOS", "серебристый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Pro", 18, "SSD", 1000, "без ОС", "серый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Air", 24, "SSD", 512, "macOS", "серый"));
        katalog.add(new Notebook("Ноутбук HONOR MagicBook Pro 16", 24, "SSD", 1000, "без ОС", "фиолетовый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Air", 24, "SSD", 512, "без ОС", "серебристый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Pro", 24, "SSD", 512, "macOS", "серый"));
        katalog.add(new Notebook("Ноутбук Apple MacBook Air", 24, "SSD", 1000, "macOS", "серый"));
        katalog.add(new Notebook("Ноутбук ASUS VivoBook 16 X1605VA-MB74", 32, "SSD", 1000, "без ОС", "черный"));
        katalog.add(new Notebook("Ноутбук ASUS ZenBook 15 OLED UM3504DA-MA430W", 32, "SSD", 1000, "Windows 11 Home",
                "серый"));
        katalog.add(
                new Notebook("Ноутбук Acer Swift Go 16 SFG16-71-794Z", 32, "SSD", 1000, "Windows 11 Home", "серый"));
        katalog.add(new Notebook("Ультрабук ASUS Zenbook 14 OLED UX3405MA-PP051W", 32, "SSD", 1000, "Windows 11 Home",
                "синий"));
        katalog.add(new Notebook("Ультрабук ASUS Zenbook 14 OLED UX3405MA-PZ294W", 32, "SSD", 512, "Windows 11 Home",
                "синий"));

        katalog.add(new Notebook("Ноутбук ASUS ROG Zephyrus G14 GA402XV-N2084W", 32, "SSD", 1000,
                "Windows 11 Home Single Language", "серый"));
        katalog.add(
                new Notebook("Ноутбук MSI Summit E13 AI Evo A1MTG-021RU", 32, "SSD", 1000, "Windows 11 Pro", "черный"));
        katalog.add(
                new Notebook("Ноутбук ASUS ZenBook Pro 14 OLED UX6404VI-P1101X", 32, "SSD", 2000, "Windows 11 Home",
                        "черный"));
        katalog.add(new Notebook("Ноутбук ASUS Zenbook Duo 14 OLED UX8406MA-QL254W", 32, "SSD", 1000, "Windows 11 Home",
                "серый"));
        katalog.add(
                new Notebook("Ноутбук Machenike L16 Pro Supernova", 64, "SSD", 2000, "Windows 11 Pro", "серебристый"));
        katalog.add(new Notebook("Ноутбук Acer Predator Helios 18 PH18-72-94QH", 64, "SSD", 4000, "Windows 11 Home",
                "черный"));
        katalog.add(new Notebook("Ноутбук ASUS ROG Strix SCAR 18 G834JYR-R6149W", 64, "SSD", 2000, "Windows 11 Home",
                "черный"));
    }

    /**
     * @return получение каталога
     */
    public static Set<Notebook> getKatalog() {
        return katalog;
    }

    /**
     * @return получение каталога RAM
     */
    public static Map<String, List<Integer>> getCatalogRam() {
        return catalogRam;
    }

    /**
     * @return получение каталога Storage (объём памяти на накопителе цифрой)
     */
    public static Map<String, List<Integer>> getCatalogStorage() {
        return catalogStorage;
    }

    /**
     * @return получение каталога Операционных систем
     */
    public static Map<String, List<String>> getCatalogOs() {
        return catalogOs;
    }

    /**
     * @return получение каталога цветов ноутбуков
     */
    public static Map<String, List<String>> getCatalogColor() {
        return catalogColor;
    }

    /**
     * инициализация каталога RAM
     * выборка уникальных значений RAM
     * создание списка sortedRamList для сортировки
     * сортировка sortedRamList по возрастанию
     * добавление в каталог catalogRam списка с ключём "RAM" и значением
     * sortedRamList
     */
    private static void initializeCatalogRam() {
        Set<Integer> filterRam = new HashSet<>();

        for (Notebook ram : katalog) {
            filterRam.add(ram.getRam());
        }

        List<Integer> sortedRamList = new ArrayList<>(filterRam);
        Collections.sort(sortedRamList);
        catalogRam.put("RAM", sortedRamList);
    }

    /**
     * инициализация каталога Storage
     * выборка уникальных значений Storage
     * создание списка sortedStorageList для сортировки
     * сортировка sortedStorageList по возрастанию
     * добавление в каталог catalogStorage списка с ключём "Storage" и
     * значением sortedStorageList
     */
    private static void initializeCatalogStorage() {
        Set<Integer> filterStorage = new HashSet<>();

        for (Notebook storage : katalog) {
            filterStorage.add(storage.getStorage());
        }

        List<Integer> sortedStorageList = new ArrayList<>(filterStorage);
        Collections.sort(sortedStorageList);
        catalogStorage.put("Storage", sortedStorageList);
    }

    /**
     * инициализация каталога Os (Операционная система)
     * выборка уникальных значений Os
     * создание списка filterOsList
     * добавление в каталог catalogOs списка с ключём "Os" и
     * значением filterOsList
     */
    private static void initializeCatalogOs() {
        Set<String> filterOs = new HashSet<>();

        for (Notebook os : katalog) {
            filterOs.add(os.getOs());
        }

        List<String> filterOsList = new ArrayList<>(filterOs);
        catalogOs.put("Os", filterOsList);
    }

    /**
     * инициализация каталога Color (Цвет ноутбука)
     * выборка уникальных значений Color
     * создание списка filterColorList
     * добавление в каталог catalogColor списка с ключём "Color" и
     * значением filterColorList
     */
    private static void initializeCatalogColor() {
        Set<String> filterColor = new HashSet<>();

        for (Notebook color : katalog) {
            filterColor.add(color.getColor());
        }

        List<String> filterColorList = new ArrayList<>(filterColor);
        catalogColor.put("Color", filterColorList);
    }

    /**
     * Фильтрация Ram от минимального значения
     * 
     * @param minRam минимальное значение Ram
     * @return отсортированный по возрастанию список Ram
     */
    public static List<Notebook> filterRam(int minRam) {
        List<Notebook> filterRam = new ArrayList<>();

        for (Notebook ram : katalog) {
            if (ram.getRam() >= minRam) {
                filterRam.add(ram);
            }
        }

        filterRam.sort(Comparator.comparingInt(Notebook::getRam));
        return filterRam;
    }

    /**
     * Фильтрация Storage от минимального значения
     * 
     * @param minStorage минимальное значение Storage
     * @return отсортированный по возрастанию список Storage
     */
    public static List<Notebook> filterStorage(int minStorage) {
        List<Notebook> filterStorage = new ArrayList<>();

        for (Notebook notebook : katalog) {
            if (notebook.getStorage() >= minStorage) {
                filterStorage.add(notebook);
            }
        }

        filterStorage.sort(Comparator.comparingInt(Notebook::getStorage));
        return filterStorage;
    }

    /**
     * Фильтрация ноутов по Операционной системе
     * 
     * @param os заданное значение Операционной системы
     * @return список ноутбуков по заданному критерию
     */
    public static List<Notebook> filterOs(String os) {
        List<Notebook> filterOs = new ArrayList<>();

        for (Notebook notebook : katalog) {
            if (notebook.getOs().equals(os)) {
                filterOs.add(notebook);
            }
        }

        return filterOs;
    }

    /**
     * Фильтрация ноутов по цвету
     * 
     * @param color заданное значение цвета
     * @return список ноутбуков по заданному критерию
     */
    public static List<Notebook> filterColor(String color) {
        List<Notebook> filterColor = new ArrayList<>();

        for (Notebook clr : katalog) {
            if (clr.getColor().equals(color)) {
                filterColor.add(clr);
            }
        }

        return filterColor;
    }
}
