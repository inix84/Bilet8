package заданиеСтрока;

public class Main {
    public static void main(String[] args) {
        String test = "Почему то попалась одна и та же задача, разделить строчку, поэтому я скопировала ее и чуть подредактировала :)";
        int size = test.length();
        System.out.println(size);
        String test1 = test.substring(0,size/2);
        String test2 = test.substring(size/2,size);
        System.out.println("Начальная строка  ---> "+test);
        System.out.println("Разделенная на две части: ");
        System.out.println("первая половина строки ---> "+test1);
        System.out.println("вторая половина строки ---> "+test2);
    }
}