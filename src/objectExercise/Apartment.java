package objectExercise;

public class Apartment extends Property {
	
	// 間取り
	private String apartmentLayout;

	Apartment(String propertyNm, String propertyOwnerNm, String propertyShubetsu, int propertyPrice, String apartmentLayout) {
		super(propertyNm, propertyOwnerNm, propertyShubetsu, propertyPrice);
		this.apartmentLayout = apartmentLayout;
	}
	
	// 出力
	public void output() {
		System.out.println("=============================");
		System.out.println("物件名："+ this.getPropertyNm());
		System.out.println("物件所有者名："+ this.getPropertyOwnerNm());
		System.out.println("物件種別："+ this.getPropertyShubetsu());
		System.out.println("物件価格："+ this.getPropertyPrice() + "円");
		System.out.println("間取り："+ this.getApartmentLayout());
		System.out.println("=============================");
	}
	
	// 間取りのゲッター
    public String getApartmentLayout() {
        return this.apartmentLayout;
    }
    
    // 間取りのセッター
    public void setApartmentLayout(String apartmentLayout) {
        this.apartmentLayout = apartmentLayout;
    }

}
