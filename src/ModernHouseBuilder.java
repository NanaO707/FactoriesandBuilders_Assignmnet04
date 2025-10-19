class ModernHouseBuilder implements IBuild {

    private House house;

    ModernHouseBuilder() { house = new House();}

    public void BuildBasement (IBasement basement) {house.setBasement(basement);}
    public void BuildInterior (IStructure interior) {house.setInterior(interior);}
    public void BuildStructure (IInterior structure) {house.setStructure(structure);}

    public void BuildRoof(IRoof roof){house.setRoof(roof);}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
