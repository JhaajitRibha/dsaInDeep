package striverDsaSheet.ArraysPartOne.twoPascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class NthRowPascalTriangle {
    public List<Integer> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        outerList.add(innerList);
        if(numRows==0){
            return outerList.get(0);
        }
        for(int i=1;i<numRows;i++){
            List<Integer> innerLists = new ArrayList<>();
            innerLists.add(1);
            for(int j=1;j<outerList.get(i-1).size();j++){
                innerLists.add(outerList.get(i-1).get(j-1)+outerList.get(i-1).get(j));
            }
            innerLists.add(1);
            outerList.add(innerLists);
            if(numRows-1==i){
                return outerList.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        List<Integer>  res = new NthRowPascalTriangle().generate(4);
        res.stream().forEach(x-> System.out.print(x + " "));
    }
}
