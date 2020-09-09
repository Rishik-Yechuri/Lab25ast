public class SemiTruck extends Truck {
    private int mpg;
    private int numOfWheels;
    private HugeDieselTank dieselTank;

    public SemiTruck(int mpg, int numOfWheels) {
        super(20000, true);
        dieselTank = new HugeDieselTank(50, "steel");
        boolean isPremium = dieselTank.isTankPremium();
        this.mpg = mpg;
        this.numOfWheels = numOfWheels;
    }
}

class HugeDieselTank {
    private int numOfGallons;
    private String constructionMaterial;

    public HugeDieselTank(int numOfGallons, String constructionMaterial) {
        this.numOfGallons = numOfGallons;
        this.constructionMaterial = constructionMaterial;
    }

    public boolean isTankPremium() {
        if (numOfGallons >= 150 && constructionMaterial.equals("steel")) {
            return true;
        }
        return false;
    }
}

