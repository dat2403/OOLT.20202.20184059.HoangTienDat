/*
public class TestPassingParameter {
    
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new  DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        WrapperDVD wrdvd1 = new WrapperDVD(jungleDVD);
        WrapperDVD wrdvd2 = new WrapperDVD(cinderellaDVD);
        
        swapDVDbyWrap(wrdvd1, wrdvd2);
        System.out.println("jungle dvd title: " + wrdvd1.dvd.getTitle());
        System.out.println("cinderella dvd title: " + wrdvd2.dvd.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    
    public static void swapDVDbyWrap(WrapperDVD wrdvd1, WrapperDVD wrdvd2) { //remember to rewrite (use wrapper or not, i don't know)
        DigitalVideoDisc tmp = wrdvd1.dvd;
        wrdvd1.dvd = wrdvd2.dvd;
        wrdvd2.dvd = tmp;
    }
    
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }    
}
*/


public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new  DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
   
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
