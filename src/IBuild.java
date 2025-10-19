public interface IBuild {

    void BuildBasement();
    void BuildStructure();
    void BuildInterior();
    void BuildRoof();

    Duplex GetDuplex();

    House GetHouse();
}
