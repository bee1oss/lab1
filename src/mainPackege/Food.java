package mainPackege;

public abstract class Food implements Consumable{ //abstract soyutlama.“implements”, “interface” uygulamak için kullanılan terimdir.
    private String name;

    public String getName(){
        return name;
    }

    public Food(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Food)){ //Java instanceof operatörü herhangi bir nesnenin belirtilen türe ait olup, olmadığını öğrenmek için kullanılır
            return false;
        }
        else if (name == null || ((Food)obj).name == null){  // имя не задано
            return false;
        }
        return name.equals(((Food)obj).name);
    }
}