package Study.Chapter7;


public class aa {
    public static void main(String[] args){
        new aa();
    }
    public aa(){
        for(int i=1;i<=20;i++){
            System.out.println(function(i));
        }
    }
    public int function(int su){
        if(su == 1 || su == 2){
            return 1;
        }else{
            return function(su-2)+function(su-1);
        }
    }
}


