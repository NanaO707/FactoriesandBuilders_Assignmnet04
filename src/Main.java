
 public class Main {
    public static void main(String[] args) {

       ModernDuplexBuilder modernDuplexBuilder = new ModernDuplexBuilder();
        Engineer engineer = new Engineer(modernDuplexBuilder);
        engineer.CreateDuplex();
        engineer.GetDuplex().DisplayDuplex();

        PersianDuplexBuilder persianDuplexBuilder = new PersianDuplexBuilder();
        Engineer engineer2 = new Engineer(persianDuplexBuilder);
        engineer2.CreateDuplex();
        engineer2.GetDuplex().DisplayDuplex();

       QuebecoisDuplexBuilder quebecoisDuplexBuilder = new QuebecoisDuplexBuilder();
        Engineer engineer3 = new Engineer(quebecoisDuplexBuilder);
        engineer3.CreateDuplex();
        engineer3.GetDuplex().DisplayDuplex();

       ModernHouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        Engineer engineer4 = new Engineer(modernHouseBuilder);
        engineer4.CreateHouse();
        engineer4.GetHouse().DisplayHouse();

       PersianHouseBuilder persianHouseBuilder = new PersianHouseBuilder();
        Engineer engineer5 = new Engineer(persianHouseBuilder);
        engineer5.CreateHouse();
        engineer5.GetHouse().DisplayHouse();

        QuebecoisHouseBuilder  quebecoisHouseBuilder = new  QuebecoisHouseBuilder();
        Engineer engineer6 = new Engineer(quebecoisHouseBuilder);
        engineer6.CreateHouse();
        engineer6.GetHouse().DisplayHouse();

        IBuild modernHouseBuilder1 = new ModernHouseBuilder(null);
        IBuild quebecoisHouseBuilder1 = new QuebecoisHouseBuilder(modernHouseBuilder1);
        IBuild persianHouseBuilder1 = new PersianHouseBuilder(quebecoisHouseBuilder1);



        //Initiate the request
        persianHouseBuilder.Build("Persian");
        persianHouseBuilder.Build("Quebecois");
        persianHouseBuilder.Build("Modern");




    }
}