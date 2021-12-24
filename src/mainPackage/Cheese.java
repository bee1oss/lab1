package mainPackage;
                            //nasledevaniya
public class Cheese extends Food {//extends kullanınımı sınıfların birbirlerini miras/kalıtım(inheritance) olarak kullanımında yer almaktadır.

        public Cheese(){
            super ("Сыр");
        }//üst-sınıfa ait bir nesne constructor yerine geçer

        public void consume(){
            System.out.println(this + " съеден");
        }
}
