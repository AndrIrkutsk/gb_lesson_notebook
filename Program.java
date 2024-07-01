import java.util.List;
import java.util.Map;

/**
 * Точка входа
 */
public class Program {

    public static void main(String[] args) {
        InteractionUser getSearch = new InteractionUser();
        int getCategorySearch = getSearch.getCategorySearch();

        /**
         * Получение категории поиска (цифры ввода)
         */
        switch (getCategorySearch) {
            case 1:
                // Получение цифры выбора RAM
                int numRam = getSearch.getRamSearch();
                Map<String, List<Integer>> getRamList = Katalog.getCatalogRam();
                List<Integer> ramValues = getRamList.get("RAM");
                // Получение отсортированого списка от минимального значения RAM
                List<Notebook> enterRamUser = Katalog.filterRam(ramValues.get(numRam - 1));
                printResult(enterRamUser);
                break;
            case 2:
                int numStorage = getSearch.getStorageSearch();
                Map<String, List<Integer>> getStorageList = Katalog.getCatalogStorage();
                List<Integer> storageValues = getStorageList.get("Storage");
                List<Notebook> enterStorageUser = Katalog.filterStorage(storageValues.get(numStorage - 1));
                printResult(enterStorageUser);
                break;
            case 3:
                int numOs = getSearch.getOsSearch();
                Map<String, List<String>> getOsList = Katalog.getCatalogOs();
                List<String> osValues = getOsList.get("Os");
                List<Notebook> enterOsUser = Katalog.filterOs(osValues.get(numOs - 1));
                printResult(enterOsUser);
                break;
            case 4:
                int numColor = getSearch.getColorSearch();
                Map<String, List<String>> getColorList = Katalog.getCatalogColor();
                List<String> colorValues = getColorList.get("Color");
                List<Notebook> enterColorUser = Katalog.filterColor(colorValues.get(numColor - 1));
                printResult(enterColorUser);
                break;
            default:
                System.out.println("Выход из системы.");
        }
        getSearch.closeScanner();
    }

    /**
     * Печать результата
     */
    public static void printResult(List<Notebook> listResult) {
        for (Notebook res : listResult) {
            System.out.println(res);
        }
    }

}
