class Engineer {
    IBuild iBuilder;

    Engineer(IBuild iBuilder)
    {
        this.iBuilder = iBuilder;
    }

    void CreateDuplex() //design pattern
    {
        iBuilder.BuildBasement(basement);
        iBuilder.BuildStructure(structure);
        iBuilder.BuildInterior(interior);
        iBuilder.BuildRoof(roof);
    }

    void CreateHouse() //design pattern
    {
        iBuilder.BuildBasement(basement);
        iBuilder.BuildStructure(structure);
        iBuilder.BuildInterior(interior);
        iBuilder.BuildRoof(roof);
    }

    Duplex GetDuplex()
    {
        return iBuilder.GetDuplex();
    }

    House GetHouse()
    {
        return iBuilder.GetHouse();
    }


}

