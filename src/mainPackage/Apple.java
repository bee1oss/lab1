package mainPackage;

public class Apple extends  Food{

    @Override // явное переопределение метода
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        } else if (size == null || ((Apple) obj).size == null) {  // размер не задан
            return false;
        }
        else if (!(size.equals(((Apple) obj).size))) {
            return false;
        }
        return super.equals(obj);
    }

    private String size;//Yeni dahili veri alanı SIZE

    public String getSize(){
        return size;
    } //get alan size icin polya

    public Apple(String size){
        //konstrukter cagirip ata
        super ("Яблоко");
        //elmanin size ni belirlemek
        this.size = size;
    }

    public void consume(){
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
