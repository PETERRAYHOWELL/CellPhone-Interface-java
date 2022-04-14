//PETER RAY HOWELL ID 1917010879

package OOPLabTest;

public abstract class CellPhone
{
    protected String Model;
    protected String Network;
    protected float ScreenSize;
    protected float Price;

    //default
    public CellPhone()
    {
        Model = "";
        Network = "";
        ScreenSize = 0.0f;
        Price = 0.0f;
    }

    //primary
    public CellPhone(String model, String network, float screenSize, float price)
    {
        Model = model;
        Network = network;
        ScreenSize = screenSize;
        Price = price;
    }

    //copy
    public CellPhone(CellPhone cellPhone)
    {
        Model = cellPhone.Model;
        Network = cellPhone.Network;
        ScreenSize = cellPhone.ScreenSize;
        Price = cellPhone.Price;
    }

    //accessor
    public String getModel()
    {
        return Model;
    }

    public String getNetwork()
    {
        return Network;
    }

    public float getScreenSize()
    {
        return ScreenSize;
    }

    public float getPrice()
    {
        return Price;
    }

    //mutators
    public void setModel(String model)
    {
        Model = model;
    }

    public void setNetwork(String network)
    {
        Network = network;
    }

    public void setScreenSize(float screenSize)
    {
        ScreenSize = screenSize;
    }

    public void setPrice(float price)
    {
        Price = price;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "Model='" + Model + '\'' +
                ", Network='" + Network + '\'' +
                ", ScreenSize=" + ScreenSize +
                ", Price=" + Price +
                '}';
    }

    // public abstract void CalculateTotalCost(float); //declare an abstract method
       // public  abstract void CalculateTotalCost(float); //declare an abstract method

}
