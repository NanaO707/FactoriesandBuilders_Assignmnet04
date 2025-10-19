class PersianHouseBuilder implements IBuild {
    private House house;

    PersianHouseBuilder() { house = new House();}

    public void BuildBasement () { house.setBasement(basement);}
    public void BuildInterior () {house.setInterior(interior);}
    public void BuildStructure () {house.setStructure(structure);}

    public void BuildRoof(){House.setRoof(roof);}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
