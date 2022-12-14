package Final;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */


public class Main {
    public static void main(String[] args) {
        // Задаем параметры фильтра
        Filter filter = new Filter();
        filter.MinRamSize = 8;
        filter.Color = Color.Black;
        System.out.println("Фильтр:");
        System.out.println(filter);
        // Инициализируем коллекцию ноутбуков
        LaptopFilter lf = new LaptopFilter();
        // Выводим отфильтрованные
        System.out.println("Результаты:");
        System.out.println(lf.GetByFilter(filter));

    }
}
