package GeeksForGeeksSelfPaced.String.Videos.subsequenceOfString;

import java.util.ArrayList;

public class sosA1 {

    public static boolean isSubstring(String string,String substring){
        ArrayList<String> storage = new ArrayList<>();
        storage.add("");

        for(char ch:string.toCharArray()){
            int size = storage.size();
            for(int i=0;i<size;i++){
                String temp = storage.get(i)+ch;

                if(temp.equals(substring)){
                    return true;
                }
                storage.add(temp);
            }
        }

        storage.stream().forEach(e-> System.out.println(e));
        return false;
    }
    public static void main(String[] args) {

        boolean res = isSubstring("geeksforgeeks","kkk");
        System.out.println(res);
    }
}
