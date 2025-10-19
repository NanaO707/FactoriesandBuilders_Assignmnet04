class ModernHouseBuilder implements IBuild {

    private House house;

    ModernHouseBuilder() { house = new House();}

    public void BuildBasement () {house.setBasement(basement);}
    public void BuildInterior () {house.setInterior(interior);}
    public void BuildStructure () {house.setStructure(structure);}

    public void BuildRoof(){house.setRoof(house.roof);}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
