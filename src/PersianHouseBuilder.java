class PersianHouseBuilder implements IBuild {
    private House house;
    private IBuild nextBuilder;


    PersianHouseBuilder() { house = new House();}

    PersianHouseBuilder(IBuild nextBuilder)
    {
        this.nextBuilder = nextBuilder;
    }

    @Override
    public void Build(String houseType) {
        if(houseType.equals("Persian")){
            System.out.println("Building a persian house");

        } else if (nextBuilder != null){
            nextBuilder.Build(houseType);
        }


    }

    public void BuildBasement () {house.setBasement(new BasementPersian());}
    public void BuildInterior () {house.setInterior(new InteriorPersian());}
    public void BuildStructure () {house.setStructure(new StructurePersian());}

    public void BuildRoof(){house.setRoof(new RoofPersian());}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }


}
