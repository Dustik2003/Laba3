import animals.*;

public class Main {
    public static void main(String[] args) {
        Donkey ia= new Donkey(Colors.RED,"ИА",10);
        Bear puh= new Bear(Colors.BLUE,"ПУХ",10,"Другой берег");
        Pig pyatachok= new Pig(Colors.GREEN,"Пятачок",10);
        System.out.println("Сегодня день рождения "+ia.getName());
        System.out.println("ИА "+ia.getAge()+" лет");
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
        ia.grow();
        System.out.println("ИА "+ia.getAge()+" лет");
        ia.talk("Подумать только! "+ia.getFavclr()+"... Мой любимый цвет");
        pyatachok.feel(new Feels[]{Feels.LOST, Feels.WORRIED});
        pyatachok.talk("(ಠ_ಠ) (ಠ_ಠ) (ಠ_ಠ) ");
        System.out.println("***Объект класса "+ puh.getClass()+" с именем "+puh.getName()+" расположен по месту "+puh.getLocation()+"***");
        puh.talkTo("ЭЭЭЭЭЙЙ, я на другом берегу, какие у вас хеш-кооооды?", pyatachok, ia);
        pyatachok.talk("У меня "+pyatachok.hashCode());
        ia.talk("У меня "+ia.hashCode());
        puh.talk("А у меня "+puh.hashCode());
        System.out.println("\n\n");
        System.out.println(puh);
        System.out.println(pyatachok);
        System.out.println(ia);
    }
}