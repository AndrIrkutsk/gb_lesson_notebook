import java.util.Objects;

/**
 * Класс Notebook
 */
public class Notebook {
    private String name;
    private int ram;
    private String typeMemory;
    private int storage;
    private String os;
    private String color;

    /**
     * Создает новый экземпляр класса Notebook с указанными параметрами.
     *
     * @param name       название ноутбука
     * @param ram        объем оперативной памяти в гигабайтах
     * @param typeMemory тип памяти (например, SSD или HDD)
     * @param storage    объем памяти в гигабайтах
     * @param os         операционная система
     * @param color      цвет ноутбука
     */
    public Notebook(String name, int ram, String typeMemory, int storage, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.typeMemory = typeMemory;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    /**
     * @return название ноутбука
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return объем оперативной памяти (цифрой)
     */
    public int getRam() {
        return this.ram;
    }

    /**
     * @return тип памяти (SSD или HDD)
     */
    public String getTypeMemory() {
        return this.typeMemory;
    }

    /**
     * @return объём памяти на накопителе (цифрой)
     */
    public int getStorage() {
        return this.storage;
    }

    /**
     * @return Операционная система ноутбука
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return цвет ноутбука
     */
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Notebook notebook = (Notebook) o;
        return this.ram == notebook.ram &&
                this.storage == notebook.storage &&
                Objects.equals(this.name, notebook.name) &&
                Objects.equals(this.typeMemory, notebook.typeMemory) &&
                Objects.equals(this.os, notebook.os) &&
                Objects.equals(this.color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.ram, this.typeMemory, this.storage, this.os, this.color);
    }

    /**
     * Возвращает строковое представление объекта Notebook.
     *
     * @return строковое представление объекта Notebook
     */
    @Override
    public String toString() {
        return this.name +
                ", RAM: " + this.ram + " Гб" +
                ", память: " + this.typeMemory + " " + this.storage + " Гб" +
                ", Операционная система: " + this.os +
                ", цвет: " + this.color;
    }
}