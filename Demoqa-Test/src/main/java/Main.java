public class Main {

    public static void main(String[] args){


        //Testlerimizin gerçekleşeceği app sınıfından bir nesne oluşturarak main sınıfında bunları çalıştırdık
        demoqaApp app = new demoqaApp();
        app.moveToElementsPage();
        app.moveToWebTablesPage();
        app.checkSearchBox();

    }
}
