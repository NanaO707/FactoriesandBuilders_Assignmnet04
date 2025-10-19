class Engineer {
    IBuild iBuilder;

    Engineer(IBuild iBuilder)
    {
        this.iBuilder = iBuilder;
    }

    void CreateDuplex() //design pattern
    {
        iBuilder.BuildBasement();
        iBuilder.BuildStructure();
        iBuilder.BuildInterior();
        iBuilder.BuildRoof();
    }

    void CreateHouse() //design pattern
    {
        iBuilder.BuildBasement();
        iBuilder.BuildStructure();
        iBuilder.BuildInterior();
        iBuilder.BuildRoof();
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

