class House {
    private IBasement basement;
    private IInterior interior;
    private IStructure structure;
    private IRoof roof;

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
    void setInterior(IInterior interior)
    {
        this.interior = interior;
    }
    void setStructure(IStructure structure) {this.structure = structure;}
    void setRoof(IRoof roof){this.roof = roof;}



    void DisplayHouse()
    {
        System.out.println("House with: ");
        System.out.println("Basement: " +  getBasement());
        System.out.println("Structure: " + getStructure());
        System.out.println("Interior: " + getInterior());
        System.out.println("Roof: " + getRoof());

    }

}
