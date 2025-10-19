public interface IBuild {

    void BuildBasement(IBasement basement);
    void BuildStructure(IInterior structure);
    void BuildInterior(IStructure interior);
    void BuildRoof(IRoof roof);

    Duplex GetDuplex();

    House GetHouse();
}
