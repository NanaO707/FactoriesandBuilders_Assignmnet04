class ModernHouseBuilder implements IBuild {

    private House house;
    private IBuild nextBuilder;

    ModernHouseBuilder() { house = new House();}

    ModernHouseBuilder(IBuild nextBuilder)
    {
        this.nextBuilder = nextBuilder;
    }
    @Override
    public void Build(String houseType) {
        if(houseType.equals("Modern")){
            System.out.println("Building a modern house");

        } else if (nextBuilder != null){
            nextBuilder.Build(houseType);
        }

    }

    public void BuildBasement () {house.setBasement(new BasementModern());}
    public void BuildInterior () {house.setInterior(new InteriorModern());}
    public void BuildStructure () {house.setStructure(new StructureModern());}

    public void BuildRoof(){house.setRoof(new RoofModern());}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }


}
