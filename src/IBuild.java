public interface IBuild {

    void Build(String houseType);


    //no params
    void BuildBasement();
    void BuildStructure();
    void BuildInterior();
    void BuildRoof();

    Duplex GetDuplex();

    House GetHouse();

}
