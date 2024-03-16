package javaYouTube.interfaces;

public class CustomerManager {

/*1. yöntem bu
    ICustumerDal iCustumerDal;

    public void add(){
        //iş kodları yazılır
        iCustumerDal.add();

    }
 */
    private ICustumerDal iCustumerDal;

    public CustomerManager(ICustumerDal iCustumerDal){
        this.iCustumerDal=iCustumerDal;
    }

    public void add(){
        iCustumerDal.add();
    }

}
