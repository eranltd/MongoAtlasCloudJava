package Models;

public class VMProduct {

	
    /*******************************/

	private String productDescription;

    public String getproductDescription()
    {
        return productDescription;
    }

    public void setproductDescription(String prdDesc)
    {
    	this.productDescription = prdDesc;
    }
    
    /********************************/
    
    
	private VMProductType productType;

    public VMProductType getproductType()
    {
        return productType;
    }

    public void setproductType(VMProductType productType)
    {
    	this.productType = productType;
    }
    
	
}
