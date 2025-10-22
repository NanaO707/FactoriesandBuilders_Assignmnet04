class QuebecoisHouseBuilder implements IBuild {
    private House house;
    private IBuild nextBuilder;

    QuebecoisHouseBuilder() { house = new House();}

    QuebecoisHouseBuilder(IBuild nextBuilder)
    {
        this.nextBuilder = nextBuilder;
    }

    @Override
    public void Build(String houseType) {
        if(houseType.equals("Quebecois")){
            System.out.println("Building a quebecois house");

        } else if (nextBuilder != null){
            nextBuilder.Build(houseType);
        }

    }

    public void BuildBasement () {house.setBasement(new BasementQuebecois());}
    public void BuildInterior () {house.setInterior(new InteriorQuebecois());}
    public void BuildStructure () {house.setStructure(new StructureQuebecois());}

    public void BuildRoof(){house.setRoof(new RoofQuebecois());}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
