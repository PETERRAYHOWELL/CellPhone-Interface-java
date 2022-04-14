//PETER RAY HOWELL ID 1917010879

package OOPLabTest;

public class Iphone extends CellPhone implements Samsung
{
    private String IsWaterProof;
    private String HasStylus;

    //default
    public Iphone(String isWaterProof, String hasStylus)
    {
        super();
        IsWaterProof = isWaterProof;
        HasStylus = hasStylus;
    }
    //primary
    public Iphone(String model, String network, float screenSize, float price, String isWaterProof, String hasStylus)
    {
        super(model, network, screenSize, price);
        IsWaterProof = isWaterProof;
        HasStylus = hasStylus;
    }
    //copy
    public Iphone(Iphone iphone)
    {
        super(iphone.Model, iphone.Network, iphone.ScreenSize,iphone.Price);
       IsWaterProof = iphone.IsWaterProof;
       HasStylus = iphone.HasStylus;
    }

    //Accessor
    public String getIsWaterProof() {
        return IsWaterProof;
    }

    @Override
    public String getHasStylus() {
        return HasStylus;
    }

    //mutators
    public void setIsWaterProof(String isWaterProof)
    {
        IsWaterProof = isWaterProof;
    }

    @Override
    public void setHasStylus(String hasStylus)
    {
        HasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "Model='" + Model + '\'' +
                ", Network='" + Network + '\'' +
                ", ScreenSize=" + ScreenSize +
                ", Price=" + Price +
                ", IsWaterProof='" + IsWaterProof + '\'' +
                ", HasStylus='" + HasStylus + '\'' +
                '}';
    }

   /* public void CalculateTotalCost(float iphone)
    {
        price * 16.5/100;
    }
    public  void CalculateTotalCost(float Samsung)
    {
        price * 16.5/100;
    }*/
}
