package springass1.onlineshopping;

public class ProductDetailsClass {

	String productname,productsize,productcolor,productquantity,productprice;
	
	
	
	public  ProductDetailsClass(String productname,String productsize,String productcolor,String productprice,String productquantity)
	  {
		this.productname=productname;
	    this.productsize=productsize;
	    this.productcolor=productcolor;
	    this.productquantity=productquantity;
	    this.productprice=productprice;
      }



	public ProductDetailsClass() {
		
		// TODO Auto-generated constructor stub
	}

	public String getProductname() {
		return productname;
	}

	@Override
	public String toString() {
		return "ProductDetailsClass [productname=" + productname + ", productsize=" + productsize + ", productcolor="
				+ productcolor + ", productquantity=" + productquantity + ", productprice=" + productprice + "]";
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductsize() {
		return productsize;
	}

	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}

	public String getProductcolor() {
		return productcolor;
	}

	public void setProductcolor(String productcolor) {
		this.productcolor = productcolor;
	}

	public String getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
}
