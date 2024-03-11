package objectExercise;

public class Property {
	
	// 物件名
	private String propertyNm;
	
	// 物件所有者名
	private String propertyOwnerNm;
	
	// 物件種別
	private String propertyShubetsu;
	
	// 物件価格
	private int propertyPrice;
	
	Property(String propertyNm, String propertyOwnerNm, String propertyShubetsu, int propertyPrice){
		this.propertyNm = propertyNm;
		this.propertyOwnerNm = propertyOwnerNm;
		this.propertyShubetsu = propertyShubetsu;
		this.propertyPrice = propertyPrice;
	}
	
	// 物件名のゲッター
    public String getPropertyNm() {
        return this.propertyNm;
    }
    
    // 物件名のセッター
    public void setPropertyNm(String propertyNm) {
        this.propertyNm = propertyNm;
    }
    
    // 物件所有者名のゲッター
    public String getPropertyOwnerNm() {
        return this.propertyOwnerNm;
    }
    
    // 物件所有者名のセッター
    public void setPropertyOwnerNm(String propertyOwnerNm) {
        this.propertyOwnerNm = propertyOwnerNm;
    }
    
    // 物件種別のゲッター
    public String getPropertyShubetsu() {
        return this.propertyShubetsu;
    }
    
    // 物件種別のセッター
    public void setPropertyShubetsu(String propertyShubetsu) {
        this.propertyShubetsu = propertyShubetsu;
    }
    
    // 物件価格のゲッター
    public int getPropertyPrice() {
        return this.propertyPrice;
    }
    
    // 物件価格のセッター
    public void setPropertyPrice(int propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

}
