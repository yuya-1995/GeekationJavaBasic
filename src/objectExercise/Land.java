package objectExercise;

public class Land extends Property {
	
	// 広さ
	private double landExtent;

	Land(String propertyNm, String propertyOwnerNm, String propertyShubetsu, int propertyPrice, double landExtent) {
		super(propertyNm, propertyOwnerNm, propertyShubetsu, propertyPrice);
		this.landExtent = landExtent;
	}
	
	// 出力
	public void output() {
		System.out.println("=============================");
		System.out.println("物件名："+ this.getPropertyNm());
		System.out.println("物件所有者名："+ this.getPropertyOwnerNm());
		System.out.println("物件種別："+ this.getPropertyShubetsu());
		System.out.println("物件価格："+ this.getPropertyPrice() + "円");
		System.out.println("広さ："+ this.getLandExtent() + "㎡");
		System.out.println("=============================");
	}
	
	// 広さのゲッター
    public double getLandExtent() {
        return this.landExtent;
    }
    
    // 間取りのセッター
    public void setLandExtent(double landExtent) {
        this.landExtent = landExtent;
    }

}
