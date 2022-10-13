public class program {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        String[] filesArray = HW2.GetFiles(dir);
        HW2.Task1(filesArray);
        System.out.println("Список файлов текущего каталога сохранен.");
        HW2.Task2(filesArray);
    }
}
