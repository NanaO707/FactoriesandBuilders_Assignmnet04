class Engineer {
    IBuilder IBuild;

    Engineer(IBuilder IBuild)
    {
        this.IBuild = IBuild;
    }

    void createDuplex() //design pattern
    {
        IBuild.buildBasement();
        IBuild.buildStructure();
        IBuild.buildInterior();
        IBuild.buildRoof();
    }

    Duplex GetDuplex()
    {
        return IBuild.GetDuplex();
    }


}

