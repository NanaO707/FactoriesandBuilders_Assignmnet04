class Duplex {
    IBasement basement;
    IInterior interior;
    IStructure structure;
    IRoof roof;

    IBasement getBasement()
    {
        return basement;
    }
    IInterior getStructure()
    {
        return interior;
    }
    IStructure getInterior()
    {
        return structure;
    }
    IRoof getRoof(){return roof ;}

    void setBasement(IBasement basement)
    {
        this.basement = basement;
    }
    void setStructure(IInterior interior)
    {
        this.interior = interior;
    }
    void setInterior(IStructure structure) {this.structure = structure;}
    static void setRoof(IRoof roof){this.roof = roof;}



    void DisplayDuplex()
    {
        System.out.println("Duplex with: ");
        System.out.println("Basement: " +  getBasement());
        System.out.println("Structure: " + getStructure());
        System.out.println("Interior: " + getInterior());
        System.out.println("Roof: " + getRoof());

    }

}



