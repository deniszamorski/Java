package business;

public class purchareRequestLineItem {
	private int ID;
	private int purchaseRequestId;
	private int productId;
	private int quantity;
	
	public purchareRequestLineItem() {
	}

	public purchareRequestLineItem(int iD, int purchaseRequestId, int productId, int quantity) {
		super();
		ID = iD;
		this.purchaseRequestId = purchaseRequestId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPurchaseRequestId() {
		return purchaseRequestId;
	}

	public void setPurchaseRequestId(int purchaseRequestId) {
		this.purchaseRequestId = purchaseRequestId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "purchareRequestLineItem [ID=" + ID + ", purchaseRequestId=" + purchaseRequestId + ", productId="
				+ productId + ", quantity=" + quantity + "]";
	}
	
	
}
