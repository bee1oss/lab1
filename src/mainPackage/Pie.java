package mainPackage;

public class Pie extends Food {
    @Override // явное переопределение метода
    public boolean equals(Object obj) {
        if (!(obj instanceof Pie)){ // instanceof belirtilen nesnesin herhangi birture ait olup olmadigini kontrol eder
            return false;
        }
        if (fill == null || ((Pie)obj).fill == null){ //null bir degiskenin hicbir deger tutmamasini ifade eder fill ile dolulugunu kontrol ediyoruz
            return false;
        }
        if(!(fill.equals(((Pie) obj).fill))){
            return false;
        }

        return super.equals(obj);
    }

    private String fill;

    public String getFilling(){
        return fill;
    }

    public void setFilling(String fill){
        this.fill = fill;
    }

    public Pie(String fill){
        super ("Пирог");
        this.fill = fill;
    }

    public void consume(){
        System.out.println(this + " съеден");
    }

    @Override
    public String toString() {
        return super.toString() + " c начинкой '" + fill.toUpperCase() + "'";
    }

}
