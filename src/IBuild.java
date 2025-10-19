public interface IBuild {

    //no params
    void BuildBasement();
    void BuildStructure();
    void BuildInterior();
    void BuildRoof();

    Duplex GetDuplex();

    House GetHouse();
}
