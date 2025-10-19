class QuebecoisHouseBuilder implements IBuild {
    private House house;

    QuebecoisHouseBuilder() { house = new House();}

    public void BuildBasement () {house.setBasement(basement);}
    public void BuildInterior () {house.setInterior(interior);}
    public void BuildStructure () {house.setStructure(structure);}

    public void BuildRoof(){house.setRoof(roof);}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
