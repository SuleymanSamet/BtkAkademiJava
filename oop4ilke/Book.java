package oop4ilke;

public class Book {
    private String name;
    private int pageNumber;
    //dışardan herkes erişmesi için public
    public Book(String name,int pageNumber){
        this.name=name;
        if (pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }
    public int showPageNumber(){
        return this.pageNumber;
    }
    public void changePageNumber(int pageNumber){
        if (pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }
    //privet bir değişkeni getirmek için alttaki metot kullanılır ona da getter methodu denir
    //getirmek olarak kalsın
    public String getName(){//get olarak isimlendirilir camelCase kullanarak yazılır baş harfi büyük
        return this.name;
    }
    //altaki de setter methodu değiştirir camelCase ile set yazılır
    public void setName(String name){
        this.name=name;
    }
}
